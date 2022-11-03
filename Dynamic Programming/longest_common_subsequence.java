import java.util.*;
public class longest_common_subsequence 
{

    /* Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.

A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

For example, "ace" is a subsequence of "abcde".
A common subsequence of two strings is a subsequence that is common to both strings.

 

Example 1:

Input: text1 = "abcde", text2 = "ace" 
Output: 3  
Explanation: The longest common subsequence is "ace" and its length is 3. */
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String s1 = sc.next();
        System.out.print("Enter string 2: ");
        String s2 = sc.next();
        
        System.out.println("Length of longest common subsequence using recursion: " + recur(s1,s2,0,0));
        System.out.println("Length of longest common subsequence using memoization: " + memo(s1, s2, 0, 0, new int[s1.length()][s2.length()]));
        System.out.println("Length of longest common subsequence using tabulation: " + tabu(s1, s2));

        sc.close();
    }
    
    static int recur(String s1, String s2, int i, int j)
    {
        if(i==s1.length() || j==s2.length()) return 0;
        if(s1.charAt(i) == s2.charAt(j)) return 1 + recur(s1, s2, i+1, j+1);
        return Math.max(recur(s1, s2, i+1, j), recur(s1, s2, i, j+1));
    }
    
    static int memo(String s1, String s2, int i, int j, int[][] dp)
    {
        if(i==s1.length() || j==s2.length()) return 0;
        if(dp[i][j]!=0) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j)) return dp[i][j] = 1 + memo(s1, s2, i+1, j+1, dp);
        return dp[i][j] = Math.max(memo(s1,s2,i+1,j,dp), memo(s1, s2, i, j+1, dp));
    }    
    
    static int tabu(String s1, String s2)
    {
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        for(int i=1; i<=s1.length(); i++)
        {
            for(int j=1; j<=s2.length(); j++)
            {
                if(s1.charAt(i-1) == s2.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[s1.length()][s2.length()];
    }
}
