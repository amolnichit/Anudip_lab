package operator;
import java.util.Scanner;
public class TernaryOperator {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num1,num2,ans;
		System.out.println("Enter First Number");
		num1=sc.nextInt();
		System.out.println("Enter Second Number");
		num2=sc.nextInt();
		//ternary operator
		ans=(num1>num2)?num1:num2;
		System.out.println("Greatest number is"+ans);
	}

}
