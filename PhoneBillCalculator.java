import java.util.Scanner;

public class PhoneBillCalculator {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        
        // requests base cost and overage minutes from user
        System.out.println("Enter the base cost of your plan: ");
        double baseCost = keyboard.nextDouble();
        System.out.println("Enter your overage minutes: ");
        int overageMinutes = keyboard.nextInt();
        keyboard.close();
        
        
        // calling methods and assigning return values to variables for easy access within main
        double overageAmount = overageFees(overageMinutes);
        double taxAmount = tax(overageAmount, baseCost);
        
        // calling total method to calculate and print total
        total(baseCost, overageAmount, taxAmount);
    }
    
    // method to calculate charge for going over minutes, if any
    public static double overageFees(double extraMinutes) {
        double overageFee = 0.25;
        double overageAmount = extraMinutes * overageFee;
        return overageAmount;
    }
    
    // method to calculate tax based on subtotal of overage fee and base cost
    public static double tax(double overageAmount, double baseCost) {
        double taxes = 0.15;
        double withoutTax = overageAmount + baseCost;
        double taxAmount = withoutTax * taxes;
        return taxAmount;
    }
    
    // method to calculate total and print bill statement to user
    public static void total(double baseCost, double overageAmount, double taxAmount) {
        System.out.println("Phone Bill Statement\nPlan: $" + baseCost +
                            "\nOverage: $" + overageAmount +
                            "\nTax: $" + taxAmount +
                            "\nTotal: $" + (baseCost + taxAmount + overageAmount));
    }
}
