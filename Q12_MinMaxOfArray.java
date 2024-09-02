package M6_Assignment;

import java.util.Scanner;

public class Q12_MinMaxOfArray {
	
	public static void main(String[] args) {
		
//Q-12 WAP to find the maximum and minimum value of an array.
		
		System.out.println("enter size = ");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int b[] = new int[s];	
		
		for(int in=0;in<b.length;in++) {
			System.out.println("Enter value of array at b["+in+"] : ");
			b[in] = sc.nextInt();
		}
		int max=b[0];
		int min=b[0];
		for(int h=0;h<s;h++) {
			if(max<b[h])
				max=b[h];
			if(min>b[h])
				min=b[h];
		}
		System.out.println("Maximum Element of Array : "+max);
		System.out.println("Minimum Element of Array : "+min);

	}

}
