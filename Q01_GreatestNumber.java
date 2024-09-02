package M6_Assignment;

import java.util.Scanner;

public class Q01_GreatestNumber {
	public static void main(String[] args) {
		
//Q-1 W.A.J.P to Take three numbers from the user and print the greatest number.
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any three numbers"); 
	System.out.println("Enter num1 : ");
	int num1=sc.nextInt();
	
	System.out.println("Enter num2 : ");
	int num2=sc.nextInt();
	
	System.out.println("Enter num3 : ");
	int num3=sc.nextInt(); 
			
	if(num1>num2 && num1>num3) {
		System.out.println("greatest number is = "+num1);			
	} else if (num2>num1 && num2>num3) {
		System.out.println("greatest number is = "+num2);
	} else if (num3>num1 && num3>num2) {
		System.out.println("greatest number is = "+num3);
	} else {
		System.out.println("invalid input");
	}		
	System.out.println(" ");
	

}
}
