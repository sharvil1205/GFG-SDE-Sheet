import java.util.*;
public class quick_sort 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements of the array: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        quickSort(arr, 0, n-1);
        
        System.out.print("Sorted Array (using quick sort): ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }    
    }    
    public static void quickSort(int[] arr, int low, int high)
    {
        if(low>=high) 
        {
            return;
        }

        int s = low;
        int e = high;
        
        int pivot = arr[e];

        while(s<=e)
        {
            while(arr[s]<pivot)
            {
                s++;
            }
            while(arr[e]>pivot)
            {
                e--;
            }

            if(s<=e)
            {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        quickSort(arr, low, e);
        quickSort(arr, s, high);
    }
}
