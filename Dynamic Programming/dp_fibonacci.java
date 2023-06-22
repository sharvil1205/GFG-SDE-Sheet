import java.util.*;

public class dp_fibonacci
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        

        System.out.println("Fibonacci series of term " + n  + " using Iteration: " + iter(n));
        System.out.println("Fibonacci series of term " + n  + " using Normal Recursion: " + recur(n));
        System.out.println("Fibonacci series of term " + n  + " using Memoization: " + memo(n, new int[n+1]));
        System.out.println("Fibonacci series of term " + n  + " using Tabulation: " + tabu(n));
        System.out.println("Fibonacci series of term " + n  + " using Tabulation + Space Optimization: " + tabu_space(n));
        
        sc.close();
    }

    static int iter(int n)                                       // Iteration
    {
        int n1 = 0;
        int n2 = 1;
        while(n-->1)
        {
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        return n2;
    }

    static int recur(int n)                                      // Recursion
    {
        if(n<=1) return n;
        return recur(n-1) + recur(n-2);
    }

    static int memo(int n, int[] qb)                             // Memoization
    {
        if(n<2) return n;
        if(qb[n]!=0) return qb[n];
        return qb[n]=memo(n-1,qb)+memo(n-2,qb);
    }

    static int tabu(int n)                                      // Tabulation
    {
        if(n<=1) return n;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i<=n; i++)
        {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    static int tabu_space(int n)                                // Tabulation + Space Optimization
    {
        if(n<=1) return n;
        int secondLast = 0;
        int last = 1;
        int curr=0;
        for(int i=2; i<=n; i++)
        {
            curr = secondLast + last;
            secondLast = last;
            last = curr;
        }
        return curr;
    }
}