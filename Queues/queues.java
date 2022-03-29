// PRIORITY QUEUE

import java.util.*;
import java.util.Scanner;
public class queues 
{
    public static void main(String[] args) 
    {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        q.add(4);
        q.add(1);
        q.add(10);
        q.add(2);
        q.add(12);
        q.add(8);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());    
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        q.add(4);
        q.add(1);
        q.add(10);
        q.add(2);
        q.add(12);
        q.add(8);
        q.remove(2);
        Iterator itr = q.iterator();
        int e=0;
        while(itr.hasNext())
        {
            e = q.poll();
            
        }
        System.out.println(e);
        q.offer(0);
        q.offer(2);
        q.offer(1);
        q.offer(5);
        q.offer(1);
        q.offer(13);
        q.offer(5);
        q.offer(3);
        while(!q.isEmpty())
        {
            System.out.print(q.poll() + " ");
        }
        
    }    
}