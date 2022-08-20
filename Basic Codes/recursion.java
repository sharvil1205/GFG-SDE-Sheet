import java.util.*;

public class recursion
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        System.out.println(binarySearch(arr, 4, 0, 4));
    }

    static int binarySearch(int[] arr,int target, int s, int e)
    {
        int m=s+(e-s)/2;
        if(e<s)
        {
            return -1;
        }
        if(target==arr[m])
        {
            return m;
        }
        if(target>arr[m])
        {
            return binarySearch(arr, target, m+1, e);
        }
        else
        {
            return binarySearch(arr, target, s, e-1);
        }
    }
}