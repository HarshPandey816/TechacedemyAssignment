package AssignmentPackage;

import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(num + " is a Positive Number");
        } else if (num < 0) {
            System.out.println(num + " is a Negative Number");
        } else {
            System.out.println("The number is Zero");
        }
    }
}
