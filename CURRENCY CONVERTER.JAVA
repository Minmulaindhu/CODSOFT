                                                 CURRENCY CONVERTER

import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Currency Converter ===");
        System.out.println("1. INR to USD");
        System.out.println("2. INR to EUR");
        System.out.println("3. INR to GBP");
        System.out.print("Choose an option: ");

        int choice = sc.nextInt();

        System.out.print("Enter amount in INR: ");
        double inr = sc.nextDouble();
        double result;

        switch (choice) {
            case 1:
                result = inr * 0.012; // INR to USD
                System.out.println("USD: " + result);
                break;

            case 2:
                result = inr * 0.011; // INR to EUR
                System.out.println("EUR: " + result);
                break;

            case 3:
                result = inr * 0.0095; // INR to GBP
                System.out.println("GBP: " + result);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
