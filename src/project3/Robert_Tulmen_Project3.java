package project3;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Robert_Tulmen_Project3 {

    public static void main(String args[]) {
    	
    	/*
    	 * Name: Robert Tulmen	Section#: 005
    	 * Implement a Java program that simulates the game of Battleship.  The game is played in a “Sea”,
    	 * a 1-dimenstional array, and the battleship is randomly located in the sea.  The user guesses 
    	 * locations (index values) in attempts to find (hit) the battleship.  When all the battleship index 
    	 * values are guessed (hit), the battleship is sunk, and the game is over.
    	 */
    	
    	
    	
    	// Declaring arrays
        int[] sea = new int[20];
        int[] hit = new int[20];
        Arrays.fill(sea , 0);
        Arrays.fill(hit , 0);

        // populating ship1 with Random 
        Random rand = new Random();
        int ship1 = rand.nextInt(15);

        for(int i = 0,j = ship1; i < 4; i++, j++){
            sea[j] = 1;
        }

        //declare vars and scanner
        int sum = 0;
        int guess = 0;
        int guesses = 0;
        Scanner input = new Scanner(System.in);

        // Loop to stop game once guesses have been reached
        while(sum < 4){
            //user input
            System.out.print("Enter an index value to try to hit the battleship: ");
            guess = input.nextInt();
            guesses++;

            if(sea[guess] == 1){
                System.out.println("HIT!");
                //mark hit array
                hit[guess] = 1;

                //recalculate sum
                sum = 0;
                for(int i = 0; i < 20; i++)
                    sum += hit[i];
            }
            if(sea[guess] == 0){
                System.out.println("MISS!");
            }
        } 
        
        // Prints ending message showing guesses and ship location in sea array
        printArr(sea, "Sea");
        printArr(hit, "Hit");
        System.out.println();
        System.out.println("\nCongratulations On sinking the battleship!");
        System.out.println("It took you " + guesses + " guesses.");
        
    } // End of main method
    
    // Method for printing arrays
    private static void printArr(int[] array, String arrayName) {
        System.out.println("\n" + arrayName);
        for(int i = 0; i < 20; i++)
            System.out.print(array[i]);
    }
}