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
    
    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];          // pivot
        int i = (low - 1);
  
        for (int j = low; j <= high - 1; j++) 
        {
            if (arr[j] < pivot)                            // if current element is smaller than pivot
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return (i + 1);
    }
  

    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) 
        {
            int pi = partition(arr, low, high);          // pi is partitioning index, arr[p] is now at right place
  
            quickSort(arr, low, pi - 1);                 // Seperately sort elements before and after partition
            quickSort(arr, pi + 1, high);
        }
    }
}