/*Write a program to accept choice from the user and perform the operation
	1.Find out greater between 3 NO
	2.Check given no is even or odd
	3.Check the given character is vowel or not
	4.check the given no is divisible by 5 or not
*/
package labDay1;
import java.util.Scanner;
public class Menu_driven 
{

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int choice,num,num1,num2,num3;
		char character;
		System.out.println("#############MENU##############");
		System.out.println("1.Find out greater between 3 number\n2.Check given no is even or odd\n3.Checkk the given character is vowel or not\n4.check the given no is divible by 5 or not");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice) 
		{
		case 1:
			//Find out greater between 3 NO
			System.out.println("Enter first number:");
			num1=sc.nextInt();
			System.out.println("Enter second number:");
			num2=sc.nextInt();
			System.out.println("Enter third number:");
			num3=sc.nextInt();
			if(num1>num2 && num1>num3) 
			{
				System.out.println("the greater number is"+num1);
			}
			else if(num2>num1 && num2>num3)
			{
				System.out.println("the greater number is"+num2);	
			}
			else 
			{
				System.out.println("the greater number is"+num3);	
			}
			break;
		case 2:
			//Check given no is even or odd
			System.out.println("Enter Number");
			num=sc.nextInt();
			if(num%2==0) 
			{
				System.out.println("Given number is even");
			}
			else
			{
				System.out.println("Given number is odd");

			}
			break;
		case 3:
			//Check the given character is vowel or not
			System.out.println("Enter Character:");
			character=sc.next().charAt(0);
			if(character=='a' || character=='e' || character=='i' || character=='o' || character=='u')
			{
				System.out.println("Given character is vowel");
			}
			else 
			{
				System.out.println("Given character not is vowel");
			}
			break;
		case 4:
			//check the given no is divisible by 5 or not
			System.out.println("Enter Number");
			num=sc.nextInt();
			if(num%5==0)
			{
				System.out.println("Given number is divisible by 5");
			}
			else
			{
				System.out.println("Given number is not divisible by 5");

			}
			break;
		default:
			System.out.println("plz enter valid choice");
		}	

	}

}
