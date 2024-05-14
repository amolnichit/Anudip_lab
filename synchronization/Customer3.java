package synchronization;

public class Customer3 extends Thread 
{
	Seller s;
	Customer3(Seller s)
	{
		this.s=s;	
	}
	public void run()
	{
		System.out.println("Customer 1 purchased product");
		s.product();
		
	}

}
