import java.util.Scanner;

public class M6_Corejava {
	public static void main(String[] args) {
		
////	Q-1 W.A.J.P to Take three numbers from the user and print the greatest number.
//		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any three numbers");
//		System.out.println("Enter num1 : ");
//		int num1=sc.nextInt();
//		
//		System.out.println("Enter num2 : ");
//		int num2=sc.nextInt();
//		
//		System.out.println("Enter num3 : ");
//		int num3=sc.nextInt();
//				
//		if(num1>num2 && num1>num3) {
//			System.out.println("greatest number is = "+num1);			
//		} else if (num2>num1 && num2>num3) {
//			System.out.println("greatest number is = "+num2);
//		} else if (num3>num1 && num3>num2) {
//			System.out.println("greatest number is = "+num3);
//		} else {
//			System.out.println("invalid input");
//		}		
//		System.out.println(" ");
//		
////Q-2 W.A.J.P in Java to display the first 10 natural numbers using while loop.
//		
//		int i=1;
//			while(i<=10) {
//				System.out.println("First 10 natural number : "+i);
//				i++;
//		}
//		System.out.println(" ");
//		
//			
////Q-3 W.A.J.P to find factorial for Given Number.
//		
//		int fact=1;
//	    System.out.print("Enter any number : ");
//		int number = sc.nextInt();
//	    for(int d=1; d<=number; d++) {
//		fact=fact*d;
//		}
//		System.out.println("Factorial of " + number + " = " +fact);		
//		
//		System.out.println(" ");
//		
////Q-4 W.A.J.P to check given number is Prime or not?
//				
//		System.out.println("enter any number = ");		
//		int n = sc.nextInt();		
//		
//		if (n%2 ==1 && n/n==1) {
//			System.out.println(n + " is prime number ");
//		} else {
//			System.out.println(n + " is not prime number ");
//		}
//		
////Q-5 W.A.J.P to check given number is Armstrong or not?
//				
////		System.out.println("enter number"+ "");
////		int N = sc.nextInt();
////		int square = i*i;
////		int cube = square*i;
////			if (N= ) {
////		for(int i=1; i<=N; i++)
////		int m =0;
////		 for(int i=2;i<=m;i++){      
////			    if(N%i==0){      
////			     System.out.println(N+" is not prime number"); 			
////		
////			    }
////		    }
//		
////Q-6 W.A.J.P for create Fibonacci Series.
//		System.out.println("Enter any number = ");
//		int num = sc.nextInt();
//		int n1 = 0,
//			n2 = 1,
//			n3;
//		
//		System.out.print(n1 + " " + n2 + " ");
//		for (int b=1; b<=num; b++) {
//			n3 = n1 + n2;
//			n1 = n2;
//			n2 = n3;
//            System.out.print(n3 + " ");            
//		}
//	
//		 
////Q-7 W.A.J.P to Print pattern Given Below.
////		 1) 1
////		    12
////		    123
////		    1234
////		    12345
//		
//			for(int w=1;w<=5;w++) {
//				for(int j=1;j<=i;j++) {					
//					System.out.print(j+"");
//				}
//				System.out.println();
//			}
//			
//			System.out.println(" ");
////			
////		 2) 1
////		    12
////		    123
////		    1234
////		    12345
//			
//			for(int r=1;r<=5;r++) {
//				for(int j=1;j<=i;j++) {					
//					System.out.print(j+"");
//				}
//				System.out.println();
//			}
//			
//			System.out.println(" ");
//			
////		 3) 1
////		    01
////		    101
////		    01010
////		    101010	
//		
//		for(int x=1;x<=5;x++) {
//			for(int j=1;j<=x;j++) {	
//				if ((x+j)%2 == 0) {
//					System.out.print("1");	
//				} else {
//				System.out.print("0");
//		}
//			}
//		System.out.println();
//	}
//		System.out.println(" ");
//		
////		4)     1
////		      2 2
////		  	 3 3 3
////		 	4 4 4 4
//		   
//		for(int v=1;v<=4;v++) {
//			for(int j=3;j>=v;j--) {
//				System.out.print(" ");
//			}
//			for (int k=1;k<=v;k++) {
//				System.out.print(v+" ");
//			} 
//		
//		System.out.println();
//		}
//		System.out.println(" ");
		
//			*
//		   ***
//		  *****
//		   ***
//		    *
//		for(int g=1;g<=3;g++) {
//            for(int j=2;j>=g;j--) {
//            	System.out.print(" ");            	
//            }
//            for(int k=1;k<=g;k++) {
//            	System.out.print(" *");
//            }
//		System.out.println();
//		}
//	
//// Q-8 W.A.J.P to compute the sum of the first 100 prime numbers.
//		
//// Q-9 W.A.P to sum values of an array.
//
//		System.out.println("enter size = ");
//		int size = sc.nextInt();
//		int a[] = new int[size];
//		
//		for(int index=0;index<a.length;index++) {
//			System.out.print("enter element at a["+index+"] : ");
//			a[index] = sc.nextInt();
//		}
//		int sum =0;
//		for(int index=0;index<a.length;index++) {
//			 sum=sum+a[index];
//			 System.out.println("sum of elements is  : "+sum);
//		}
//		
//// Q-10 W.A.P to find the maximum and minimum value of an array.
//		
//		System.out.println("enter size = ");
//		int s = sc.nextInt();
//		int b[] = new int[s];	
//		
//		for(int in=0;in<b.length;in++) {
//			System.out.println("Enter value of array at b["+in+"] : ");
//			b[in] = sc.nextInt();
//		}
//		int max=b[0];
//		int min=b[0];
//		for(int h=0;h<s;h++) {
//			if(max<b[h])
//				max=b[h];
//			if(min>b[h])
//				min=b[h];
//		}
//		System.out.println("Maximum Element of Array : "+max);
//		System.out.println("Minimum Element of Array : "+min);
// 
//// Q-11 WAP to Compare Two String.
//		
//		String s1 = "java";
//		String s2 = "java";
//		String s3 = "selenium";
//		
//		System.out.println(s1.equals(s2));
//		System.out.println(s2.equals(s3));
//		
//// Q-12 W.A.P to concatenate a given string to the end of another string.
//		
//		String st1 = "My name is ";
//        String st2 = "Bhumika";
//         
//        System.out.println("String 1: " + st1);
//        System.out.println("String 2: " + st2); 
//        
//        String st3 = st1.concat(st2);
//
//        System.out.println("The concatenated string: " + st3);
        
// Q-13 W.A.P to demonstrate try catch block.
        
//		class Thread1 extends Thread{
//			public void run() {
//				for(int i=1;i<=5;i++) {
//					System.out.println(i);
//					try {
//						Thread.sleep(2000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		}   		
//		int f = 65;
//		int u = 0;  //5
//		try {
//			int divide = f/u;
//			System.out.println("division of f an u = " + divide);
//		}  
//		catch (Exception e) {
//			System.out.println("Failed to divide");	
//		}		
        
// Q-14 W.A.P to demonstrate multiple catch blocks.
//		try {	
//		System.out.println("Enter n1 = ");
//		int n1 = sc.nextInt();
//		System.out.println("Enter n2 = ");
//		int n2 = sc.nextInt();
//		
//		int n3 = n1/n2;
//		System.out.println(n3);			
//		} 
//		catch (ArithmeticException e) {		
//			System.out.println(e);	
//		} catch (Exception a) {
//			System.out.println("other exception is" + a);
//		}			
//}
        
// Q-17 W.A.P to create one thread by implementing Runnable interface in Class.
        
	class ThreadByRunnable implements Runnable{
		public void run() {
			for(int i=1;i<=5;i++) {
				System.out.println(i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	class Threadrunnable implements Runnable {
		public void run() {
			System.out.println("I am a thread");
		
		
			
		}
	}

        
	}    
}




