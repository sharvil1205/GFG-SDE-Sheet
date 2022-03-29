import java.util.Scanner;
public class prime {
    public static void main(String[] args) 
    {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        for(int i=2; i<=n/2; i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(n<2 || flag==1)
        {
            System.out.println(n + " is not a prime number");
        }
        else
        {
           System.out.println(n + " is a prime number");
        }
    }    
}