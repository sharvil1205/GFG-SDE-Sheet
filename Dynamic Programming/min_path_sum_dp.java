import java.util.*;
public class min_path_sum_dp 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        /*
         Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.

        Note: You can only move either down or right at any point in time.

        Example 1:


        Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
        Output: 7
        Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
         */

         int row = sc.nextInt();
         int col = sc.nextInt();
         int[][] grid = new int[row][col];

         for(int i=0; i<row; i++)
         {
            for(int j=0; j<col; j++)
            {
                grid[i][j] = sc.nextInt();
            }
         }

         System.out.println(recur(grid, row-1, col-1));
         System.out.println(memo(grid, row-1, col-1, new int[row][col]));
         System.out.println(tabu(grid, row, col));
    }

    public static int recur(int[][] grid, int row, int col)
    {
        if(row==0 && col==0) return grid[row][col];
        if(row==0) return grid[row][col] + recur(grid, row, col-1);
        if(col==0) return grid[row][col] + recur(grid, row-1, col);

        return grid[row][col] + Math.min(recur(grid, row-1, col), recur(grid, row, col-1));
    }

    public static int memo(int[][] grid, int row, int col, int[][] dp)
    {
        if(row==0 && col==0) return dp[row][col] = grid[row][col];
        if(dp[row][col] != 0) return dp[row][col];
        if(row==0) return dp[row][col] = grid[row][col] + recur(grid, row, col-1);
        if(col==0) return dp[row][col] = grid[row][col] + recur(grid, row-1, col);

        return dp[row][col] = grid[row][col] + Math.min(recur(grid, row-1, col), recur(grid, row, col-1));
    }

    public static int tabu(int[][] grid, int row, int col)
    {
        int[][] dp = new int[row][col];
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(i==0 && j==0) dp[i][j] = grid[i][j];
                else if(i==0 && j!=0) dp[i][j] = grid[i][j] + grid[i][j-1];
                else if(j==0 && i!=0) dp[i][j] = grid[i][j] + grid[i-1][j];
                else dp[i][j] = grid[i][j] + Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }
        return dp[row-1][col-1];
    }
}
