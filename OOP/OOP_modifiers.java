/* Modifiers: Modifiers allows us to restrict the scope or visibility of a package, class, constructor, methods, variables, or other data members.
   Modifiers are divided into two types:
  
  1. Access Modifiers: Controls the access level. By using access specifiers, we define how the members (attributes and methods) of a 
      class can be accessed. Access modifiers:
        1. public: The code/class is accessible by any other class
        2. private: The code is only accessible within the declared class	
        3. protected: The code is accessible in the same package and subclasses.
        4. default: The code/class is only accessible in the same package. This is used when you don't specify a modifier.
   
  2. Non-access Modifiers: Do not control access level, but provides other functionalites. Non-access modifiers:
       1. final: The class cannot be inherited by other classes. Attributes and methods cannot be overridden/modified
       2. static: Attributes and methods belongs to the class, rather than an object
       3. abstract: Abstract methods contains only delcaration, but not the implementation
       4. transient: Attributes and methods are skipped when serializing the object containing them
       5. synchronized: Methods can only be accessed by one thread at a time
       6. volatile: The value of an attribute is not cached thread-locally, and is always read from the "main memory"

*/


import java.util.*;
public class OOP_modifiers {
    // Static method
    static void myStaticMethod() {
      System.out.println("Static methods can be called without creating objects");
    }
  
    // Public method
    public void myPublicMethod() {
      System.out.println("Public methods must be called by creating objects");
    }
  
    // Main method
    public static void main(String[] args) {
      myStaticMethod(); // Call the static method

      // myPublicMethod(); This would compile an error
  
      OOP_modifiers myObj = new OOP_modifiers(); // Create an object of OOP_method
      myObj.myPublicMethod(); // Call the public method on the object
    }
  }