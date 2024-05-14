/*2.Write a method that takes a String[] as an argument and 
 * returns a String containing the concatenation of all the strings 
 * in the input array. Invoke your method 3 times with different arguments.
 *  Make sure that your code handles the cases where the argument is null.
*/
package lab9;
public class Que2
{
	public static String Concatenation(String str[]) 
	{
		if(str==null) {
			return null;
		}
		int i;
		String con="";
		for(i=0;i<str.length;i++) {
			con+=str[i];
		}
		return con;
	}
	public static void main(String[] args) 
	{
		String str[]= {"HI"," ","AMOL",};
		String str1=Concatenation(str);
		System.out.println(str1);
		String str2[]= {"Radha","Krishn"};
		String str02=Concatenation(str2);
		System.out.println(str02);
		String str3[]=null;
		String str03=Concatenation(str3);
		System.out.println(str03);
	}

}
