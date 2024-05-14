/* Create a arraylist of students name and remove name of students who start with
 *  ‘S’ using lambda expression.*/
package lab10;
import java.util.ArrayList;
import java.util.Iterator;
public class Que3 {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("Alice");
        studentNames.add("Bob");
        studentNames.add("Samantha");
        studentNames.add("Steve");
        studentNames.add("Charlie");
        studentNames.add("Sarah");
        // Remove names starting with 'S' using lambda expression
        studentNames.removeIf(name -> name.startsWith("S"));
        System.out.println("Student names after removing names starting with 'S':");
        for (String name : studentNames) {
            System.out.println(name);
        }
    }
}
