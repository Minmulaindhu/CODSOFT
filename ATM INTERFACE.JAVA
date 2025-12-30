                                                 ATM INTERFACE

import java.util.Scanner;

class ATM {
    private double balance = 1000.0; // Initial balance
    private int pin = 1234;

    public void start() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin != pin) {
            System.out.println("Incorrect PIN. Access denied.");
            return;
        }

        int choice;
        do {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(sc);
                    break;
                case 3:
                    withdraw(sc);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (choice != 4);

        sc.close();
    }

    private void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    private void deposit(Scanner sc) {
        System.out.print("Enter amount to deposit: ₹");
        double amount = sc.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    private void withdraw(Scanner sc) {
        System.out.print("Enter amount to withdraw: ₹");
        double amount = sc.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Please collect your cash.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

public class ATMInterface {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.start();
    }
}
