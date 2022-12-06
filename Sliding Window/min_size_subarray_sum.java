/* 
 Given an array of positive integers nums and a positive integer target, return the minimal length of a 
subarray
 whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 */

import java.util.*;
public class min_size_subarray_sum {
    
    public static void main(String[] args) 
    {
        int[] a = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7, a));
    }

    static int minSubArrayLen(int target, int[] nums)                       // sliding window
    {
        int i=0, j=0, min=Integer.MAX_VALUE, curr_sum=0, n=nums.length;    
        while(i<n)
        {
            if(curr_sum >= target)             // subtract nums[i] if curr_sum >= target (because we want to find minimum size of subarray)
            {
                min=Math.min(min, j-i);
                curr_sum -= nums[i++];
            }
            else if(j < n)                    // if(curr_sum < target) add nums[j]
            {
                curr_sum += nums[j++];
            }
            else break;                 // if j>n and curr_sum < target
        }
        if(min==Integer.MAX_VALUE) return 0;
        return min;
    }
}