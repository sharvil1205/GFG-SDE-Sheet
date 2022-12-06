import java.util.*;
public class longest_substring_without_repeating_characters 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println(lengthOfLongestSubstring("abcabca"));
    }   
    
    static int lengthOfLongestSubstring(String s) 
    {
        int i = 0, j=0, max=0, len=0;
        Set<Character> set = new HashSet<>();
        while(j<s.length())
        {
            if(!set.contains(s.charAt(j))) 
            {
                set.add(s.charAt(j++));
                len++;
                max=Math.max(len, max);
            }
            else
            {
                set.remove(s.charAt(i++));
                len--;
            }
    }
    return max;        
    }
}
