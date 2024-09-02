package M6_Assignment;

//Q-25 W.A.J.P. Create an abstract class 'Parent' with a method 'message'. It has 
//     two subclasses each having a method with the same name 'message' that prints
//     "This is first subclass" and "This is second subclass" respectively.

	abstract class parent{
			
		public void message() {
			
		}
	}
	class subclass1 extends parent{
		public void message() {
			System.out.println("This is first subclass");
		}
	}
	
	class subclass2 extends parent{
		public void message() {
			System.out.println("This is second subclass");
		}
	}
		

public class Q25_AbstractClass {
	public static void main(String[] args) {

		subclass1 d = new subclass1();
		d.message();
		
		subclass2 s = new subclass2();
		s.message();
		
	
	
	}
}