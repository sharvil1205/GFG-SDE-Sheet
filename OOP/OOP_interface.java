/* Interface: Interface is a collection of abstract methods. We can't intantiate an interface. Interface contains only
   final fields and abstract methods, but not regular methods. Interface also doesn't contain any constructor. 
   We use the 'implements keyword in interface code, not the 'extends'
   */


interface Animal                                 // Interface
{
    public void catSound();                      // abstract method;
}                                                // Regular methods cannot exist in interfaces.

class Cat implements Animal                      // Use the 'implements' keyword for interface
{
    public void catSound()                       // Body of catSound() is provided here
    {
        System.out.println("Meow");
    }
}

public class OOP_interface
{
    public static void main(String[] args) 
    {
        Cat obj = new Cat();
        obj.catSound();    
        // Animal obj1 = new Animal();            Will give error: Cannot instantise Animal
    }
}
