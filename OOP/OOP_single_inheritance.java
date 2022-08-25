/* Inheritance:  Inheritance is a very powerful feature of OOPs. It is a
mechanism of acquiring properties or behaviors of existing class to a new class. In other words, A class inherits data
fields or methods from another class.

In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:

subclass (child) - the class that inherits from another class
superclass (parent) - the class being inherited from

To inherit from a class, use the extends keyword.

 
SINGLE INHERITANCE:
   
  class A
    |
    |
    ↓ 
  class B

 */

class Dog                                   // superclass(parent): the class being inherited from
{
    public void bark()
    {
        System.out.println("bhau bhau");
    }    
}

public class OOP_single_inheritance extends Dog     // subclass(child): the class that inherits from other class
{
    public static void main(String[] args) 
    {
        OOP_single_inheritance dog = new OOP_single_inheritance();
        dog.bark();
    }
}

/* Inheritance provides following benefits -
• Code reusability
• Less development and maintenance costs
• Reduces code redundancy and supports code
extensibility
• Save time and effort to write codes */