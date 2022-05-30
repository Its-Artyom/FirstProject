import java.util.Scanner;

/* Purpose
First project is where I will learn different things is java :)
 */
public class main {
    public static void main(String[] args) {
        /* Declaring a variable
        type variableName = value
        "final" phrase can be used to set a constant value.

        Multiple variable of same type
        type name1 = value1, name2 = value2, etc...
        */

        String welcoming = "Hello World!";
        System.out.println(welcoming); // This Is A Cool Phrase!
        System.out.println(welcoming.toLowerCase()); // this is a cool phrase!
        System.out.println(welcoming.toUpperCase()); // THIS IS A COOL PHRASE!

        // Concatenation
        // First set up the input system.
        Scanner input = new Scanner(System.in);
        // Get inputs
        System.out.println("Enter first name: ");
        String f_name = input.next();
        System.out.println("Enter last name: ");
        String l_name = input.next();
        System.out.println(f_name + " ".concat(l_name));
    }
}
