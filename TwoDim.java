import java.util.Scanner;
public class TwoDim
{
    // intro to 2d arrays
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		
		int[][] scores = new int[3][4]; // there's 3 rows going down and 4 columns going across
		
		for (int row = 0; row  < 3; row++) {
		    for (int col = 0; col < 4; col++) {
		        System.out.println("Enter a score");
		        scores[row][col] = keyboard.nextInt();
		    }
		}
		// print each element of the array going across columns then down the rows
		for (int row = 0; row  < 3; row++) {
		    for (int col = 0; col < 4; col++) {
		        System.out.print(scores[row][col] + " ");
		        
		    }
		    System.out.println();
		}
	}
}
