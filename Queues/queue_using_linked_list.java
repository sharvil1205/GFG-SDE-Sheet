public class queue_using_linked_list 
{
    public class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    Node front = null;
    Node rear = null;
    int size;
    int currentSize=0;
    public queue_using_linked_list(int size)
    {
        this.size = size;
    }

    public boolean isEmpty()
    {
        if(currentSize == 0) return true;
        else return false;
    }
    public boolean isFull()
    {
        if(currentSize == size) return true;
        else return false;
    }
    public void push(int element)
    {
        if(isFull()) System.out.println("Queue is full. Cannot use push");
        else 
        {
            Node new_node = new Node(element);
            new_node.next = rear;
            rear = new_node;
            System.out.println("Element pushed into queue: " + rear.data);
            currentSize++;
        }
    }
    public void pop()
    {
        if(isEmpty()) System.out.println("Queue is empty. Cannot use pop");
        else
        {
            front = rear;
            while(front.next != null) front=front.next; 
            System.out.println("Element popped: " + front.data);
            front = null;
            currentSize--;
        }
    }
    public void peek()
    {
        if(isEmpty()) System.out.println("Queue is empty.");
        else
        {
            front = rear;
            while(front.next != null) front = front.next;
            System.out.println("Frontmost element: " + front.data);
        }
    }
    public void size()
    {
        System.out.println("Current size of the queue: " + currentSize);
    }

    public static void main(String[] args) {
        queue_using_linked_list q = new queue_using_linked_list(3);
        q.push(4);
        q.push(5);
        q.push(9);
        q.pop();
        q.pop();
        q.pop();
    }
}