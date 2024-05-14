/*Develop a main class CalculatorSimulator  , implement the following logic in main method
1.  Execute the calculateTax Method and print the tax amount as “Tax amount is “<Tax Amount>
2.  In case the calculateTaxMethod throws exceptions, this method needs to catch the
 appropriate exception print the stack trace and display the following messages,
a.  Country not valid:  “The employee should be an Indian citizen for calculating tax”
b.  Employee name not valid:  “The employee name cannot be empty”
c.  Not eligible for Tax calculation:“The employee does not need to pay tax”
*/
package lab6;
import java.util.*;
public class CalculatorSimulator {

	public static void main(String[] args) {
		String empName;
		boolean isIndian;
		double empSal,taxAmount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee name:");
		empName=sc.nextLine();
		System.out.println("Is Employee indian(true/false)");
		isIndian=sc.nextBoolean();
		System.out.println("Enter Employee Salary:");
		empSal=sc.nextDouble();
		
		TaxCalculator obj=new TaxCalculator();
		try {
			taxAmount=obj.calculateTax(empName, isIndian, empSal);
			System.out.println("Your Tax Amount is"+taxAmount);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
