package M6_Assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Q19_IterateInArrayList {
	
	public static void main(String[] args) {
	
//Q-19 WAP to iterate through all elements in an array list.
	
		ArrayList list = new ArrayList();
		
		list.add("Sunday");
		list.add("Monday");
		list.add("Tuesday");			
		list.add("Wednesday");
			
		System.out.println("Array list elements : " );
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	}

	}


