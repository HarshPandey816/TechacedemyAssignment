package AssignmentDay2;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int i = 2;
        boolean isPrime = true;

        while (i <= n / 2) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }

        if (n <= 1) isPrime = false;

        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}