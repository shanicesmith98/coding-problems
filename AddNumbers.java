import java.util.Scanner;
public class AddNumbers
{
  public static void main (String[]args)
  {
    boolean again;
    double a, b, sum;

    Scanner keyboard = new Scanner (System.in);

    do
      {
	System.out.print ("Enter your first number: ");
	a = keyboard.nextDouble ();

	System.out.print ("Enter your second number: ");
	b = keyboard.nextDouble ();

	sum = a + b;

	System.out.println ("The sum of the two number is " + sum);

	System.out.println ("Do you want to calculate again?");
	again = keyboard.nextBoolean ();
      } while (again);

    keyboard.close ();
    System.out.println ("All done!");
  }
}
