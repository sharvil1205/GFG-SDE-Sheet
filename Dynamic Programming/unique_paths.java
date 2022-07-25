import java.util.*;
public class unique_paths 
{
    public static void main(String[] args)
    {

        /*  There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.

            Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.

            The test cases are generated so that the answer will be less than or equal to 2 * 109.

            Example 1:

            Input: m = 3, n = 7
            Output: 28   */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int n = sc.nextInt();
        
        System.out.println("Total number of unique paths using recursion: " + recur(m-1, n-1));
        System.out.println("Total number of unique paths using memoization: " + memo(m-1, n-1, new int[m][n]));
        System.out.println("Total number of unique paths using tabulation: " + tabu(m, n));
    }
    
    public static int recur(int m, int n)
    {
        if(m==0 && n==0) return 1;                                            // base case
        if(m==0 || n==0) return 1;                                            // if a row == 0 or col == 0 there is only one path from there. 
        return recur(m-1, n) + recur(n-1, m);                                 // add the total paths
    }

    public static int memo(int m, int n, int[][] dp)
    {
        if(m==0 && n==0) return dp[m][n] = 1;
        if(dp[m][n] != 0) return dp[m][n];
        if(m == 0 || n == 0) return dp[m][n] = 1;
        return dp[m][n] = memo(m-1, n, dp) + memo(m, n-1, dp);
    }

    public static int tabu(int m, int n)
    {
        int dp[][] = new int[m][n];
        dp[0][0] = 1;
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==0 || j==0) dp[i][j] = 1;
                else dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}