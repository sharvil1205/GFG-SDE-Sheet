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

         System.out.println("Enter number of rows: ");
         int row = sc.nextInt();
         System.out.println("Enter number of columns: ");
         int col = sc.nextInt();

         int[][] grid = new int[row][col];
        
         System.out.println("Enter numbers of " + row + " by " + col + " matrix: ");
         for(int i=0; i<row; i++)
         {
            for(int j=0; j<col; j++)
            {
                grid[i][j] = sc.nextInt();
            }
         }

         System.out.println("Minimum path sum using recursion: "  + recur(grid, row-1, col-1));
         System.out.println("Minimum path sum using memoization: " + memo(grid, row-1, col-1, new int[row][col]));
         System.out.println("Minimum path sum using tabulation: " + tabu(grid, row, col));
    }

    public static int recur(int[][] grid, int row, int col)                                        
    {
        if(row==0 && col==0) return grid[row][col];                                                 // base case
        if(row==0) return grid[row][col] + recur(grid, row, col-1);                                 // row == 0 which means we have reached the last row and there is only one way from here(col-1)
        if(col==0) return grid[row][col] + recur(grid, row-1, col);                                 // col == 0 which means we have reached the last col and there is only one way from here(row-1)

        return grid[row][col] + Math.min(recur(grid, row-1, col), recur(grid, row, col-1));         // return the path with minimum value
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
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(i==0 && j==0) grid[i][j] = grid[i][j];
                else if(i==0 && j!=0) grid[i][j] = grid[i][j] + grid[i][j-1];
                else if(j==0 && i!=0) grid[i][j] = grid[i][j] + grid[i-1][j];
                else grid[i][j] = grid[i][j] + Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }
        return grid[row-1][col-1];
    }
}