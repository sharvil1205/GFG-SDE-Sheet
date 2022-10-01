import java.util.*;
public class longest_common_prefix 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.next();
        }
        System.out.println("longest common prefix: " + method1(arr, arr.length));
        System.out.println("longest common prefix: " + method2(arr, n));
    }   
    
    static String method1(String[] arr, int n)          // method 1                     
    {
        String pre = "";
        int current_index = 0;
        for(int i=0; i<arr[0].length(); i++)
        {
            char ch = arr[0].charAt(current_index);  
            String temp = pre+ch;
            for(int j=1; j<arr.length; j++)
            {
                if(current_index >= arr[j].length() || arr[j].indexOf(temp)!=0) return pre;       
            }
            current_index++;
            pre=temp;
        }
        return pre;
    }

    static String method2(String[] arr, int n)              // better method (but uses inbuilt sort method)
    {
        if(arr.length == 0) return "";

        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[n-1];

        String pre = "";

        int c = 0;
        while(c<first.length())
        {
            if(first.charAt(c) == last.charAt(c))
            {
                pre += first.charAt(c);
                c++;
            }
            else
            {
                break;
            }
        }

        if(c == 0) return "";
        else return pre;
    }
}