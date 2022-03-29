import java.util.*;
public class OOP_basics
{
     int x = 10;
     final int y = 5;
     String s = "no";

     static void staticMethod()  // Static Method
     {
         System.out.println("Static methods can be called without creating objects");
     }

     public void publicMethod()    //  Public Method 
     {
        System.out.println("Public methods must be called by creating objects");
      }

     public static void main(String[] args) 
     {
         OOP_basics obj = new OOP_basics();
         System.out.println(obj.x);
         System.out.println(obj.s);
         obj.x=15;
         //obj.y=10;  gives error because final keyword is used for y.
         System.out.println(obj.x);

         staticMethod();
         // myPublicMethod(); This would compile an error

         obj.publicMethod();
     }
}