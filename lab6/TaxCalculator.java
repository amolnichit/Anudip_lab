/*Q."Develop  a  class  named  “TaxCalculator“ with a method named 
 * calculateTax with the following method parameters,

VariableName   Data Type
empName        String
isIndian        boolean
empSal        double

This method should return a double taxAmount.
The business logic for calculating the tax  is as follows, this has to be 
implemented inside the method,
If the employee is not a Indian
The calculator should throw a CountryNotValidException
If the employee name is null or empty
The calculator should throw a EmployeeNameInvalidException
If  empSal is greater than one lakh and isIndian true
taxAmount =empSal *8/100
Otherwise  If  empSal  is between 50K and 1lakh and isIndian true
taxAmount =empSal *6/100
Otherwise  If  empSal  is between 30 and 50 Thousand  and isIndian true
taxAmount =empSal *5/100
Otherwise  If  empSal  is between 10 and 30 Thousand  and isIndian true
taxAmount =empSal *4/100
Otherwise
The calculator should throw a TaxNotEligibleException.
"*/
package lab6;

public class TaxCalculator {

	 double calculateTax(String empName,Boolean isIndian,Double empSal)throws CountryNotValidException,EmployeeNameInvalidException,TaxNotEligibleException
	{
		double taxAmount;
		if(!isIndian) {
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
		}
		if(empName==null || empName.isEmpty()) {
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		}
		if(empSal>=100000) {
			taxAmount=empSal*8/100;
		}
		else if(empSal>50000 && empSal<100000) {
			taxAmount=empSal *6/100;
		}
		else if(empSal>30000 && empSal<50000) {
			taxAmount =empSal *5/100;
		}
		else if(empSal>10000 && empSal<30000) {
			taxAmount =empSal *4/100;
		}
		else {
			throw new TaxNotEligibleException("The employee does not need to pay tax");
		}
		return taxAmount;
	}
	
}
