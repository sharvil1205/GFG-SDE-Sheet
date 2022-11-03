import java.util.*;
public class max_sum_without_adjacent_elements 
{
    public static void main(String[] args) 
    {
        /* Given an array Arr of size N containing positive integers. Find the maximum sum of a subsequence such that no two numbers in the sequence should be adjacent in the array.

        Example 1:

        Input:
        N = 6
        Arr[] = {5, 5, 10, 100, 10, 5}
        Output: 110
        Explanation: If you take indices 0, 3 and 5, then Arr[0]+Arr[3]+Arr[5] = 5+100+5 = 110. */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array n");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter elements of the array: ");

        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        
        System.out.println("Max Sum without adjacent elements using recurion: " + recur(a, n-1));
        System.out.println("Max sum without adjacent elements using memoization: " + memo(a, n-1, new int[n]));
        System.out.println("Max sum without adjacent elements using tabulation: " + tabu(a, n));
        System.out.println("Max sum without adjacent elements using tabulation + space optimization: " + tabu_space(a, n));

        sc.close();
    }    

    static int recur(int[] a, int n)                                        // recursion
    {
        if(n<0) return 0;
        int var1 = a[n] + recur(a, n-2);
        int var2 = recur(a, n-1);
        return Math.max(var1, var2);
    }

    static int memo(int[] a, int n, int[] dp)                               // memoization
    {
        if(n<0) return 0;
        if(dp[n]!=0) return dp[n];
        int var1 = a[n] + memo(a, n-2, dp);
        int var2 = memo(a, n-1, dp);
        return dp[n] = Math.max(var1, var2);
    }

    static int tabu(int[] a, int n)                                         // tabulation
    {
        int[] dp = new int[n];
        if(n==1) return a[0];
        dp[0] = a[0];
        dp[1] = Math.max(a[0], a[1]);
        for(int i=2; i<n; i++)
        {
            dp[i] = Math.max(a[i] + dp[i-2], dp[i-1]);
        }
        return dp[n-1];
    }

    static int tabu_space(int[] a, int n)                                         // tabulation + space optimization
    {
        if(n==1) return a[0];
        int secondLast = a[0];
        int last = Math.max(a[0], a[1]);
        if(n==2) return last;
        int curr=0;
        for(int i=2; i<n; i++)
        {
            curr = Math.max(a[i] + secondLast, last);
            secondLast = last;
            last = curr;
        }
        return curr;
    }   
}