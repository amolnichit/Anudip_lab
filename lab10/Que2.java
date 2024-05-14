/*A class teacher has decided to split her entire class into four groups,
 *  namely Sapphire, Perl, Ruby, and Emerald for sports competitions. For dividing 
 *  the students into these four groups, she has followed the pattern given below:
Sapphire - 1, 5, 9, 13, 17, 21, ...
Perl - 2, 6, 10, 14, 18, 22, ...
Ruby - 3, 7, 11, 15, 19, 23, ...
Emerald - 4, 8, 12, 16, 20, 24, ...
All the students are represented by their roll numbers. Based on the above pattern,
given the roll number as input, print the group the student belongs to. Note that 
the roll number can be any positive integer and not necessarily less than 25.
*/
package lab10;
import java.util.Scanner;

public class Que2 {
	// Method to determine the group based on roll number
	public static String determineGroup(int rollNumber) {
        int groupSize = 4;
        int groupNumber = (rollNumber - 1) % groupSize; // Adjust for 0-indexing
        String[] groups = {"Sapphire", "Perl", "Ruby", "Emerald"};
        return groups[groupNumber];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();

        // Determine the group based on roll number
        String group = determineGroup(rollNumber);

        // Print the group
        System.out.println("Group: " + group);

        scanner.close();
    }
    
}
