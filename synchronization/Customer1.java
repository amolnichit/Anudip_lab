package synchronization;

public class Customer1 extends Thread
{
	Seller s;
	Customer1(Seller s)
	{
		this.s=s;	
	}
	public void run()
	{
		System.out.println("Customer 1 purchased product");
		s.product();
		
	}

}
