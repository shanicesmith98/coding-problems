import java.util.Scanner;
import java.io.*;
public class RockPaperScissors {

    // method for user input, returns string value
    public static String userChoice(String userInput) {
        String userMove = userInput.toLowerCase();
        if (userMove.equals("rock") || userMove.equals("paper") || userMove.equals("scissors") || userMove.equals("bomb")) {
            return userMove;
        } else {
            return "Error! Wrong Move!";
        }
    }

    // method for npc input, returns string value
    public static String npcChoice() {
        // generates a random int between 1 - 3
        int npcInput = (int)(Math.random() * 3) + 1;
        String npcMove = "";
        switch (npcInput) {
            case 1:
                npcMove = "rock";
                break;
            case 2:
                npcMove = "paper";
                break;
            case 3:
                npcMove = "scissors";
                break;
        }
        return npcMove;
    }

    // method for compare & declare winner, no return value
    public static void makeWinner(String user, String computer) {
        if (user.equals(computer)) {
            System.out.println("It\'s a tie!");
        }
        
        else if (user.equals("bomb")) {
            System.out.println("You win! Thank your secret weapon ;)");
        }

        else if (user.equals("rock")) {
            if (computer.equals("paper")) {
                System.out.println("The computer wins!");
            }
            else {
                System.out.println("You win!");
            }
        }

        else if (user.equals("paper")) {
            if (computer.equals("scissors")) {
                System.out.println("The computer wins!");
            }
            else {
                System.out.println("You win!");
            }
        }

        else if (user.equals("scissors")) {
            if (computer.equals("rock")) {
                System.out.println("The computer wins!");
            }
            else {
                System.out.println("You win!");
            }
        }
    }
    
    // play game method
    public static void playGame () {
        Scanner keyboard = new Scanner(System.in);
        
        // isTie will determine if the while loop is activated
        boolean isTie = false;
        
        // users can enter their name
        System.out.println("Enter your name, player");
        String userName = keyboard.nextLine();
        
        // assign the return value to variable
        String computer = npcChoice();
        
        // users input their move of choice: paper, rock, scissors, or bomb (secret move)
        System.out.print("Make your move, " + userName + "\nRock, Paper, Scissors?: ");
        String usersInput = keyboard.nextLine();

        // assign the return value to variable
        String user = userChoice(usersInput);
        
        // display the moves by players
        System.out.println("NPC Move: " + computer);
        System.out.println("Your Move: " + user);
        
        // displays the winning result
        makeWinner(user, computer);
        
        // if there's a tie, the while loop will begin    
        if (user.equals(computer)) {
            isTie = true;
        } else {
            isTie = false;
        }
         
        // restarts the game until there's a clear winner, no tie   
        while (isTie) {
            computer = npcChoice();
        
            System.out.print("Make your move, " + userName + "\nRock, Paper, Scissors?: ");
            usersInput = keyboard.nextLine();
    
            user = userChoice(usersInput);
            System.out.println("NPC Move: " + computer);
            System.out.println("Your Move: " + user);
                
            makeWinner(user, computer);
                
            if (user.equals(computer)) {
                isTie = true;
            } else {
                // will break out of while loop once no longer is tie
                isTie = false;
                break;
            }
        }
    }

    public static void main(String[] args) {
        // calls the game method
        playGame();
    }
}