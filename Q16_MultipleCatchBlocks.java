package M6_Assignment;

import java.util.Scanner;

public class Q16_MultipleCatchBlocks {
	
	public static void main(String[] args) {
		
// Q-14 W.A.P to demonstrate multiple catch blocks.
		
		try {	
		System.out.println("Enter n1 = ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		System.out.println("Enter n2 = ");
		int n2 = sc.nextInt();
		
		int n3 = n1/n2;  //divide by 0
		System.out.println(n3);			
		} 
		catch (ArithmeticException e) {		
			System.out.println(e);	
		} catch (Exception a) {
			System.out.println("other exception is" + a);
		}			
}
	}


