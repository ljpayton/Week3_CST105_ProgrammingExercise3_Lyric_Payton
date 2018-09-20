/** Program: Programming Exercise 3

* File: ProgrammingExercise3.java 
* Summary: This program is a guessing game that you gives you unlimited tries to guess the random number.

* Author: Lyric Payton

* Date: September 19, 2018

**/
import java.util.Random;
import java.util.Scanner;
	
public class ProgrammingExercise3 { 
	public static void main(String[] args) { 
		Random r = new Random();
		// generate random number
		int number = r.nextInt(10000) + 1;
		// Prompt the user to enter three numbers
	Scanner input = new Scanner(System.in);
	System.out.print("Enter your guess between 1 and 10000: ");
	int guess = input.nextInt();
	int min = 1;
	int max = 10000;
	int turns = 1;
	
	while (guess != number) {
		if(guess < min || guess > max) {
			System.out.println("INVALID");
		}
		else if (guess > number) {
			System.out.println("LOWER");
			max = guess - 1;
		}
		else { 
			System.out.println("HIGHER");
			min = guess + 1;
		}
		turns++;
		System.out.println("Enter your guess between " + min + " and " + max +":");
		guess = input.nextInt();
	} // end of while loop
		System.out.println("You win. It took you " + turns + " turns" );
		
	}
}