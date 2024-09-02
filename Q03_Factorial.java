package M6_Assignment;

import java.util.Scanner;

public class Q03_Factorial {
	public static void main(String[] args) {
		
//Q-3 W.A.J.P to find factorial for Given Number.
		
		Scanner sc = new Scanner(System.in);
		int fact=1;
	    System.out.print("Enter any number : ");
		int number = sc.nextInt();
	    for(int d=1; d<=number; d++) {
		fact = fact*d;
		}
		System.out.println("Factorial of " + number + " = " +fact);		
	}

}
