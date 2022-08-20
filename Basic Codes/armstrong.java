import java.util.Scanner;
public class armstrong 
{
    public static void main(String[] args) 
    {
        int sum=0, r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int temp=n;
        while(n!=0)
        {
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(sum==temp)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not an Armstrong number");
        }

        sc.close();
    }   
}