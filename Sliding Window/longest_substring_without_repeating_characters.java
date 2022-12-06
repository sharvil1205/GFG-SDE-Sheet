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
        int i=0, j=0, max=0;
        Set<Character> set = new HashSet<>();
        while(j<s.length())
        {
            if(!set.contains(s.charAt(j)))            //  add unique characters to set and keep count of max length of substring
            {
                set.add(s.charAt(j++));
                max=Math.max(max, j-i);
            }
            else set.remove(s.charAt(i++));          // if set contains the character, remove it and increment i (sliding window)
    }
    return max;        
    }
}
