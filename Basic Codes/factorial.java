import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class factorial {
    static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else if(n==1)
        {
            return n;
        }
        else
        {
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        if(n<0)
        {
            System.out.println("Factorial of " + n + " is not defined" );    
        }
        else
        {
            System.out.println("Factorial of " + n + " is " + fact(n));
        }
    }
}