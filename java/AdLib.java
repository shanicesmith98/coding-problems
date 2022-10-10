import java.util.Scanner;

class AdLib {
  public static void main(String[] args) {

    /*
    Challenge:
    Create a program that asks a user for a season of
    the year, then a whole number, then an adjective.
    And use the input to complete the sentence below.
    Output the result.
    */
    
    System.out.println("Enter a season: ");
    Scanner scanner = new Scanner(System.in);
    String season = scanner.nextLine();

    System.out.println("Enter an adjective: ");
    String adj = scanner.nextLine();

    System.out.println("Enter a whole number: ");
    int num = scanner.nextInt();

    scanner.close();

    System.out.print("On a " + adj + " " + season + " day, I drink a minimum of " + num + " cups of coffee.");
  }
}