/* Constructors: A constructor in Java is a special method that is used to initialize objects. 
   The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:  */

import java.util.*;

public class OOP_constructors 
{
    int x;        // attribute

    public OOP_constructors()      // Constructor
    {
        x = 10;                    // Set initialize value for class attribute x
    }

    public OOP_constructors(int y)       // There can be multiple constructors of same class, but the parameters should be different. If the parameters are same it gives constructor overloading error 
    {
        x = y;
    }

    public static void main(String[] args) 
    {
        OOP_constructors obj = new OOP_constructors();    // This will call constructor 
        System.out.println(obj.x);

        OOP_constructors obj1 = new OOP_constructors(12);           
        System.out.println(obj1.x);
    }
}