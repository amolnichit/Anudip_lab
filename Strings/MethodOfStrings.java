package Strings;
import java.util.*;
public class MethodOfStrings {

	Scanner sc=new Scanner(System.in);
	public String acceptString() 
	{
		String str;
		System.out.println("Enter String:");
		str=sc.nextLine();
		return str;
	}
	public void StringMethods(String str,String str2) 
	{
		int ch;
		char choice='Y';
		while(choice=='Y' || choice=='y')
		{
			System.out.println("Which of String do you want to perform operations");
			System.out.println("1."+str+"\n2."+str2+"\n3.Both of "+str+"and"+str2);
			ch=sc.nextInt();
			switch(ch) 
			{
			case 1:
				int op;
				char chh='Y';
				do
				{
					System.out.println(" *************Operation on String 1******************");
					System.out.println("1.To get Character at index 1 \n2.length of String "
							+ "\n3.To check string is empty\n4.To get substring of String \n5.to get"
							+ "Substring between index 2 and \n6.to check String contains Amol"
							+ "to check String is equal to Computer \n7.To get The index of A "
							+ "\n8.Converting String into Lower case of String:"
							+ "\n9.Converting String into Upper case of String"
							+ "\n10.To chek String is empty or not");
					System.out.println("Enter Your choice:");
					op=sc.nextInt();
					switch(op) {
					case 1:
						System.out.println("Character at index 1 is :"+str.charAt(1));
						break;
					case 2:
						System.out.println("length of"+str+":"+str.length());
						break;
					case 3:
						System.out.println("The substring of "+str+"which start from index 3:"+str.substring(3));

						break;
					case 4:
						System.out.println("The Substring between index 2 and 4 is:"+str.substring(1,3));
						break;
					case 5:
						System.out.println("The String"+str+ " contain Amol :"+str.contains("Amol"));
						break;
					case 6:
						System.out.println("The String "+str+ "is Equals Computer :"+str.equals("Computer"));
						break;
					case 7:
						System.out.println("The index of A :"+str.indexOf('A'));
						break;
					case 8:
						System.out.println("Lower case of String:"+str.toLowerCase());
						break;
					case 9:
						System.out.println("Upper case of String:"+str.toUpperCase());
						break;
					case 10:
						System.out.println("To check string is empty:"+str.isEmpty());
						break;
					default:
						System.out.println("Plz Enter valid choice");
					}
					System.out.println("Do you want to continue(Y/N):");
					chh=sc.next().charAt(0);
				}				
				while(chh=='Y'|| chh=='y');		
				break;
			case 2:
						int opp;
						char chh1='Y';
						System.out.println(" *************Operation on String 2******************");
						do
						{
							System.out.println(" *************Operation on String 1******************");
							System.out.println("1.To get Character at index 1 \n2.length of String "
									+ "\n3.To check string is empty\n4.To get substring of String \n5.to get"
									+ "Substring between index 2 and \n6.to check String contains Amol"
									+ "to check String is equal to Computer \n7.To get The index of A "
									+ "\n8.Converting String into Lower case of String:"
									+ "\n9.Converting String into Upper case of String"
									+ "\n10.To chek String is empty or not");
							System.out.println("Enter Your choice:");
							op=sc.nextInt();
							switch(op) {
							case 1:
								System.out.println("Character at index 1 is :"+str2.charAt(1));
								break;
							case 2:
								System.out.println("length of"+str2+":"+str2.length());
								break;
							case 3:
								System.out.println("To check string is empty:"+str2.isEmpty());
								break;
							case 4:
								System.out.println("The substring of "+str2+"which start from index 3:"+str2.substring(3));
								break;
							case 5:
								System.out.println("The Substring between index 2 and 4 is:"+str2.substring(1,3));
								break;
							case 6:
								System.out.println("The String"+str2+ " contain Amol :"+str2.contains("Amol"));

								break;
							case 7:
								System.out.println("The String "+str2+ "is Equals Computer :"+str2.equals("Computer"));
								break;
							case 8:
								System.out.println("The index of A :"+str2.indexOf('A'));
								break;
							case 9:
								System.out.println("Lower case of String:"+str2.toLowerCase());
								break;
							case 10:
								System.out.println("Upper case of String:"+str2.toUpperCase());

								break;
							default:
								System.out.println("Plz Enter valid choice");
							}
							System.out.println("Do you want to continue(Y/N):");
							chh1=sc.next().charAt(0);
						}
										
						while(chh1=='Y'|| chh1=='y');
						break;
						
			case 3:	
				System.out.println(" **********Operation on both of String 1 and String 2***********");
				String temp =str;
				System.out.println("Replacing both String");
				System.out.println("After replacing String 1:"+str.replace(str,str2));
				System.out.println("After replacing String 2:"+str.replace(str2,temp));
				
				System.out.println("Is String 1 and String 2 equal:"+str.equals(str2));
				break;
			default:
				System.out.println("Plz Enter valid choice");
			}
			System.out.println("Do you want to continue(Y/N):");
			choice=sc.next().charAt(0);
		}
		
	

	}
	public static void main(String args[]) {
		
	}
	
}

