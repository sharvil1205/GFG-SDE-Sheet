/* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]. */

import java.util.*;
public class two_sum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] nums = {2,7,11,15};
        int target=9;

        for(int i:twoSum2(nums, target))
        {
            System.out.print(i+ " ");
        }
    }    
    static int[] twoSum1(int[] nums, int target)                // Brute force method (O(n*n) complexity)
    {
        int[] arr = new int[2];
        for(int i=0; i<nums.length-1; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[i]+nums[j] == target)
                {
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
        }
        return arr;
    }

    static int[] twoSum2(int[] nums, int target)                     // Optimized method using Hashmap O(n)
    {
        int[] arr = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                arr[0]=map.get(target-nums[i]);
                arr[1]=i;
                return arr;
            }
            else map.put(nums[i],i);
        }
        return arr;
    }
}