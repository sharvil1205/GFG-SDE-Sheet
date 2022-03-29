import java.util.Scanner;
public class binary_search 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements in the array");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be searched");
        int element = sc.nextInt();
        int num_position = binarySearch(arr, element);
        System.out.println("Position of " + element + " in the given array is " + num_position);
    }
    static int binarySearch(int arr[], int element)
    {
        int low = 0;
        int high = arr.length-1;
        int mid;

        // Check if sorted array is ascending or descending
        boolean isAscending = arr[low] < arr[high];
        
        while(low<=high)
        {
            mid = low + (high-low)/2;
            if(arr[mid]==element)
            {
                return mid;
            }
            if(isAscending)
            {
                if(arr[mid]>element)
                {
                    high = mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
            else
            {
                if(arr[mid]<element)
                {
                    high = mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
        }
        return -1;
    }
}