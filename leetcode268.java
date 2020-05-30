/*
Leetcode 268. Missing Number
Task: Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
Solution from TheBluePrint YT
/*
class Solution {
    public int missingNumber(int[] nums) {
        // sum of "expected" nums array values stored in expectedSum
        int expectedSum = nums.length * (nums.length + 1)/2;
        int actualSum = 0;
   
        // keeps record of every value in the array in actualSum variable
        for (int i: nums) {
            actualSum += i;
        }
        
        // returns the missing number
        return expectedSum - actualSum;
    }
}
