import java.util.*;
public class selection_sort 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements of the array");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        SelectionSort(arr,n);
        
        for(int i=0; i<n; i++)
        {
            System.out.println(arr[i]);
        }
    }
    static void SelectionSort(int[] arr, int n)
    {
        for(int i=0; i<n-1; i++)
        {
            int min = i;
            for(int j=i+1; j<n; j++)
            {
                if(arr[j]<arr[min]) min=j;
            }
            
            if(min==i) continue;
            
            arr[i] = arr[i] ^ arr[min];
            arr[min] = arr[i] ^ arr[min];
            arr[i] = arr[i] ^ arr[min];
        }   
    }    
}