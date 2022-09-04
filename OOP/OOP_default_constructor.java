/* Constructors: A constructor in Java is a special method that is used to initialize objects. 
   The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:  
   
   Types of Constructors in Java
   Primarily there are two types of constructors in java: 
   1. No-argument constructor
   2. Parameterized Constructor       
      
    1. No-argument constructor: A constructor that has no parameter is known as the default constructor. 
       If we don’t define a constructor in a class, then the compiler creates a default constructor(with no arguments) for the class. 
       And if we write a constructor with arguments or no arguments then the compiler does not create a default constructor.
   */


import java.util.*;

public class OOP_default_constructor 
{
    int x;                                         // attribute
    String name;                                   // attribute

    public OOP_default_constructor()                      // Default Constructor (no arguements)
    {
        System.out.println("Default constructor is called");       
    }

    public static void main(String[] args) 
    {
        OOP_default_constructor obj = new OOP_default_constructor();         // This will call first constructor (default constructor) 
        System.out.println(obj.x);                             
        System.out.println(obj.name);
        // Note: Default constructor provides the default values to the object like 0, null, etc. depending on the type.
    }
}