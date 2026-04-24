package AssignmentPackage;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are ELIGIBLE to Vote");
        } else {
            System.out.println("You are NOT eligible to Vote");
            System.out.println("Wait " + (18 - age) + " more year(s)");
        }
    }
}
