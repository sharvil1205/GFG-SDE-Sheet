import java.util.*;
public class notes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = "Sharvil";

        System.out.println("charAt(3) : " + s.charAt(3));     // Returns the character at the specified index (position)

        System.out.println("compareTo('Sharvil'): " + s.compareTo("Sharvil"));      // Returns An int value: 0 if the string is equal to the other string.
        System.out.println("compareTo('Sharvill'): " + s.compareTo("Sharvill"));    //                       < 0 if the string is lexicographically less than the other string
        System.out.println("compareTo('Sharvi'): " + s.compareTo("Sharvi"));        //                       > 0 if the string is lexicographically greater than the other string (more characters)
    
        System.out.println("concat(string): " + s.concat(" Patil"));               //  appends (concatenate) a string to the end.
    
        System.out.println("contains(): " + s.contains("vil"));                      // Find out if a string contains a sequence of characters:

        System.out.println("endsWith('vil'): " + s.endsWith("vil"));                // returns true if string ends with the specified character(s).
    
        System.out.println("equals('Shadsadsafad'): " + s.equals("Shadsadsafad"));      // returns true if strings are equal

        System.out.println("indexOf('vil'): " + s.indexOf("vil"));                     // Search a string for the first occurence of "vil":

        System.out.println("isEmpty(): " + s.isEmpty());                              // Returns true if string is empty

        System.out.println("lastIndexOf('ha'): " + s.lastIndexOf("ha"));                  // Returns last occurence of "ha"

        System.out.println("length(): " + s.length());                                    // Returns length of string

        System.out.println("replace('a', 'b'): " + s.replace('a', 'b'));                  // Replaces the chars of string

        String[] s1 = s.split("");                                                        // Splits a string into an array of substrings

        System.out.println("startsWith('arv'): " + s.startsWith("arv"));                      // Returns true if the string starts with the specified characters

        System.out.println("substring(1,4): " + s.substring(1, 4));                          // Returns the substring (1 inclusive, 4 exclusive)

        char[] s2 = s.toCharArray();                                                         // Converts string to a char array

        System.out.println("toLowerCase(): " + s.toLowerCase());                             // Returns lowercase string
        
        System.out.println("toUpperCase(): " + s.toUpperCase());                             // Returns upper case string
    
        sc.close();
    }
}