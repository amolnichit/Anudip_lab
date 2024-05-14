package operator;
import java.util.Scanner;
public class ArithmeticOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2,ans;
		System.out.println("Enter first Number:");
		num1=sc.nextInt();
		System.out.println("Enter Second Number:");
		num2=sc.nextInt();
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
	}

}
