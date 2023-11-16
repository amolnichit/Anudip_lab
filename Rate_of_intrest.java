/*Write a program to accept age and gender from the user and check the ROI according to condition
above 60
M: 7%
F: 7.5%
below 60
M,F: 5%

eg( age : 20 G: M  ROI=7%)
*/
package labDay1;
import java.util.Scanner;
public class Rate_of_intrest
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double intrest;
		int age;
		String gender;
		System.out.println("Enter your Age:");
		age=sc.nextInt();
		System.out.println("Enter your Gender:");
		gender=sc.next();
		if(age>60) 
		{
			if(gender.equals("male")) 
			{
				intrest=7;
			}
			else
			{
				intrest=7.5;
			}
		}
		else 
		{
			intrest=5;
		}
		System.out.println("Rate Of Intrest is:"+intrest+"%");
	}

}
