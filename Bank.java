package ATM_Interface_AUC;

import java.util.HashMap;

public class Bank {
    private static HashMap<String, User> users = new HashMap<>();

    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    public User authenticateUser(String userId, String pin) {
        User user = users.get(userId);
        if (user != null && user.authenticate(pin)) {
            return user;
        }
        return null;
    }

    public static boolean transfer(User sender, String recipientId, double amount) {
        User recipient = users.get(recipientId);
        if (recipient != null && sender.withdraw(amount)) {
            recipient.deposit(amount);
            sender.addTransaction("Transfer to " + recipientId, amount);
            recipient.addTransaction("Transfer from " + sender.getId(), amount);
            return true;
        }
        return false;
    }
}
