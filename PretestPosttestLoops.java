/*

The key difference between pretest and posttest loop lies in when the loop condition is checked. 
In a pretest loop, the condition is checked before the loop body is executed, while in a posttest loop, the condition is checked after the loop body has been executed at least once.

Pretest Loop (While Loop):
In a while loop, the condition is checked before entering the loop body. If the condition is false initially, the loop body is never executed.

Posttest Loop (Do-While Loop):
In a do-while loop, the condition is checked after the loop body is executed at least once. This guarantees that the loop body will execute at least once, regardless of the condition.

*/

import java.util.Scanner;

public class PretestLoopExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int num = 0;

        // Pretest loop using while
        System.out.println("Enter numbers to calculate the sum (enter -1 to stop):");
        while ((num = scanner.nextInt()) != -1) {
            sum += num;
        }

        System.out.println("Sum using while loop: " + sum);

        // Posttest loop using do-while
        sum = 0;
        System.out.println("Enter numbers to calculate the sum (enter -1 to stop):");
        do {
            num = scanner.nextInt();
            sum += num;
        } while (num != -1);

        System.out.println("Sum using do-while loop: " + (sum + 1));
        scanner.close();

        scanner.close();

    } // end main
} // end class
