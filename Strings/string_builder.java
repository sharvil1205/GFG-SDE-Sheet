import java.util.*;
public class string_builder 
{
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        
        sb.append(" World");                    // append(charSequence S)

        System.out.println("append(): " + sb);    

        sb.append("a!bc", 1, 2);                // append(charSequence s, int start, int end): appends the specified substring of a string

        System.out.println("append(s, num1, num2): " + sb);

        System.out.println("capacity(): " + sb.capacity());          // capacity(): returns current capacity of the sb

        System.out.println("charAt(i): " + sb.charAt(3));            // charAt(int index)

        sb.deleteCharAt(4);                                     // deleteCharAt(int index)
        System.out.println("deleteCharAt(4): " + sb);

        sb.delete(6, 8);                                      // delete(int start, int end)
        System.out.println("delete(6, 8): " + sb);

        System.out.println("equals(sb): " + sb.equals(new StringBuilder("Hello")));             // equals(sb)
        
        System.out.println("indexOf(s): " + sb.indexOf("W"));                  // indexOf(String s)

        sb.insert(6, "or");                                        // insert(int position, String s)
        sb.insert(4, "o");
        System.out.println(sb);

        System.out.println("length(): " + sb.length());             // length()

        sb.replace(0, 5, "Hi");                                     // replace(int start, int end, String s)
        System.out.println("replace(0, 5, hi): " + sb);

        System.out.println("reverse(): " + sb);                     // reverse()

        System.out.println("substring(2,6): " + sb.substring(2, 6));             // substring(int start, int end)
        
        String s = sb.toString();                                               //toString()
        System.out.println("toString(): " + s);

    }    
}