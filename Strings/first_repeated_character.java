/* Given a string S. The task is to find the first repeated character in it. 
We need to find the character that occurs more than once and whose index of second occurrence is smallest. 
S contains only lowercase letters. */

import java.util.*;
public class first_repeated_character 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string of lowercase characters: ");
        String s = sc.next();
        
        firstRepChar1(s);
        
        sc.close();    
    }    
    
    static String firstRepChar(String s)                           // Method 1: using HashMap
    {   
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(map.containsKey(ch)) map.put(ch, map.get(ch)+1);
            else map.put(ch,1);
            
            if(map.get(ch)>1) return ""+ch;
        }
        return "-1";
    }

    static String firstRepChar1(String s)                         // Method 2: Using arrays (better method)
    {
        int[] a = new int[26];
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            a[ch-'a']++;
            if(a[ch-'a']>1) return ""+ch;
        }
        return "-1";
    }
}