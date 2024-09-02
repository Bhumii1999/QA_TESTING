package M6_Assignment;

import java.util.Scanner;

public class Q09_SumOfAray {
	public static void main(String[] args) {
		
// Q-9 WAP to sum values of an array.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size = ");
		int size = sc.nextInt();
		int a[] = new int[size];
		
		for(int index=0;index<a.length;index++) {
			System.out.print("enter element at a["+index+"] : ");
			a[index] = sc.nextInt();
		}
		int sum =0;
		for(int index=0;index<a.length;index++) {
			 sum=sum+a[index];
			 System.out.println("sum of elements is  : "+sum);
		}
		
	}
		
	}

