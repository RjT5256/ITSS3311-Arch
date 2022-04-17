package project4;

import java.util.Scanner;
import java.util.Random;

/*
 * Name: Robert Tulmen	Section #: 3311-005
 * Implement a Java program that simulates the presentation and evaluation of a 
 * flash card in addition or subtraction with factors between 0 and 9 inclusive.
 */
class FlashCard {
	
	// Declare vars
	String name = "";
	String operation = "";
	String longOper = "";
	int problems = 0;
	int x = 0;
	int y = 0;
	int answer = 0;
	int response = 0;
	
	// Start of setters and getters
	public void setName(String name) {
		this.name = name;
		
	}
	
	public String getName() {
		return name;

	}
	
	public void setProblems(int problems) {
		this.problems = problems;
		
	}
	
	public int getProblems() {
		return this.problems;
		
	}
	
	public void setOperation(String operation) {
		this.operation = operation;
		
	}
	
	public String getOperation() {
		return operation;
		
	}
	
	public void setResponse(int response) {
		this.response = response;
		
	}
	
	public int getResponse() {
		return response;
	}
	
	public void setLongOper(String op) {
		switch (op) {
		case("a") :
		case("A") :
			this.longOper = "Addition";
		break;
		case("s") :
		case("S") :
			this.longOper = "Subtraction";
		}
	}
	
	public String getLongOper() {
		return longOper;
	}
	
	// This method returns problems
	public int setProblem() {
		int x = 0;
		int y = 0;
		int[] array = {x,y};
		array = getXY(x,y);
		x = array[0];
		y = array[1];
		int sum = x + y;
		
		switch(longOper) {
		
		case("Addition") : 
			
			System.out.println("");
			System.out.print(x + " + " + y + " = ");
			answer = sum;
			break;
		case("Subtraction") :
			
			System.out.println("");
			System.out.print(sum + " - " + y + " = ");
			answer = x;
			
		}
		return 0;
	}
	

	//This method gets randomized values for x and y
	public int[] getXY(int x, int y) {
		
		Random random = new Random();
		x = random.nextInt(10); 
		y = random.nextInt(10);
		int[] array = {x,y};
		return array;
		}
	
	// This method evaluates the users inputed response
	public int evalProblem() {
		if (response == answer) 
			System.out.println("Correct!");
		else 
			System.out.println("Incorrect. Correct answer is " + answer);
		
		return response;
	}
} 	// Start of main method
 
public class Robert_Tulmen_Project4 {


	public static void main(String[] args) {
		
		// initializes FlashCard and scanner object
		FlashCard fc = new FlashCard();
		Scanner input = new Scanner(System.in);
		
		// Prints welcome messages
		System.out.println("Welcome to the flashcard system!");
		System.out.println("The flashcard system provides flashcards for addition and subtraction.");
		System.out.println("The factors range from 0 to 9.\n");
		
		// Takes users input for name and type of operation
		System.out.print("Enter your name: ");
		fc.setName(input.next());
		System.out.print("Enter operation, A for addition, S for subtraction: ");
		fc.setOperation(input.next());
		fc.setLongOper(fc.getOperation());
		
		// Takes users input for how many problems they want to work
		System.out.print("How many problems would you like to work? ");
		fc.setProblems(input.nextInt());
		System.out.println();
		
		// Prints users inputs
		System.out.println("Welcome to the flashcard system, " + fc.name + ".");
		System.out.println("You have selected " + fc.longOper + " for " + fc.problems + " problems.\n");
		
		// Starts problems and gives response based on users inputs
		for (int i = 0; i < fc.getProblems(); i++) {
			fc.setProblem();
			fc.setResponse(input.nextInt());
			fc.evalProblem();
			}
		
		// Return thank you message after code has been run
				System.out.println("");
				System.out.print("Thank you for playing, " + fc.name);
				return;
			
	}

}