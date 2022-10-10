import java.util.Arrays;
public class ArrayPracticeTwo {
    
    // using built in method "equals" to check if two arrays are equal, returns boolean
    public static boolean isEqual(String[] a, String[] b) {
        if(Arrays.equals(a, b))
            return true;
        else
            return false;
    }

    // using built in method "toString" to get and print values of array
    public static void printArray(String[] a) {
        System.out.println(Arrays.toString(a));
    }
    
    // using built in method "sort" to values from smallest to largest
    public static void Sorting(int[] a) {
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
    
    // using built in method "arraycopy" to copy array elements
    // only works if array size is equal
    // since array is created in main and length can't be changed
    public static void makeCopy(String[] a, String[] b) {
        System.arraycopy(a, 0, b, 0, a.length);
        // first parameter = source array
        // second parameter = source initial index/starting point
        // third parameter = assigned array
        // fourth parameter = assigned initial index/starting point
        // fifth parameter = assigned array length
    }

     public static void main(String []args){
         
        String[] classOne = {"Kia", "Nelly", "Heaven"};
        String[] classTwo = {"Kia", "Heaven", "Nelly"};
        String[] classThree = {"Kia", "Heaven", "Nelly"};
        String[] houseItems = {"Paper Towels", "Reuseable Bags", "Gloves", "Cleaning Spray", "Will to Live"};
        int[] grades = {86, 100, 100, 99, 91, 90, 79};
        
        Boolean firstResult = isEqual(classOne, classTwo);
        Boolean secondResult = isEqual(classThree, classTwo);
        String[] shoppingList = new String[5];
        makeCopy(houseItems, shoppingList);
        
        System.out.println(firstResult);
        System.out.println(secondResult);

        printArray(classTwo);
        Sorting(grades);
        printArray(shoppingList);

     }
}
