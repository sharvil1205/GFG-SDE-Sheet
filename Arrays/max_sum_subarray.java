import java.util.*;
public class max_sum_subarray 
{

    /* Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
 */

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();
        
        System.out.print("Enter " + n + " array elements: ");
        int[] a = new int[n];

        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
       System.out.println("Maximum subarray sum using brute force method: " + brute_force(a)); 
       System.out.println("Maximum subarray sum using Kadane's algorithm: " + kadane(a));
    }    

    static int brute_force(int[] a)                 // Brute force algorithm with O(n*n) complexity
    {
        int max = Integer.MIN_VALUE, sum = 0;
        for(int i=0; i<a.length; i++)
        {
            sum=0;
            for(int j=0; j<a.length; j++)
            {
                sum += a[j];
                max = Math.max(sum,max);
            }
        }
        return max;
    }

    static int kadane(int[] a)                                       // kadane's algorithm
    {
        int max = Integer.MIN_VALUE, sum = 0;
        for(int i=0; i<a.length; i++)
        {
            sum += a[i];
            max = Math.max(sum, max);

            if(sum<0) sum=0;
        }
        return max;
    }
}
