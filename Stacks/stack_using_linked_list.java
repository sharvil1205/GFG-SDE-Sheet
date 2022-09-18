public class stack_using_linked_list 
{
    public class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node top;
    int size;
    public stack_using_linked_list()
    {
        this.top=null;
    }

    public boolean isEmpty()
    {
        if(top==null) return true;
        return false;
    }

    public void push(int element)
    {
        Node new_node = new Node(element);
        new_node.next = top;
        top = new_node;
        size++;
        System.out.println("Element " + element + " pushed into stack");
    }

    public void pop()
    {
        if(isEmpty()) System.out.println("Stack is Empty! (Stack Underflow)");
        else
        {
            int poppedElement = top.data;
            top = top.next;
            size--;
            System.out.println("Popped element: " + poppedElement);
        }
    }
    public void peek()
    {
        if(isEmpty()) System.out.println("Stack is Empty");
        else System.out.println("Topmost element: " + top.data);
    }
    public void size()
    {
        System.out.println("Size of stack: " + size);
    }

    public static void main(String[] args) 
    {
        stack_using_linked_list st = new stack_using_linked_list();      
        st.pop();
        st.push(4);
        st.push(2);
        st.peek();
        st.push(7);
        st.size();
        st.pop();
    }
}