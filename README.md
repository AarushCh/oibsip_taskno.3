# oibsip_taskno.2

# 𝐀𝐈𝐂𝐓𝐄 𝐎𝐈𝐁-𝐒𝐈𝐏 𝐍𝐨𝐯𝐞𝐦𝐛𝐞𝐫 - 𝐏𝟏 𝐏𝐑𝐎𝐉𝐄𝐂𝐓 𝐒𝐔𝐁𝐌𝐈𝐒𝐒𝐈𝐎𝐍 𝐅𝐎𝐑𝐌 - Task 02
The ATM Interface is a Java-based console application designed to simulate the functionalities of an ATM system. The project allows users to perform core banking operations such as withdrawing, depositing, transferring money, viewing transaction history, and checking account balance. The system supports a secure login process, requiring user credentials for authentication. Once logged in, users can interact with a simple menu-driven interface to carry out their banking activities. This project uses object-oriented programming principles to manage user accounts, transactions, and operations in a secure and efficient manner. It demonstrates key Java concepts such as classes, methods, data handling, and exception management, while simulating a real-world banking environment.

## Files And Their Detailed Description -
### User.java
Manages user details such as user ID, pin, balance, and transaction history. It handles deposit, withdrawal, transfer, and transaction logging functionalities.

### Bank.java
Represents the central bank system where multiple user accounts are stored. It handles authentication, adding users, and managing transactions between accounts.

### ATM.java
Handles all ATM functionalities, including user login, displaying the ATM menu, processing transactions like withdrawals, deposits, transfers, and balance viewing. It interfaces with the User and Bank classes to perform actions on the user accounts.

### Main.java
Serves as the entry point for the application. It initializes the ATM system, authenticates users, and facilitates interaction with the menu-driven ATM interface, providing an easy-to-use console-based environment for users.

### Transaction.java
Represents a single transaction in the ATM system, such as a withdrawal, deposit, or transfer. It stores details like the transaction type, amount, date, and the associated user. This class helps in tracking and managing user transaction history, ensuring proper record-keeping for all financial activities.

## Future Enhancements
Integrate a database (such as MySQL or SQLite) for persistent storage of user data and transaction history.
Implement a graphical user interface (GUI) using Java Swing or JavaFX for a more user-friendly experience.
Add enhanced security features, such as encryption for user PIN and session management.
Allow multi-language support to cater to a global audience.

# Developed By Ch Aarush Udbhav
