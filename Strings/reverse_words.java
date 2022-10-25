import java.util.*;
public class reverse_words 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = "Winter is coming";
        
        String ans = "", temp = "";
        for(int i=s.length()-1; i>=0; i--)
        {
            if(s.charAt(i) == ' ') 
            {
                ans += temp + " ";
                temp="";
            }
            else
            {
                temp = s.charAt(i) + temp;            // reverse string
            }
        }
        ans+=temp;

        System.out.println(ans);
    }    
}
