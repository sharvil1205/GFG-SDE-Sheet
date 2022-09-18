import java.util.*;
public class stack_using_array 
{
    int size;
    int[] arr;
    int top;
    
    public stack_using_array(int size)                // Constructor
    {
        this.size=size;
        this.arr = new int[size];
        this.top=-1;
    }
    
    public boolean isFull()
    {
        if(top == size-1) return true;
        return false;
    }
    
    public boolean isEmpty()
    {
        if(top == -1) return true;
        return false;
    }
    public void peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Topmost element: " + arr[top]);
        }
    }
    public void push(int element)
    {
        if(isFull())
        {
            System.out.println("Stack is full. Cannot enter more elements");
        }
        else
        {
            top++;
            arr[top] = element;
            System.out.println("Element " + element + " added in the stack");
        }
    }
    public void pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty. Cannot use pop()");
        }
        else
        {
            int lastElement = arr[top];
            top--;
            System.out.println("Popped element: " + lastElement);
        }
    }
    public void size()
    {
        System.out.println("Current size of stack: " + size);
    }
    public static void main(String args[]) 
    {
         stack_using_array st = new stack_using_array(4);
         st.push(4);
         st.push(8);
         st.peek();
         st.push(9);
         st.pop();
         st.pop();
         st.size();
         st.pop();
         st.peek();
    }
}