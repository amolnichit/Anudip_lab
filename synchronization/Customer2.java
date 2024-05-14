package synchronization;

public class Customer2 extends Thread 
{
	Seller s;
	Customer2(Seller s)
	{
		this.s=s;	
	}
	public void run()
	{
		System.out.println("Customer 1 purchased product");
		s.product();
		
	}
}
