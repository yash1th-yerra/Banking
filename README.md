# Banking Application

This is a simple banking application developed using Java. The project demonstrates basic banking operations like checking balance, depositing, withdrawing, viewing transaction history, and calculating interest.

## Packages and Classes

### Package: `com.simplejavaprojects.banking`

- **`Banking`**: The main class that initiates the application. It reads user input for name, password, and ID, and then provides access to the appropriate account through the `Factory` class.
  
- **`Factory`**: A factory class that returns an `AccountInterface` implementation based on user credentials.

- **`Account`**: Implements the `AccountInterface`. This class handles various banking operations such as deposit, withdraw, view previous transactions, and calculate interest.

- **`AccountInterface`**: An interface defining the methods for basic banking operations.

## How to Run the Application

1. **Clone the Repository**
   ```sh
   git clone [<your-repo-url>](https://github.com/yash1th-yerra/Basic-Java-Applications)
   cd Banking-App
Compile the Java Files

```sh
javac -d bin src/com/simplejavaprojects/banking/*.java
/```

Run the Application

```sh
java -cp bin com.simplejavaprojects.banking.Banking



Features
Check Balance: View the current balance of the account.
Deposit: Add a specified amount to the account balance.
Withdraw: Deduct a specified amount from the account balance.
Mini Statement: View the last transaction made.
Calculate Interest: Calculate the interest accrued over a specified number of years.
Exit: Exit the application.


Banking-App/
│
├── src/
│   └── com/
│       └── simplejavaprojects/
│           └── banking/
│               ├── Account.java
│               ├── AccountInterface.java
│               ├── Banking.java
│               └── Factory.java
│
├── bin/ (Compiled classes will be here)
│
└── README.md


Contributing
Feel free to fork this project, make your changes, and submit a pull request. Please make sure your code follows the existing code style and includes proper documentation.

License
This project is licensed under the MIT License - see the LICENSE file for details.

go
This `README.md` file provides a comprehensive overview of your Java Banking project, including the package structure, classes, features, and instructions for running the application.





