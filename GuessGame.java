/* 
Name: Shanice Smith
Date: 03/27/2020
Assignment: Homework #4
*/

import java.util.Scanner;
import java.util.Random;

public class GuessGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int i = 0; // counter for tries

        System.out.println("Let's play a guessing game!");
        System.out.println("I will think of a number between 1 and 100 and I will allow you to guess until you get it.\nFor each guess, I will tell you whether the right answer is higher or lower.");

        System.out.println("\nI am thinking of a number between 1 and 100...");
        int randNum = r.nextInt((100)+1); // generates random integer between 1 and 100

        System.out.print("Your guess? ");
        int guessNum = keyboard.nextInt();

        if (guessNum > randNum) {
            System.out.println("It's lower.");
        }
        if (guessNum < randNum) {
            System.out.println("It's higher.");
        }

        i++; // increases to number of tries to 1

        while (guessNum != randNum) {
            System.out.print("Your guess? ");
            guessNum = keyboard.nextInt();

            if (guessNum > randNum) {
                System.out.println("It's lower.");
            }
            if (guessNum < randNum) {
                System.out.println("It's higher.");
            }
    
            i++; 
        }
        keyboard.close();
        System.out.println("You got it right in " + i + " guesses");
    }
}
