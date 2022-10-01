class Demo  
{  
 
    Demo()  
    {  
        this(80, 90);                                       // Step 4: will call parameterized constructor of base class
        System.out.println("Base class default constructor called");        // Step 6: will print this
    }  

    Demo(int x, int y)  
    {  
        System.out.println("Base class parameterized constructor called");      // Step 5: print this
    }  
}  

class Prototype extends Demo  
{  
    Prototype()                                                                             
    {  
        this("Java", "Python");                                    // Step 2: will call parameterized constructor of derived class
        System.out.println("Derived class default constructor called");     // Step 8 will print this
    }  

    Prototype(String str1, String str2)  
    {  
        super();                                                             // Step 3: will call default constructor of base class
        System.out.println("Derived class parameterized constructor called");        // Step 7: will print this
    }  
}  

public class OOP_constructor_chaining 
{  
    public static void main(String args[])   
    {   
        Prototype my_example = new Prototype();                 // Step 1: will call default constructor of derived class  
    }   
}  