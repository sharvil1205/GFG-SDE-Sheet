/* Given an array A of positive integers. Your task is to find the leaders in the array. 
An element of array is leader if it is greater than or equal to all the elements to its right side. 
The rightmost element is always a leader.  */

import java.util.*;
public class leaders_of_array 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of elements in the array n: ");
        int n = sc.nextInt();
        System.out.print("Enter " + n + " elements of the array: ");
        int[] a = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();            
        }
        System.out.println("Leaders of the array: " + leaders(a,n));
    }
    
    static ArrayList<Integer> leaders(int arr[], int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[n-1]);
        int max = arr[n-1];
        for(int i=n-2; i>=0; i--)
        {
            if(arr[i]>=max) 
            {
                list.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(list);
        return list;
    }
}
