package project2;
import java.util.Scanner;
import java.util.Random;
public class Robert_Tulmen_Project1 {

	public static void main(String args[]) {
       
		/*
		 *Implement a Java program that simulates the presentation and evaluation of a flash card
		 * in addition or subtraction with factors between 0 and 9 inclusive. 
		 */
		
		// Declare variables
        Random rand = new Random();
        int x = rand.nextInt(10);
        int y = rand.nextInt(10);
        int sum = x + y;
        int answer = sum - y;
		
        // Create scanner and print welcome messages
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.next();
        System.out.print("Would you like an Addition or Subtraction problem?    Enter A or S: ");
        String operation = input.next();
        System.out.println("\nWelcome " + name + " to the Addition and Subtraction FlashCard System.");
        System.out.println("All problems will use factors from 0 to 9\n");

        // Use switch case for presenting differing operations and evaluate them
        switch(operation) {
        case("a") :
        case("A") :
        	System.out.println("You have selected Addition.\n");
         	System.out.print("What is " + x + " + " + y + " = ");
         	answer = sum;
         	if (input.nextInt() == sum)
                System.out.println("Correct!\n");
            else
                System.out.println("Wrong, the correct answer is " + sum + "\n");
         	break;

		case("s") :
		case("S") :
			System.out.println("You have selected Subtraction.\n");
			System.out.print("What is " + sum + " - " + y + " = ");
			int response = input.nextInt(); if (response == answer) 
                System.out.println("Correct!\n");
            else
                System.out.println("Wrong, the correct answer is " + (answer) + "\n");
			break;
         }
        
        // Print message thanking user
        System.out.println("Thank you for using our FlashCard System, " + name + ".");
        input.close();
    }
}