import java.util.*;

public class merge_sort 
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
        
        mergeSortDivide(a,0,n-1);
        for(int i=0; i<n; i++)
        {
            System.out.print(a[i] + " ");
        }
        
        sc.close();
    }
    
    static void mergeSortDivide(int[] a, int si, int ei)
    {
        if(si>=ei) return;

        int mid = si + (ei-si)/2;
        mergeSortDivide(a, si, mid);
        mergeSortDivide(a, mid+1, ei);
        mergeSortConquer(a, si, mid, ei);
    }

    static void mergeSortConquer(int[] a, int si, int mid, int ei)
    {
        int[] merged = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;
        while(idx1 <= mid && idx2 <= ei)
        {
            if(a[idx1] <= a[idx2])
            {
                merged[x++] = a[idx1++];
            }
            else
            {
                merged[x++] = a[idx2++];
            }
        }

        while(idx1 <= mid)
        {
            merged[x++] = a[idx1++];
        }

        while(idx2 <= ei)
        {
            merged[x++] = a[idx2++];
        }

        for(int i=0, j=si; i<merged.length; i++, j++)
        {
            a[j] = merged[i];
        }
    }
}
