import java.util.Scanner;
public class arraySearch
{
	public static void main(String[] args) {
	    Scanner keyboard = new Scanner(System.in);
		int[] nums = {87, 75, 98, 100, 82};
		System.out.print("Enter a value to search for: ");
		int search = keyboard.nextInt();
		
		int results;
		results = SS(nums, search);
		
		if (results == -1)
		    System.out.println("The value is not in the array");
		else
		    System.out.println("The value is in the array at " + (results+1));
    }
    // method to search for target values within an array
    public static int SS(int[] a, int value) {
        boolean found = false; // did we find the value?
        int element = -1; // position of values
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                element = i;
                found = true;
            }
        }
        return element;
    }
}
