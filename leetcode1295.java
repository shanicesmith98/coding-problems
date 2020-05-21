/* 1295. Find Numbers with Even Number of Digits

Given an array nums of integers, return how many of them contain an even number of digits. */

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
        // converts number element to string representation
        // if the length of string is even -> increases the count
            if (Integer.toString(nums[i]).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
