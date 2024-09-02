package M6_Assignment;

import java.util.Scanner;

public class Q10_AverrageOfArray {

	public static void main(String[] args) {
		
// Q-10 WAP to calculate the average value of array elements. 

		Scanner sc = new Scanner(System.in);		 
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int a[] = new int[size];
 
        System.out.println("Enter array values :  ");
        for (int i = 0; i < size; i++) {
            int value = sc.nextInt();
            a[i] = value; 
        }
        
        int length = a.length;	
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        } 
        double average = sum/length; 
        System.out.println("Average of array elements : " + average);	 
    }
	}

	
		


