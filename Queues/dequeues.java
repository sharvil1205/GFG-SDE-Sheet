import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;
public class dequeues 
{
    public static void main(String[] args)
    {
        Deque<Integer> d = new ArrayDeque<>();
        d.add(4);
        d.addFirst(2);
        d.addLast(3);
        System.out.println(d);
        System.out.println(d.contains(3));
        System.out.println(d.element());
        System.out.println(d.getFirst());
        System.out.println(d.removeFirst());
        System.out.println(d.removeFirst());
        System.out.println(d.removeFirst());
        System.out.println(d.pollFirst());
        d.offer(1);
        d.offer(4);
        d.offer(5);
        d.offer(9);
        d.offer(0);
        System.out.println(d);
        System.out.println(d.poll());
        System.out.println(d);
        Iterator itr = d.iterator();
        
        while(itr.hasNext())
        {
            System.out.print(d.poll());
        }
        d.offer(1);
        d.offer(4);
        d.offer(5);
        d.offer(9);
        d.offer(0);
        Iterator ditr = d.descendingIterator();

    }    
}