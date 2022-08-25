/* Polymorphism in Java refers to an object’s capacity to take several forms. 
   Polymorphism allows us to perform the same action in multiple ways in Java.

Polymorphism is divided into two types:

-> Compile-time polymorphism
-> Run time polymorphism 

Compile-time polymorphism is a polymorphism that is resolved during the compilation process. 
Overloading of methods is called through the reference variable of a class. 
Compile-time polymorphism is achieved by method overloading and operator overloading.

Method Overloading occurs when a class has many methods with the same name but different parameters. 
Two or more methods may have the same name if they have other numbers of 
parameters, different data types, or different numbers of parameters and different data types. 

*/


public class OOP_method_overloading_compile_time_polymorphism 
{
    public void add(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }    
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }

    public static void main(String[] args) 
    {
        OOP_method_overloading_compile_time_polymorphism obj = new OOP_method_overloading_compile_time_polymorphism();

        obj.add(1, 2);                // first add function

        obj.add(1, 2, 3);          // second add function
    }
}