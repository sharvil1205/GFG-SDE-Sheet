import java.util.*;
public class convert 
{
    public static void main(String[] args) 
    {
        
        /* COVERT NUMERIC CHARACTERS TO INTEGERS */
        System.out.println(Character.getNumericValue('3'));                  /*  Method 1  */
        System.out.println(Integer.parseInt("3"));                           /*  Method 2  */
        System.out.println('3' - '0');                                       /*  Method 3  */


        System.out.println();


        /* GET ASCII VALUE OF CHAR */
    
        /* Method 1 */
        System.out.println((int)'c');


        /* Method 2 */
        char ch = 'c';
        int num = ch;
        System.out.println(num);


        /* CONVERT ASCII VALUE TO CHAR */

        System.out.println((char)97);


        /* CONVERT ANY DATATYPE TO STRING */
        System.out.println(String.valueOf(3));
        System.out.println(String.valueOf('3'));


        /* STRING TO CHAR ARRAY */
        String s = "Sharvil";
        char[] sch = s.toCharArray();

    }    
}