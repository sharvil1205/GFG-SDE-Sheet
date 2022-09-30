import java.util.*;
public class longest_common_substring 
{
    public static void main(String[] args) 
    {    
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String s1 = sc.next();
        System.out.print("Enter second string: ");
        String s2 = sc.next();

        System.out.println(tabu(s1, s2, s1.length(), s2.length()));
    }
    
    static int tabu(String s1, String s2, int m, int n)                  // tabulation
    {
        int max =0;
        int[][] dp = new int[m+1][n+1];
        for(int i=1; i<=m; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(s1.charAt(i-1) == s2.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                max = Math.max(max, dp[i][j]);
            }
        }
        return max;
    }   
}