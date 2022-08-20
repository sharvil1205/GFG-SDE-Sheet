/* Given an array of N integers. Find the first element that occurs K number of times. Example 1:

Input :
N = 7, K = 2
A[] = {1, 7, 4, 3, 4, 8, 7}
Output :
4
Explanation:
Both 7 and 4 occur 2 times. 
But 4 is first that occurs 2 times
As at index = 4, 4 has occurred 
atleast 2 times whereas at index = 6,
7 has occurred atleast 2 times.*/

import java.util.*;
public class first_element_to_occur_k_times 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of elements in the array n: ");
        int n = sc.nextInt();
        System.out.print("Enter " + n + " elements of the array: ");
        int[] a = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();            
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.println("First element that occurs k number of times: " + firstKelement(a,n,k));
        
        sc.close();
    }    

    static int firstKelement(int[] a, int n, int k)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            if(map.containsKey(a[i]))
            {
                map.put(a[i], map.get(a[i])+1);
            }
            else map.put(a[i],1);
            
            if(map.get(a[i]) == k) return a[i];
        }
        return -1;
    }
}
