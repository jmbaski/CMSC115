/*

In this example, we have defined a class Student with two data fields (name and age) and one method (displayInfo) to display the student's information.

The constructor Student(String name, int age) takes two arguments, representing the name and age of the student, and initializes the corresponding data fields.

The displayInfo() method prints the student's name and age to the console.

In the main method, we create two student objects (student1 and student2) using the constructor and then use the displayInfo() method to show their information.

*/

public class Student {
    // Data fields
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating student objects using the constructor
        Student student1 = new Student("John Doe", 20);
        Student student2 = new Student("Jane Smith", 22);

        // Displaying student information using the method
        System.out.println("Student 1 Details:");
        student1.displayInfo();

        System.out.println("\nStudent 2 Details:");
        student2.displayInfo();
    }
}
