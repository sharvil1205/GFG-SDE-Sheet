public class queue_using_array 
{
    int size;
    int[] arr;
    int front = 0;
    int rear = 0;
    int currentSize = 0;
    public queue_using_array(int size)
    {
        this.size=size;
        this.arr = new int[size];
    }   
    
    public boolean isEmpty()
    {
        if(front == rear) return true;
        return false;
    }
    public boolean isFull()
    {
        if(currentSize == size) return true;
        return false;
    }
    public void push(int element)
    {
        if(isFull()) System.out.println("Cannot push. Queue full");
        else
        {
            arr[rear] = element;
            System.out.println("Element added: " + arr[rear]);
            rear++;
            currentSize++;
        }
    }
    public void pop()
    {
        if(isEmpty()) System.out.println("Queue is empty. Cannot pop");
        else
        {
            System.out.println("Element removed: " + arr[front]);
            front++;
            currentSize--;
        }
    }
    public void peek()
    {
        if(isEmpty()) System.out.println("Queue empty");
        else System.out.println("Element at the front of queue: " + arr[front]);
    }
    public void size()
    {
        System.out.println("Current size of the queue: " + currentSize);
    }

    public static void main(String[] args) 
    {
        queue_using_array q = new queue_using_array(3);
        q.pop();
        q.push(4);
        q.push(2);
        q.push(1);
        q.push(6);
        q.size();
        q.pop();
        q.pop();
        q.peek();
        q.pop();
        q.size();
    }
}