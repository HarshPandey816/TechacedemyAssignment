package AssignmentDay2;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.INR to USD\n2.INR to EUR");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount in INR: ");
        double amt = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("USD: " + (amt / 83));
                break;
            case 2:
                System.out.println("EUR: " + (amt / 90));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
