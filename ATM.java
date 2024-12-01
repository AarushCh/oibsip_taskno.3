import java.util.Scanner;

public class ATM {
    private User user;
    private Scanner scanner;

    public ATM(User user, Scanner scanner) {
        this.user = user;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. View Balance");
            System.out.println("6. Quit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showTransactionHistory();
                case 2 -> withdraw();
                case 3 -> deposit();
                case 4 -> transfer();
                case 5 -> viewBalance();
                case 6 -> {
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }

    private void showTransactionHistory() {
        System.out.println("\nTransaction History:");
        for (Transaction t : user.getTransactions()) {
            System.out.println(t);
        }
    }

    private void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = getValidAmount();
        if (user.withdraw(amount)) {
            System.out.println("Withdrawal successful. Your new balance is $" + user.getBalance());
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    private void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = getValidAmount();
        user.deposit(amount);
        System.out.println("Deposit successful. Your new balance is $" + user.getBalance());
    }

    private void transfer() {
        System.out.print("Enter recipient User ID: ");
        scanner.nextLine(); // Consume the newline character
        String recipientId = scanner.nextLine();
        
        System.out.print("Enter amount to transfer: ");
        double amount = getValidAmount();

        if (Bank.transfer(user, recipientId, amount)) {
            System.out.println("Transfer successful.");
        } else {
            System.out.println("Transfer failed. Please check the recipient ID or your balance.");
        }
    }

    private void viewBalance() {
        System.out.println("Your current balance is: $" + user.getBalance());
    }

    private double getValidAmount() {
        double amount = 0.0;
        boolean valid = false;
        while (!valid) {
            try {
                amount = scanner.nextDouble();
                if (amount <= 0) {
                    System.out.print("Amount must be greater than zero. Please try again: ");
                } else {
                    valid = true;
                }
            } catch (Exception e) {
                System.out.print("Invalid input. Please enter a valid number: ");
                scanner.nextLine(); // Consume the invalid input
            }
        }
        return amount;
    }
}
