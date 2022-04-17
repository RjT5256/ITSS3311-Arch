package project2;

import java.util.Random;
import java.util.Scanner;

public class Robert_Tulmen_Project2 {

	public static void main(String[] args) {
		
		/*
		 * Name: Robert Tulmen	Section #: 3311-005
		 * Implement a Java program that simulates the presentation and 
		 * evaluation of a flash card in addition or subtraction with factors 
		 * between 0 and 9 inclusive.
		 */
		
		// Declare vars
		String choice = "";
		String operation;
		String longOper = "";
		int problems = 0;
		int x = 0;
		int y = 0;
		int sum = 0;
		int answer = sum - y;
		int response = 0;
		
		// Print initial statements to introduce functions
		System.out.println("Welcome to the flashcard system!");
		System.out.println("The flashcard system provides flashcards for addition and subtraction.");
		System.out.println("The factors range from 0 to 9.\n");
		
		// Use scanner to get name and operation choice
		System.out.print("Enter your name: ");
		Scanner input = new Scanner(System.in);
		String name = input.next();
		System.out.print("Enter operation, A for addition, S for subtraction: ");
		choice = input.next();
		longOper = getLongOper(choice);
		
		// Get amount of problems to work and return problems and evaluate responses
		System.out.print("How many problems would you like to work? ");
		problems = input.nextInt();
		System.out.println("");
		System.out.println("Welcome to the flashcard system, " + name);
		System.out.println("You have selected " + longOper + " for " + problems + " problems.");
		for (int i = problems; i > 0; i--) {
		answer = setProblem(longOper);
		response = input.nextInt();
		evalProblem(response,answer);
		}
		
		// Return thank you message after code has been run
		System.out.println("");
		System.out.print("Thank you for playing, " + name);
		return;

	} // End of main method
	
	//This method grabs operation choice
	public static String getLongOper(String choice) {
		String longOper = "";
		if(choice.equals("A"))
			longOper =  "Addition";
		
		else if(choice.equals("S"))
			longOper = "Subtraction";
		if(choice.equals("a"))
			longOper =  "Addition";
		
		else if(choice.equals("s"))
			longOper = "Subtraction";

		return longOper;
	}
	
	// This method returns problems
	public static int setProblem(String operation) {
		int x = 0;
		int y = 0;
		int[] array = {x,y};
		array = getXY(x,y);
		x = array[0];
		y = array[1];
		int sum = x + y;
		
		switch(operation) {
		
		case("Addition") : 
			
			System.out.println("");
			System.out.print(x + " + " + y + " = ");
			return sum;
			
		case("Subtraction") :
			
			System.out.println("");
			System.out.print(sum + " - " + y + " = ");
			return x;
			
		}
		return 0;
	}

	//This method gets randomized values for x and y
	public static int[] getXY(int x, int y) {
		
		Random random = new Random();
		x = random.nextInt(10); 
		y = random.nextInt(10);
		int[] array = {x,y};
		return array;
		}
	
	// This method evaluates the users inputed response
	public static int evalProblem(int response,int answer) {
		if (response == answer) 
			System.out.println("Correct!");
			else 
				System.out.println("Incorrect. Correct answer is " + answer);
		
		return response;
	}
	

}

