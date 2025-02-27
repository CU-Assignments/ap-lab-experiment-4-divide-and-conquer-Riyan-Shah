class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize the current sum and max sum with the first element
        int currentSum = nums[0];
        int maxSum = nums[0];
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Update currentSum to either the current element itself or add it to the existing currentSum
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            
            // Update maxSum if currentSum is greater than maxSum
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}
