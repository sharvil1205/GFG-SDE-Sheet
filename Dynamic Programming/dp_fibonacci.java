import java.util.*;

public class dp_fibonacci
{
    static int fibo(int n, int[] qb)
    {
        if(n<2) return n;
        if(qb[n]!=0) return qb[n];
        qb[n]=fibo(n-1,qb)+fibo(n-2,qb);
        return fibo(n-1,qb) + fibo(n-2,qb);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Fibonacci series of term " + n  + " is: " + fibo(n, new int[n+1]));
    }
}