package M6_Assignment;

import java.util.Scanner;

public class Q24_SecondLargestElementInArray {
	public static void main(String[] args) {
		
//Q-24 WAP to find the second largest element in an array.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size = ");
		int size = sc.nextInt();
		int a[] = new int[size];
		
		for(int index=0;index<a.length;index++) {
			System.out.print("enter element at a["+index+"] : ");
			a[index] = sc.nextInt();
		}
		
		
	}

}
