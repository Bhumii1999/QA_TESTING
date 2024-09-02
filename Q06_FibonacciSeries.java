package M6_Assignment;

import java.util.Scanner;

public class Q06_FibonacciSeries {
	public static void main(String[] args) {

//Q-6 W.A.J.P for create Fibonacci Series.
		System.out.println("Enter any number = ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n1 = 0,
			n2 = 1,
			n3;
		
		System.out.print(n1 + " " + n2 + " ");
		for (int b=1; b<=num; b++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
            System.out.print(n3 + " ");            
		}
	}

}
