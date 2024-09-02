package M6_Assignment;

import java.util.Scanner;

public class Q04_PrimeNumber {
	public static void main(String[] args) {
		
//Q-4 W.A.J.P to check given number is Prime or not?
		
		System.out.println("enter any number = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		
		if (n%2 ==1 && n/n==1) {
			System.out.println(n + " is prime number ");
		} else {
			System.out.println(n + " is not prime number ");
		}
	}
}
