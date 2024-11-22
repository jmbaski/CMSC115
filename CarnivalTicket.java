/* Notes 

This program takes the attendees age using the Scanner class.
It then uses a nested if statement to check the age against different age groups. Each if statement checks if the age meets the condition for certain prices and prints the price.
The multi-way if statement combines the conditions using else-if, making it more concise compared to nested if.
Lastly, the switch statement uses a String to identify the categorys, since it would be tedious to set out every age as a case number.

*/	

import java.util.Scanner;

public class CarnivalTicket {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Ask age of attendee
		System.out.println("How old is the attendee?: ");
		int age = scanner.nextInt();
		
						// Defining a variable for age category for switch statement
		String category;
		//Using Multi-way If
		System.out.println("Using Multi-Way If to categorize the age groups.");
		if (age >= 1 && age <= 17) {
		category = "Child";
	} else if (age >=18 && age <= 59) {
		category = "Adult";
	} else if (age >=60) {
		category = "Senior";
	} else {
		category = "Invalid";
	}
		
		// Ticket prices: Child = $12, Adult = $10, Senior = $8.
		// Using nested if
		System.out.println("Using Nested If to categorize the age groups.");
		if (age >= 1 && age <= 17) {
			System.out.println("Your price is $12.");
		} else {
			if (age >= 18 && age <= 59) {
				System.out.println("Your price is $10.");
			} else {
				if (age >= 60) {
					System.out.println("Your price is $8");
				} else {
					System.out.println("Please provide an appropriate response.");
				}
			}
		}
		
		//Using Multi-way If
		System.out.println("Using Multi-Way If to categorize the age groups.");
		if (age >= 1 && age <= 17) {
			System.out.println("Your price is $12.");
	} else if (age >=18 && age <= 59) {
			System.out.println("Your price is $10.");
	} else if (age >=60) {
			System.out.println("Your price is $8.");
	} else {
		System.out.println("Please provide an appropriate response.");
	}
	

		
		
		// Using Switch Statement
		System.out.println("Using Switch Statement to categorize the age groups.");
		switch (category) {
			case "Child":
				System.out.println("Your price is $12.");
				break;
			case "Adult":
				System.out.println("Your price is $10.");
				break;
			case "Senior":
				System.out.println("Your price is $8.");
				break;
			default:
				System.out.println("Please provide an appropriate response.");
				break;
		}
		
		scanner.close();
	}
}