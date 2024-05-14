package lab3;
import java.util.*;
public class Mini_Calculator
{

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int num1,num2,operator;
		double ans;
		char choice='Y';
		while(choice=='Y' || choice=='y') 
		{
			System.out.println("Enter 1st Number:");
			num1=sc.nextInt();
			System.out.println("Enter operator(+,-,*,/,):");
			operator=sc.next().charAt(0);
			System.out.println("Enter 2nd Number:");
			num2=sc.nextInt();
			switch(operator) 
			{
			case '+':
				ans=num1+num2;
				System.out.println("Addition:"+ans);
				break;
			case '-':
				ans=num1-num2;
				System.out.println("Substraction:"+ans);
				break;
			case '*':
				ans=num1*num2;
				System.out.println("Multiplication:"+ans);
				break;
			case '/':
				if(num1!=0 &&num2!=0)
				{
					ans=num1/num2;
					System.out.println("Division:"+ans);	
				}
				else
				{
					System.out.println("Division is not possiable");
				}
				break;
			default:
				System.out.println("Enter valid Operator");
			}
			System.out.println("Do you want to Continue(Y/N):");
			choice=sc.next().charAt(0);
		}
	}
}
