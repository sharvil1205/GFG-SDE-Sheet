import java.util.Scanner;
public class linear_search
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " number elements of the array");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter target number");
        int target = sc.nextInt();
        int ans = linearSearch(arr, target);
        System.out.println("Index of " + target + " in the given array = " + ans); 
    }

    static int linearSearch(int[] arr, int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }   
}