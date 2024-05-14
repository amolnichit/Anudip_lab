package synchronization;

public class Customer4 extends Thread
{
	Seller s;
	Customer4(Seller s)
	{
		this.s=s;	
	}
	public void run()
	{
		System.out.println("Customer 1 purchased product");
		s.product();
		
	}

}
