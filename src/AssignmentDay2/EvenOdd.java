package AssignmentDay2;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Number: ");
            int num = sc.nextInt();

            switch (num % 2) {
                case 0:
                    System.out.println(num + " is Even");
                    break;
                case 1:
                    System.out.println(num + " is Odd");
                    break;
            }
        }
    }
}