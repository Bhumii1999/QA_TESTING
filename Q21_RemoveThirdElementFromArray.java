package M6_Assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Q21_RemoveThirdElementFromArray {
	public static void main(String[] args) {
		
ArrayList list = new ArrayList();
		
		list.add("Sunday");
		list.add("Monday");
		list.add("Tuesday");			
		list.add("Wednesday");
			
		System.out.println("Array list elements : " );
		System.out.println(list);
		
		list.remove(3);
		System.out.println("Updated array elements are : ");
		System.out.println(list);
	
	}

}
