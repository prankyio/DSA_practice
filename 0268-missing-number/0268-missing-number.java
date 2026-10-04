class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        int n = nums.length;

        // Phase 1: Cyclic Sort
        while (i < n) {
            int correctIndex = nums[i];
            
            // If the current number is 'n', it belongs outside the array bounds, so skip it.
            // Otherwise, swap it to its correct index if it's not already there.
            if (nums[i] < n && nums[i] != nums[correctIndex]) {
                // Standard Swap
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                // Move forward ONLY if the current element is in its correct place or is 'n'
                i++;
            }
        }

        // Phase 2: Find the missing number
        for (int j = 0; j < n; j++) {
            if (nums[j] != j) {
                return j; // The index is the missing number
            }
        }

        // If all numbers from 0 to n-1 are in place, then 'n' is the missing number
        return n;
    }
}
