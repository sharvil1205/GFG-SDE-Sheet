public class OOP_constructor_chaining 
{
    public OOP_constructor_chaining()
    {
        this("Java");                         // Step 2) Parameterized constructor is called using this() keyword
        System.out.println("Default Constructor called");                   // Step 4) After executing this(), the remaining code will be executed.
    }    

    public OOP_constructor_chaining(String s)
    {
        System.out.println("Parameterized constructor is called");       // Step 3) code inside parameterized constructor will get executed
    }

    public static void main(String[] args) {
        OOP_constructor_chaining obj = new OOP_constructor_chaining();           // Step 1) Default constructor will be called
    }
}
