    /*
    Leetcode question #53 - Maximum Subarray
    
    Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
    */

    /* 
    
    Leetcode results - 
    Runtime: 1 ms, faster than 92.91% of Java online submissions for Maximum Subarray.
    Memory Usage: 49.4 MB, less than 43.67% of Java online submissions for Maximum Subarray.
    
    */

class Solution {
    public int maxSubArray(int[] nums) {
        int local_max = 0;
        int global_max = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++)
        {
            local_max = Math.max(nums[i], nums[i] + local_max);
            
            if (local_max > global_max)
            {
                global_max = local_max;
            }
        }
        return global_max;
    }
}
