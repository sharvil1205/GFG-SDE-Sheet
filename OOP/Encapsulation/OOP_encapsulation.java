/*  */
package Encapsulation;
import java.util.*;
public class OOP_encapsulation 
{
    private String name;
    public String getName()    // getter
    {
        return name;
    }    

    public void setName(String newName)    // setter
    {
        this.name = newName;
    }
}

/* 
Why Encapsulation?
-> Better control of class attributes and methods
-> Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
-> Flexible: the programmer can change one part of the code without affecting other parts
-> Increased security of data 
*/