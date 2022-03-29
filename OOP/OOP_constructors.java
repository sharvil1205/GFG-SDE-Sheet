import java.util.*;

public class OOP_constructors 
{
    int x;

    String name;
    int age;
    public OOP_constructors()   // Constructors
    {
        x = 10;
    }

    public OOP_constructors(String myname, int myage)
    {
        name = myname;
        age = myage;
    }

    public static void main(String[] args) 
    {
        OOP_constructors obj = new OOP_constructors();
        System.out.println(obj.x);
        
        OOP_constructors boy = new OOP_constructors("Sharvil", 20);
        System.out.println(boy.name + " " + boy.age);
    }
}
