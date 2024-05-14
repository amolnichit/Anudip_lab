/*Write a method that takes a String and returns a String of the same length containing the 'X' 
 * character in all positions except the last 4 positions. The characters in the last 4 positions 
 * must be the same as in the original string. For example, if the argument is
"12345678", the return value should be "XXXX5678".
*/
package lab9;
import java.util.*;
public class Que1 {
	public static String replace(String str)
	{
		int i=0;
		String str2="";
		while(i != str.length()) 
		{
			if(i+4 <str.length())
			{
				str2+='X';
			}
			else {
				str2+=str.charAt(i);
			}
			i++;
		}
		str=str2;
		return str;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter String:");
		s=sc.next();
		
		String str=replace(s);
		System.out.println(str);
		sc.close();
		

	}

}
