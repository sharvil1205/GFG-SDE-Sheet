/* Method overriding is one of the way by which java achieve Run Time Polymorphism.
The version of a method that is executed will be determined by the object that is used to invoke it. 
If an object of a parent class is used to invoke the method, then the version in the parent class will be executed, but if an object of the subclass is used to invoke the method, then the version
in the child class will be executed. In other words, it is the type of the object being referred to (not the type of the reference variable) 
that determines which version of an overridden method will be executed. */


class Parent {
	void show()
	{
		System.out.println("Parent's show()");
	}
}

class Child extends Parent {
	
	void show()
	{
		System.out.println("Child's show()");
	}
}

public class OOP_method_overriding_runtime_polymorphism 
{
    public static void main(String[] args)
	{
		Parent obj1 = new Parent();
		obj1.show();

		Child obj2 = new Child();
		obj2.show();
	}
}
