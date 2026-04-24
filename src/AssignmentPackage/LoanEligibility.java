package AssignmentPackage;

import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
        System.out.print("Enter your Monthly Salary: ");
        double salary = sc.nextDouble();

        if (age >= 21 && age <= 60 && salary >= 25000) {
            System.out.println("You are ELIGIBLE for a Loan");
        } else if (age < 21 || age > 60) {
            System.out.println("NOT Eligible: Age must be between 21 and 60");
        } else {
            System.out.println("NOT Eligible: Salary must be at least 25000");
        }
    }
}
