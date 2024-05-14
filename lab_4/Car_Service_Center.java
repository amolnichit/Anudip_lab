//Write a program to create automobile serive( Car Service Center ) by using inhertitance , Encapsulation, Abstraction, Polymorphism
package lab_3;
import java.util.*;
abstract class car_service
{
	car_service()
	{
		System.out.println("Welcome to Car Service Center");
	}
	private String Num_plate;
	void set_Num_plate(String Num_plate) 
	{
		this.Num_plate=Num_plate;
	}
	String get_Num_plate() 
	{
		return Num_plate;
	}
	abstract void services();
}
class service_center extends car_service
{
	Scanner sc=new Scanner(System.in);
	int choice,bill=0;
	String Old_Num_plate,New_Num_plate,Num_plate;
	String operation="";
	void services() 
	{
		char ch='y';
		do 
		{
			System.out.println("**********Service Menu**************");
			System.out.println("1.Oil Change 200Rs\n2.Washing 70Rs\n3.Air Filter Replacement 200Rs\n4.Changing Number plate 500Rs\n5.Display Bill");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Oil Washing Succesfuly...");
				bill+=200;
				operation+="Oil Change 200Rs";
				break;
			case 2:
				System.out.println("Car Washing Succesfully..");
				bill+=70;
				operation+="\nWashing 70Rs";
				break;
			case 3:
				System.out.println("Air Filter Replaced Successfully...");
				bill+=200;
				operation+="\nAir Filter Replacement 200Rs";
				break;
			case 4:
				System.out.println("Enter Old Number plate");
				Old_Num_plate=sc.next();
				Num_plate=get_Num_plate();
				if(Old_Num_plate.equals(Num_plate)) 
				{
					System.out.println("Enter New Number plate");
					New_Num_plate=sc.next();
					set_Num_plate( New_Num_plate);
					bill+=500;
					operation+="\nChanging Number plate 500Rs";
				}
				else 
				{
					System.out.println("Incorrect Number plate, so we can't change it");
				}
				break;
			case 5:
				System.out.println("Total Bill:"+bill);
				break;
			default:
				System.out.println("Invalid choice....");
			
			}
			System.out.println("do you want to continue(Y/N)");
			ch=sc.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		System.out.println("Thankuu for visiting..");
		System.out.println(operation);
		System.out.println("Total Bill="+bill);
		
	}
	
}

public class Car_Service_Center 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String Num_plate;
		service_center obj=new service_center();
		System.out.println("Enter your car Number Plate");
		Num_plate=sc.next();
		obj.set_Num_plate(Num_plate);
		obj.services();
		

	}

}