import java.util.Scanner;
public class bubble_sort 
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
        BubbleSort(arr);
        for(int i=0; i<n; i++)
        {
            System.out.println(arr[i]);
        }
    }

    static void BubbleSort(int arr[])
    {
        boolean swapped;
        for(int i=0; i<arr.length; i++)
        {
            swapped = false;
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped=false)
            {
                break;
            }
        }
    }
}