import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        
        bank.addUser(new User("Freshu", "8484", 3500));
        bank.addUser(new User("AUC", "6801", 10000));
        bank.addUser(new User("Dodo", "4200", 5000));
        bank.addUser(new User("Mino", "7878", 1500));

        System.out.println("\nWelcome to the ATM!");
        System.out.print("\nEnter User ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();
        System.out.print("\n");

        User currentUser = bank.authenticateUser(userId, pin);
        if (currentUser != null) {
            ATM atm = new ATM(currentUser, scanner);
            atm.start();
        } else {
            System.out.println("Invalid credentials. Exiting.");
        }

        scanner.close();
    }
}
