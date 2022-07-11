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
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        System.out.println(recur(m-1, n-1));
    }
    
    public static int recur(int m, int n)
    {
        if(m==0 && n==0) return 1;
        if(m==0 || n==0) return 1;
        return recur(m-1, n) + recur(n-1, m);
    }
}
