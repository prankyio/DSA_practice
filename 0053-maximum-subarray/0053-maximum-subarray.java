class Solution {
    public int maxSubArray(int[] nums) {
        // Start both the global max and current running max with the first element
        int maxSoFar = nums[0];
        int currentMax = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            // Decide whether to add the current element to the existing subarray 
            // or start a brand new subarray from the current element
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            
            // Update the global maximum if the current subarray sum is larger
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        
        return maxSoFar;
    }
}
