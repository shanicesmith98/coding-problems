public class Change {
    double penny, pennies;
    double nickel, nickels;
    double dime, dimes;
    double quarter, quarters;
    double dollar;
    double total;

    public Change (int numOfPennies, int numOfNickels, int numOfDimes, int numOfQuarters) {
        pennies = numOfPennies;
        nickels = numOfNickels;
        dimes = numOfDimes;
        quarters = numOfQuarters;

        // define change values
        penny = 0.01;
        nickel = 0.05;
        dime = 0.10;
        quarter = 0.25;
        dollar = 1.00;
        total = 0;
    }

    // count the total of change
    public double Count() {
        total = total + (pennies * penny) + (nickels * nickel) + (dimes * dime) + (quarters * quarter);
        return total;
    }

    // determine if change is equal to dollar
    public String ChangeForDollar() {
        if (total == dollar) {
            return "You won! You have exactly $1!";
        }
        else if (total > dollar) {
           return "Oh no! You went over " + (total - dollar) + "!";
        }
        else {
            return "Sorry, you're short by " + (dollar - total) + "!";
        }
    }

    public static void main (String[] args) {
        // creates instances of class Change
        Change Ginger = new Change(0, 0, 0, 4);
        Change David = new Change(48, 10, 2, 2);
        Change Erica = new Change(6, 0, 5, 0);

        // display the instances through count + changefordollar method
        System.out.println(Ginger.Count());
        System.out.println(David.Count());
        System.out.println(Erica.Count());
        
        System.out.println(Ginger.ChangeForDollar());
        System.out.println(David.ChangeForDollar());
        System.out.println(Erica.ChangeForDollar());

    }

}
