package M6_Assignment;

public class Q22_CopyArray {
	public static void main(String[] args) {

//Q-22 WAP to Copy one array into another	.
		
		int Array1 [] = new int [] {1,2,3,4,5};
		System.out.println("Elements of array1: ");
	    for (int i = 0; i < Array1.length; i++) {
	      System.out.print(Array1[i] + " ");
	    }
		
		int Array2[] = new int[Array1.length];
		for (int i = 0; i < Array1.length; i++) {
		      Array2[i] = Array1[i];
		    }
	    
		System.out.println();
	    System.out.println("Elements of Copied array2: ");
	    for (int i = 0; i < Array2.length; i++) {
	      System.out.print(Array2[i] + " ");
	    }
	}		
	}

