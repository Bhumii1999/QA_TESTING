package M6_Assignment;

public class Q07_Pattern {
	public static void main(String[] args) {
		
//Q-7 W.A.J.P to Print pattern Given Below.
		
//	 1) 1
//	    12
//	    123
//	    1234
//	    12345
	
		for(int w=1;w<=5;w++) {
			for(int j=1;j<=w;j++) {					
				System.out.print(j+"");
			}
			System.out.println();
		}
		
		System.out.println(" ");
//		
//	 2) 1
//	    12
//	    123
//	    1234
//	    12345
		
		for(int r=1;r<=5;r++) {
			for(int j=1;j<=r;j++) {					
				System.out.print(j+"");
			}
			System.out.println();
		}
		
		System.out.println(" ");
		
//	 3) 1
//	    01
//	    101
//	    01010
//	    101010	
	
	for(int x=1;x<=5;x++) {
		for(int j=1;j<=x;j++) {	
			if ((x+j)%2 == 0) {
				System.out.print("1");	
			} else {
			System.out.print("0");
	}
		}
	System.out.println();
}
	System.out.println(" ");
	
//	4)     1
//	      2 2
//	  	 3 3 3
//	 	4 4 4 4
	   
	for(int v=1;v<=4;v++) {
		for(int j=3;j>=v;j--) {
			System.out.print(" ");
		}
		for (int k=1;k<=v;k++) {
			System.out.print(v+" ");
		} 
	
	System.out.println();
	}
	System.out.println(" ");
	
//		*
//	   ***
//	  *****
//	   ***
//	    *
	for(int g=1;g<=3;g++) {
       for(int j=2;j>=g;j--) {
       	System.out.print(" ");            	
       }
       for(int k=1;k<=g;k++) {
       	System.out.print(" *");
       }
	System.out.println();
	}
	}

}
