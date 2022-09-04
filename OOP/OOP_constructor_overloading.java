/* Constructor overloading allows a class to have more than one constructor that have the same name as that of the class 
   but differ only in terms of number or type of parameters. */

import java.util.*;
public class OOP_constructor_overloading 
{
    int num;
    public OOP_constructor_overloading()                                // Default constructor
    {
        System.out.println("Default constructor (0 parameters)");
    }
    public OOP_constructor_overloading(int num)                         // Overloaded + Parameterized constructor with 1 parameter
    {
        this.num = num;
        System.out.println("Overloaded + Parameterized constructor with 1 parameter");
    }

    public static void main(String[] args) 
    {
        OOP_constructor_overloading obj = new OOP_constructor_overloading();                 // will call default constructor
        System.out.println();

        OOP_constructor_overloading obj1 = new OOP_constructor_overloading(5);          // will pass value 5 to the overloaded + parameterized constructor 
        System.out.println(obj1.num);                                                        // will print 5
    }
}