/*
Name: Shanice Smith
Exam 2

Prompt the user for the length and the width of a rectangle in inches
Convert to feet
Calculate the perimeter, which is twice the length plus twice the width
Calculate the area, which is length times the width
Print the perimeter in feet (The perimeter is ??)
Print the area in square feet (The area is ??)
*/
import java.util.Scanner;
public class Rectange
{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// prompt user for length/width of rectange in inches
		System.out.println("Enter the length of the rectangle in inches: ");
		double lengthInches = keyboard.nextDouble();
		System.out.println("Enter the width of the rectangle in inches: ");
		double widthInches = keyboard.nextDouble();
		keyboard.close();
		
		// convert inches to feet
		double lengthFeet = lengthInches / 12;
		double widthFeet = widthInches / 12;
		
		// calculations and print
		double perimeter = (lengthFeet * 2) + (widthFeet * 2);
		double area = lengthFeet * widthFeet;
		System.out.println("The perimeter is " + perimeter);
		System.out.println("The area is " + area);
	}
}
