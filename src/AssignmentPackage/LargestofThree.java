package AssignmentPackage;

import java.util.Scanner;

public class LargestofThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Enter First Number: ");

	        int num1 = sc.nextInt();
	        
	     System.out.print("Enter Second Number: ");

	        int num2 = sc.nextInt();
	        
	     System.out.print("Enter Third Number: ");

	        int num3 = sc.nextInt();
	        
	     if(num1>num2 & num1>num3) {
	    	 System.out.print(num1+" is largest of Three Number.");
	     }
	     
	     else if(num2>num1 & num2>num3) {
	    	 System.out.print(num2+" is largest of three number.");
	     }
	     else {
	    	 System.out.print(num3+" is largest of Three Number.");
	     }
	}

}
