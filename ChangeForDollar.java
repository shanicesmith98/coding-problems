import java.util.Scanner;
public class ChangeForDollar {
    /*
    Objective: Enter enough change to equal exactly $1.
    Your program should count up the value of all the change
    and determine if how much you have in pennies, nickels,
    dimes and quarters.
    */

    public static void main (String[] args) {
        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.10;
        double quarter = 0.25;
        double dollar = 1.00;
        double total = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many pennies? ");
        int numOfPennies = keyboard.nextInt();
        total = total + (numOfPennies * penny);

        System.out.print("How many nickels? ");
        int numOfNickels = keyboard.nextInt();
        total = total + (numOfNickels * nickel);

        System.out.print("How many dimes? ");
        int numOfDimes = keyboard.nextInt();
        total = total + (numOfDimes * dime);

        System.out.print("How many quarters? ");
        int numOfQuarters = keyboard.nextInt();
        total = total + (numOfQuarters * quarter);
        
        keyboard.close();

        if (total == dollar) {
            System.out.println("You won! You have a exactly $1!");
        }
        else if (total > dollar) {
            System.out.println("Oh no! You went over " + (total - dollar) + "!");
        }
        else {
            System.out.println("Sorry, you're short by " + (dollar - total) + "!");
        }
    }
}
