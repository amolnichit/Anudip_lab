/* 1)Write a program to accept choice from the user and display the output
	1.Arithmetic operator
	2.Logical Operator
	3.Relational Operator
	4.Bitwise Operator
	5.Conditional Operator
	6.Assignment Operator
*/
package operator;
import java.util.Scanner;
public class MenuDriven_Operator 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int choice,num1,num2,ans;
		boolean result;  
		System.out.println("Which operation do you want to perform");
		System.out.println("1.Arithmetic operator\n2.Logical Operator\n3.Relational Operator\n4.Bitwise Operator\n5.Conditional Operator\n6.Assignment Operator");
		choice=sc.nextInt();
		System.out.println("Enter first number");
		num1=sc.nextInt();
		num2=sc.nextInt();
		switch(choice) {
		case 1:
			//Arithmetic operator
			//Addition
			ans=num1+num2;
			System.out.println("Addition is:"+ans);
			//Subtraction
			ans=num1-num2;
			System.out.println("Subtraction is:"+ans);
			//Multiplication
			ans=num1*num2;
			System.out.println("Multiplication is:"+ans);
			//Division
			ans=num1/num2;
			System.out.println("Division is:"+ans);
			//Modulus
			ans=num1%num2;
			System.out.println("Remender is:"+ans);
			break;
		case 2:
			//logical operator
			//and
			result=(num1>0 && 20>num2);
			System.out.println("After "+ num1+"&&"+num2+" opreration result is:"+result);
			//OR
			result=(num1>0 || 20>num2);
			System.out.println("After "+ num1+"||"+num2+" opreration result is:"+result);
		case 3:
			//relational operator
			result=num1==num2;
			System.out.println(num1+" is equal to "+num2+":"+result);
			result=num1!=num2;
			System.out.println(num1+" is not equal to "+num2+":"+result);
			result=num1>num2;
			System.out.println(num1+" is greator than "+num2+":"+result);
			result=num1<num2;
			System.out.println(num1+" is less than "+num2+":"+result);
			result=num1>=num2;
			System.out.println(num1+" is greator than or equal to"+num2+":"+result);
			result=num1<=num2;
			System.out.println(num1+" is less than or equal to "+num2+":"+result);
			break;
		case 4:
			//Bitwise Operator
			//Bitwise &(and) operator
			ans=num1 & num2;
			System.out.println("After "+ num1+"&"+num2+" opreration result is:"+ans);
			//Bitwise |(OR) operator
			ans=num1 | num2;
			System.out.println("After "+ num1+"|"+num2+" opreration result is:"+ans);
			//Bitwise ^(XOR) operator
			ans=num1 ^ num2;
			System.out.println("After "+ num1+"^"+num2+" opreration result is:"+ans);
			break;
		case 5:
			//Conditional Operator
			ans=(num1>num2)?num1:num2;
			System.out.println("Greatest number is"+ans);
			break;
		case 6:
			//Assignment Operator
			System.out.println("after"+num1+"+"+num2+":");
			num1+=num2; //num1=num1+num2
			System.out.print(num1);
			System.out.println("after"+num1+"-"+num2+":");
			num1-=num2; //num1=num1-num2;
			System.out.print(num1);
			System.out.println("after"+num1+"*"+num2+":");
			num1*=num2; //num1=num1*num2
			System.out.print(num1);
			System.out.println("after"+num1+"/"+num2+":");
			num1/=num2; num1=num1/num2;
			System.out.print(num1);
			break;
		default:
			System.out.println("plz enter valid choice");
		}
	}

}
