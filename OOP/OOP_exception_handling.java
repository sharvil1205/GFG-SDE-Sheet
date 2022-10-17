import java.util.*;
public class OOP_exception_handling 
{
    /* Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, 
       IOException, SQLException, RemoteException, etc.
       
       When a runtime error occurs, java will throw an exception. We can handle these exceptions using try and catch.
       The try statement allows you to define a block of code to be tested for errors while it is being executed.
       The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.

    */
    public static void main(String[] args) 
    {
        int[] ans = {1,2,3};
        // System.out.println(ans[5]);                      will throw indexOutOfBounds error
        
        try
        {
            System.out.println(ans[5]);
        }
        catch(Exception e)                                // in case of error in try block, this catch block will be executed
        {
            System.out.println("Index not accesible");                   
        }
        finally                                     // The finally statement lets you execute code, after try...catch, regardless of the result
        {
            System.out.println("try catch block has finished executing");
        }


        /* 
        The throw statement allows you to create a custom error.

        The throw statement is used together with an exception type. There are many exception types available in Java: 
        ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc:
        */

        int age = 16;
        if(age < 18)
        {
            throw new ArithmeticException("Access denied. You must be at least 18 years old");      // throw block allows us to create custom errors
        }
        else 
        {
            System.out.println("Access granted");
        }
    }    
}
