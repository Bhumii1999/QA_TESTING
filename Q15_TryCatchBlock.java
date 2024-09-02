package M6_Assignment;

public class Q15_TryCatchBlock {
	
	public static void main(String[] args) {
		
//Q-15 WAP to demonstrate try catch block.
		
		class Thread1 extends Thread{
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
	int f = 65;
	int u = 0;  //5
	try {
		int divide = f/u;
		System.out.println("division of f an u = " + divide);
	}  
	catch (Exception e) {
		System.out.println("Failed to divide");	
	}	
	}

}
