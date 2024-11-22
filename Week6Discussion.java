public class Week6Discussion {

    // Method to illustrate pass-by-value with primitive data type
    public static void attemptToModify(int number) {
        number = 25;
        System.out.println("Number inside method: " + number);
        // Any change here is local to this method and doesn't affect the original value
    }

    // Method to illustrate the effect of passing the reference value of an object
    public static void modifyStringBuilder(StringBuilder sb) {
        sb.append(" world");
        System.out.println("StringBuilder inside method: " + sb);
        // Changes here will affect the original object because the method has a reference to it
    }

    public static void main(String[] args) {
        // Using pass-by-value with a primitive type
        int myNumber = 10;
        System.out.println("Number before method call: " + myNumber);
        attemptToModify(myNumber);
        System.out.println("Number after method call: " + myNumber);
        // The number will remain the same because it's passed by value

        // Using a reference type (StringBuilder) to demonstrate pass-by-value of the reference
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("StringBuilder before method call: " + sb);
        modifyStringBuilder(sb);
        System.out.println("StringBuilder after method call: " + sb);
        // The contents of StringBuilder will be changed because the method modifies the object that the reference variable points to
    }
}

