/* 

In this combined program, the main method calls both passByValue and passByReference methods with different types of arguments (primitive int and StringBuilder reference). 
The output clearly demonstrates the difference in behavior between pass-by-value and pass-by-reference.

In the passByValue method, the argument x is passed by value (a copy of the value of x is passed). Changes made to the value parameter inside the method do not affect the original x.

In the passByReference method, the StringBuilder object str is passed by reference (a copy of the reference to str is passed). Changes made to the object referred by the reference 
parameter inside the method are reflected outside the method as well.

This example showcases how Java treats different types (primitive vs. object references) during method parameter passing.

*/

public class PassByValueAndReferenceExample {

    public static void main(String[] args) {
        int x = 10;
        System.out.println("Before passByValue: x = " + x);

        // Call the passByValue method with the value of x
        passByValue(x);

        System.out.println("After passByValue: x = " + x);

        StringBuilder str = new StringBuilder("Hello");
        System.out.println("\nBefore passByReference: str = " + str);

        // Call the passByReference method with the reference to str
        passByReference(str);

        System.out.println("After passByReference: str = " + str);
    }

    // Pass-by-Value example
    public static void passByValue(int value) {
        // Modify the parameter (a copy of the value)
        value = 20;
        System.out.println("Inside passByValue: value = " + value);
    }

    // Pass-by-Reference example
    public static void passByReference(StringBuilder reference) {
        // Modify the object referred by the reference
        reference.append(", World!");
        System.out.println("Inside passByReference: reference = " + reference);
    }
}
