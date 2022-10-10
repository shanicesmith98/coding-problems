import java.util.Scanner;
public class ArrayPractice {
    public static void main(String[] args) {
        // users input the number of employees
        Scanner keyboard = new Scanner(System.in);
        int employees = keyboard.nextInt();
        
        // hours array size is fixed by number of employees variable
        int [] hours = new int[employees];
        
        // inputs the hours worked based on array size
        // since loops starts with zero, minus one from array length
        for (int i = 0; i <= hours.length - 1; i++) {
            System.out.println("Enter the number of hours worked by Employee " + (i+1));
            hours[i] = keyboard.nextInt();
        }
        
        // test statement
        System.out.println("Done! Let's see if this works :)");
        keyboard.close();
        
        // iterates over array length to display employee hours and overtime
        for (int j = 0; j <= hours.length - 1; j++) {
            System.out.println("Employee " + (j+1) + " has worked " + hours[j] + " hours");
            isOvertime(hours, j);
        }
        
    }
    
    // method to determine if overtime pay was earned
    public static void isOvertime(int a[], int index) {
        int overtime = 44;
        if (a[index] > overtime) {
            System.out.println("Employee deserves over time pay!");
        }
        else {
            System.out.println("Employee didn't earn over time pay!");
        }
    }
}
