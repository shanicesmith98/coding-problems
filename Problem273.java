import java.util.Arrays;

public class Problem273 {
    /*
    This problem was asked by Apple.

    A fixed point in an array is an element whose value is equal to its index.
    Given a sorted array of distinct elements, return a fixed point, if one exists.
    Otherwise, return False.

    For example, given [-6, 0, 2, 40], you should return 2. Given [1, 5, 7, 8], you should return False.
    */
    
    public static int fixedPoint(int[] a) {
        int noFixed = -1; // equal to False
        Arrays.sort(a); // sort the array if not already sorted
        
        // iterates over array to find matching index and array element
        for(int i = 0; i <= a.length - 1; i++) {
            if (a[i] == i) {
                return a[i];
            }
        }
        return noFixed;
    }

     public static void main(String []args){
         int sample[] = {-17, 40, 20, 2};
         int neg = fixedPoint(sample);
         System.out.println(neg);
         
         int prob[] = {2, 40, -6, 0};
         int pos = fixedPoint(prob);
         System.out.println(pos);
        
     }
}
