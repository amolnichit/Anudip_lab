package synchronization;

public class ProducerConsumer
{

	public static void main(String[] args)
	{
		Seller obj =new Seller();
		Customer1 c1=new Customer1(obj);
		Customer2 c2=new Customer2(obj);
		Customer3 c3=new Customer3(obj);
		Customer4 c4=new Customer4(obj);
		c1.start();
		c2.start();
		c3.start();
		c4.start();

	}

}
