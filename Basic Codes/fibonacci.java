import java.util.*;
public class fibonacci 
{
    /*static void fibo(int n)
    {
        int n1=0, n2=1, count=2, num;
        System.out.println(n1);
        System.out.println(n2);
        while(count!=n)
        {
            num=n1+n2;
            n1=n2;
            n2=num;
            System.out.println(num);
            count++;
        }
    }*/

     static int fibo(int n)
    {
        if(n<2) return n;
        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Fibonnacci series till " + n + " terms = ");
        System.out.println(fibo(n));
    }   
}