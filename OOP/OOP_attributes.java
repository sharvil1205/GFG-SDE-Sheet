/*
 Attributes: Attributes are characteristics of a class that help them distinguish themselves from other classes. Eg: variables
 Final keyword: We use the final keyword when we want the variable to store a fixed value
 */

import java.util.*;
public class OOP_attributes 
{
    int x = 5;                                                                  // attribute
    final int y = 15;                                                           // final keyword: We use the final keyword when we want the variable to store a fixed value

    public static void main(String[] args)
    {
        OOP_attributes obj1 = new OOP_attributes();
        obj1.x = 20;                                                            // modifying attributes
        System.out.println(obj1.x);                                             // This will print 20 (modified attribute)

        OOP_attributes obj2 = new OOP_attributes();
        System.out.println(obj2.x);                                             // This will print 5 (original attribute)                                                             
        
        // obj2.y = 25;                                                            // This will give error because the attribute that we are trying to change has 'final' keyword. Hence the attribute cannot be changed.
        System.out.println(obj2.y);
    }
}
