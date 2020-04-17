import java.util.Random;
public class RollTheDie {
    public static void main(String[] args){
        int gameSpaces = 20; // number of game board spaces
        int currentSpace = 0; // starting point of game
        
        System.out.println("Welcome to the Roll of Dice Game.");
        Random random = new Random();
        int die = random.nextInt(6) + 1; // range of 1 - 5

        // for loop to replicate 5 rolls of the dice
        for (int i = 1; i <= 5; i++) {
            currentSpace = currentSpace + die; // adds current space to new dice roll to move player further on the board
            int spacesLeft = gameSpaces - currentSpace; // calculates how many spaces are left to reach end of board
            
            if (currentSpace == gameSpaces) {
                int winningRoll = i;
                System.out.println("Roll #" + i + ": You've rolled a " + die + ". Congrats, you've won on your " + winningRoll + " roll.");
                break; // breaks out of loop
            }
            else if (currentSpace < gameSpaces) {
                System.out.println("Roll #" + i + ": You've rolled a " + die + ". You are now on space " + currentSpace + " and have " + spacesLeft + " more to go.");
            }
            else if (currentSpace > gameSpaces) {
                System.out.println("Roll #" + i + ": Error.. You've rolled a " + die + " and gone off the board!");
                break;
            }
            
            die = random.nextInt(6) + 1; // generates a new random number for next loop increment
            
        }
        
        if (currentSpace < gameSpaces || currentSpace > gameSpaces) {
                System.out.println("Game over! You landed on ended on space " + currentSpace + " after 5 rolls. Try again next time!");
            }
    }
}
