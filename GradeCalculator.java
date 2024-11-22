/*

Instructor Example Program for the Week 3 Discussion

This program takes the student's score as input using the Scanner class.
It then uses a nested if statement to check the score against different grade boundaries. Each if statement checks if the score meets the condition
for a particular grade and prints the corresponding grade.  The multi-way if statement combines the conditions using else-if, making it more concise compared to nested if.
Lastly, the switch statement uses the score divided by 10 (integer division) to determine the grade, and each case represents a specific range of scores for each grade.

*/

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the student's score from the user
        System.out.print("Enter the student's score: ");
        int score = scanner.nextInt();

        // Step 2: Using Nested If
        System.out.println("Using Nested If:");
        if (score >= 90) {
            System.out.println("Grade: A");
        } else {
            if (score >= 80) {
                System.out.println("Grade: B");
            } else {
                if (score >= 70) {
                    System.out.println("Grade: C");
                } else {
                    if (score >= 60) {
                        System.out.println("Grade: D");
                    } else {
                        System.out.println("Grade: F");
                    }
                }
            }
        }

        // Step 3: Using Multi-way If
        System.out.println("\nUsing Multi-way If:");
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // Step 4: Using Switch Statement
        System.out.println("\nUsing Switch Statement:");
        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: F");
                break;
        }

        scanner.close();
    }
}
