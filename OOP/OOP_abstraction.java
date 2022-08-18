/* Data Abstraction: Data abstraction is the procress of hiding certain details and showing only essential data to the user.
   Data abstraction can be achieved using abstract keywords and interfaces.
   
   The abstract keyword is a non-access modifier, used for classes and methods:
   -> Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
   -> Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
 */
 
abstract class Animal                                 // Abstract class
{
    public abstract void animalSound();               // Abstract method (does not have a body)
    
    public void sleep()                               // Regular method
    {
        System.out.println("Zzz");
    }
}
  
  class Pig extends Animal                            // Subclass (inherit from Animal)
  {
    public void animalSound() 
    {  
        System.out.println("The pig says: wee wee");   // The body of animalSound() is provided here
    }
  }
  
  class Main 
  {
    public static void main(String[] args) 
    {
        // Animal myObj = new Animal();               Gives error

        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
  }