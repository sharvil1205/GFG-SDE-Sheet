/* 
    2. Parameterized Constructor: A constructor that has parameters is known as parameterized constructor. 
       If we want to initialize fields of the class with our own values, then use a parameterized constructor.
*/

import java.util.*;

public class OOP_parameterized_constructor 
{
    int id;
    String name;
    public OOP_parameterized_constructor(int id, String name)
    {
        this.id = id;
        this.name = name;
    }    

    public static void main(String[] args) 
    {
        OOP_parameterized_constructor obj = new OOP_parameterized_constructor(7, "Sharvil");
        System.out.println("ID: " + obj.id + ", Name: " + obj.name);
    }
}