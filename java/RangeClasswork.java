public class RangeClasswork
{
    // find the max, min and range of the array elements
	public static void main(String[] args) {
		int[] numbers = {4, 27, 20, 74, 38, 19};
		int max = numbers[0];
		int min = numbers[0];
		int range = max - min;
		
		for (int i = 1; i < numbers.length; i++) {
		    if (numbers[i] > max)
		        max = numbers[i];
		    if (numbers[i] < min)
		        min = numbers[i];
		    range = max - min;
		}
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		System.out.println("Range: " + range);
    }
}