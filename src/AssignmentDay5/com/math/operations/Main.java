package AssignmentDay5.com.math.operations;

import AssignmentDay5.com.math.operations.MathOperations;

public class Main {
	public static void main(String[] args) {

        // 1. Math Operations
        MathOperations m = new MathOperations();
        System.out.println("Addition: " + m.add(10, 5));
        System.out.println("Subtraction: " + m.subtract(10, 5));

        // 2. Bank
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = (Bank) new ICICI();

        System.out.println("SBI Interest: " + b1.getInterestRate());
        System.out.println("HDFC Interest: " + b2.getInterestRate());
        System.out.println("ICICI Interest: " + b3.getInterestRate());

        // 3. Calculator
        Calculator calc = new CalculatorImp1();
        System.out.println("Division: " + ((Calculator) calc).divide(10, 2));
        System.out.println("Division (error): " + ((Calculator) calc).divide(10, 0));
    }

}
