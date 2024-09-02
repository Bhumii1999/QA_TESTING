package M6_Assignment;

import java.util.ArrayList;
import java.util.List;



public class Q20_UpdateSpecificArray {
	public static void main(String[] args) {
		
//Q-20 WAP to update specific array element by given element.
		
		List<String>listStrings = new ArrayList<String>();
		listStrings.add("Red");
		listStrings.add("Orange");
		listStrings.add("Blue");
		listStrings.add("White");
		
		System.out.println(listStrings);
		
		listStrings.set(1, "Yellow");
		System.out.println(listStrings);
		
	}
}
