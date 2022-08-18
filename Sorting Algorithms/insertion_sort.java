import java.util.*;
public class insertion_sort 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " + n + " elements of the array: ");
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }

        insertionSort(a, n);

        System.out.println("Elements of the array after insertion sort: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
    
    static void insertionSort(int[] a, int n)
    {
        if(n==1) return;

        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j>0; j--)
            {
                if(a[j] < a[j-1])
                {
                    a[j] = a[j] ^ a[j-1];
                    a[j-1] = a[j] ^ a[j-1];
                    a[j] = a[j] ^ a[j-1];
                }
                else 
                {
                    break;
                }
            }
        }
    }
}
