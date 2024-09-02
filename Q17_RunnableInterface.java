package M6_Assignment;
		
//Q-18 W.A.P to create one thread by implementing Runnable interface in Class.
		
		class ThreadByRunnable implements Runnable{
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



