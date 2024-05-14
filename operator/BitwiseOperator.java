package operator;
import java.util.Scanner;
public class BitwiseOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2,ans;
		System.out.println("Enter first Number:");
		num1=sc.nextInt();
		System.out.println("Enter Second Number:");
		num2=sc.nextInt();
		//Bitwise &(and) operator
		ans=num1 & num2;
		System.out.println("After "+ num1+"&"+num2+" opreration result is:"+ans);
		//Bitwise |(OR) operator
		ans=num1 | num2;
		System.out.println("After "+ num1+"|"+num2+" opreration result is:"+ans);
		//Bitwise ^(XOR) operator
		ans=num1 ^ num2;
		System.out.println("After "+ num1+"^"+num2+" opreration result is:"+ans);
		
	}

}
