package AssignmentPackage;

import java.util.Scanner;

public class LagestofTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Enter First Number: ");

	        int num1 = sc.nextInt();
	     
	        System.out.print("Enter Second Number: ");
	        
	        int num2 = sc.nextInt();
	        
	        if(num1>num2) {
	        	System.out.println("First Number: "+num1 + " is Larger");
	        	
	        }
	        else {
	        	System.out.println("Second Number: "+ num2 + " is larger.");
	        }
	}

}
