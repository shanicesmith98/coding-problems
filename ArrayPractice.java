import java.util.Scanner;
public class ArrayPractice {
    public static void main(String[] args) {
        int employees = 3;
        int [] hours = new int[employees];
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i <= hours.length - 1; i++) {
            System.out.println("Enter the number of hours worked by Employee " + (i+1));
            hours[i] = keyboard.nextInt();
        }
        System.out.println("Done! Let's see if this works :)");
        keyboard.close();

        for (int j = 0; j <= hours.length - 1; j++) {
            System.out.println("Employee " + (j+1) + " has worked " + hours[j] + " hours");
        }
    }
}
