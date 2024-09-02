package M6_Assignment;

public class Q14_ConcatenateStringToEndOfAnother {
	
	public static void main(String[] args) {
		
	  String st1 = "My name is ";
      String st2 = "Bhumika";
       
      System.out.println("String 1: " + st1);
      System.out.println("String 2: " + st2); 
      
      String st3 = st1.concat(st2);

      System.out.println("The concatenated string: " + st3);
      
	}

}
