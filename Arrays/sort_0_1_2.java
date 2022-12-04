/* Sort an array of 0s 1s 2s */

import java.util.*;
public class sort_0_1_2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,1,0,2,1,0,0,0};
        int cnt0=0, cnt1=0, cnt2=0;
        for(int i:arr)
        {
            if(i==0) cnt0++;
            else if(i==1) cnt1++;
            else cnt2++;
        }    
        int i=0;
        while(cnt0-->0) arr[i++]=0;
        while(cnt1-->0) arr[i++]=1;
        while(cnt2-->0) arr[i++]=2;

        for(int j:arr) System.out.print(j+" ");
    }    
}