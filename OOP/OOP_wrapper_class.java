import java.util.*;
public class OOP_wrapper_class 
{
    /* Wrapper class: A class that contains/wraps primitive dataypes. When we create a wrapper class, it contains fields and in this fields we can 
       store primitive data types.

       Autoboxing: The process of converting a primitive datatype to a wrapper class object.
       Unboxing: Getting the value of a wrapper class object and storing it into a primitive type variable.
     */
    public static void main(String[] args) 
    {
        Integer i = new Integer(5);         // Integer: wrapper class
        int num = 4;                              //  int: primitive datatype
        Integer i2 = new Integer(num);           //   Autoboxing

        int i3 = i2.intValue();                  // Unboxing

        System.out.println(num);       // prints 4
        System.out.println(i);         // prints 4
        System.out.println(i2);        // prints 5
        System.out.println(i3);        // prints 4
    }
}
