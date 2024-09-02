package M6_Assignment;

public class Q23_ReverseAnArrayOfIntegerValues {
	public static void main(String[] args) {
	
//Q-23 WAP to reverse an array of integer values.
		System.out.println("Original array : ");
		int [] arr = new int [] {1,2,3,4,5};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
		
		System.out.println("Reverse array : ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i] + "  ");
		}
							
		}		
	}


