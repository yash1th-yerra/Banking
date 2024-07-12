# Email Management Application

## Overview

This Java application allows for the management of email accounts, providing functionalities to create and manage email accounts with features such as setting mailbox capacity, setting an alternate email, and changing the password. It demonstrates basic object-oriented programming principles and user input handling in Java.

## Features

- **Create Email Accounts**: Allows users to create an email account with a randomly generated password.
- **Set Mailbox Capacity**: Users can set a custom mailbox capacity.
- **Set Alternative Email**: Users can set an alternative email address.
- **Change Password**: Users can change the email account password.

## Requirements

- Java 8 or higher

## Setup

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/yash1th-yerra/EmailAdminApp.git
Navigate to the Project Directory:

bash
Copy code
cd your-repo
Compile the Java Files:

Ensure you have Java installed. Compile the Java files using:

bash
Copy code
javac -d bin src/com/basicjavaapplications/admin/*.java
Run the Application:

Execute the EmailApp class to start the application:

bash
Copy code
java -cp bin com.basicjavaapplications.admin.EmailApp
Usage
Enter First and Last Name:

When prompted, enter the first and last names of the user.
Set Mailbox Capacity:

Choose whether to set a custom mailbox capacity. If yes, enter the desired capacity.
Set Alternative Email:

Choose whether to set an alternative email address. If yes, enter the alternative email.
Change Password:

Choose whether to set a new password. If yes, enter the new password.
Code Structure
Email.java: Defines the Email class with attributes for managing email details and methods for setting mailbox capacity, alternative email, and password.
EmailContext.java: Provides a factory method to create instances of the Email class.
EmailApp.java: Contains the main method to interact with the user and manage email account operations.
Contributing
Fork the Repository: Create a fork of the repository on GitHub.
Create a Branch: Create a new branch for your changes.
bash
Copy code
git checkout -b feature-branch
Make Changes: Implement your changes or add new features.
Commit Changes: Commit your changes with descriptive messages.
bash
Copy code
git add .
git commit -m "Description of changes"
Push Changes: Push your changes to your forked repository.
bash
Copy code
git push origin feature-branch
Create a Pull Request: Open a pull request on the original repository to merge your changes.
