/*
 MULTILEVEL INHERITANCE:

 class A
   |
   |
   ↓ 
 class B
   |
   |
   ↓ 
 class C
   
 */

class GrandFather                                                   // level 1
{
    public void grandFather()
    {
        System.out.println("I am grandfather");
    }
}

class Father extends GrandFather                                    // level 2
{
    public void father()
    {
        System.out.println("I am father");
    }
}

public class OOP_multilevel_inheritance extends Father              // level 3
{
    public static void main(String[] args) 
    {
        OOP_multilevel_inheritance son = new OOP_multilevel_inheritance();
        son.father();
        son.grandFather();    
    }    
}