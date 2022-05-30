import java.util.Locale;

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

        Java Type Casting
        Type casting is when you assign a value of one primitive data type to another type.

        In Java, there are two types of casting:

        Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double

        Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte
        */

        String welcoming = "Hello World!";
        System.out.println(welcoming); // This Is A Cool Phrase!
        System.out.println(welcoming.toLowerCase()); // this is a cool phrase!
        System.out.println(welcoming.toUpperCase()); // THIS IS A COOL PHRASE!
    }
}
