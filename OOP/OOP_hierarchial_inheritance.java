/*
 HIERARCHIAL INHERITANCE

            class A
              |
          ____|____
         |         |
         ↓         ↓        
      class B    class C
 
*/


class Father
{
    public void father()
    {
        System.out.println("I am father");
    }
}

class Daughter extends Father
{
    public void daughter()
    {
        System.out.println("I am daughter");
    }
}
class Son extends Father
{
    public void son()
    {
        System.out.println("I am son");
    }
}
public class OOP_hierarchial_inheritance 
{
    public static void main(String[] args) {
        Son obj = new Son();
        obj.son();
        // obj.daughter();                         Gives error
        obj.father();
    }    
}