package M6_Assignment;

//Q-18 WAP to create one thread by extending Thread class in another Class.

class NewThread extends Thread{
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


public class Q18_ExtendThreadClass {
	public static void main(String[] args) {
		
	}	
}
