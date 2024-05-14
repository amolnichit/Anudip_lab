//Write a program to set the priorities of the thread.
package lab6;
public class ThreadPriorityExample {

	public static void main(String[] args) {
		//creating thread
		MyThread lowPriority=new MyThread("LowPriorityThread");
		MyThread highPriority=new MyThread("HighPriorityThread");
		//set thread priorities
		highPriority.setPriority(Thread.MAX_PRIORITY);
		lowPriority.setPriority(Thread.MIN_PRIORITY);
		//Start thread
		highPriority.start();
		lowPriority.start();
		try {
			//Wait for the threads to finish
			highPriority.join();
			lowPriority.join();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Done....");
	}

}
