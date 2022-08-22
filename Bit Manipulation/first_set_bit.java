import java.util.*;
public class first_set_bit 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        
        System.out.println("First set bit is at position: " + firstSetBit(n));
    }
    
    static int firstSetBit(int n)
    {
        int pos = 1;
        while(n>0)
        {
            if((n&1)==1) return pos;

            pos++;
            n = n>>1;
        }
        return 0;
    }
}
