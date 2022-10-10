/*
Leetcode #523
Task: Given a list of non-negative numbers and a target integer k,
write a function to check if the array has a continuous subarray of
size at least 2 that sums up to a multiple of k, that is, sums up
to n*k where n is also an integer.
*/
var checkSubarraySum = function(nums, k) {
    let sum = 0;
    for (let i = 0; i < nums.length - 1; i++) {
        sum = nums[i]; // stores elements of arr to sum
        for (let j = i + 1; j < nums.length; j++) {
            sum += nums[j]; // stores consecutive arr elements into sum
            if (sum % k === 0 || sum === k) // checks if potential subarrays equal to target
                return true;
        }
    } 
    return false;
};
