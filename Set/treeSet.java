import java.util.*;

public class treeSet
{
    /* TreeSet: TreeSet is a data structure which uses tree for data storage. TreeSet can contain only unique elements. 
       Elements in the treeset become sorted in the ascending order.
     */
    public static void main(String[] args) 
    {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(5);                    // add(e): adds element to the treeset
        ts.add(4);
        ts.add(5);
        ts.add(6);
        System.out.println("add(5), add(4), add(5), add(6): " + ts);        // prints 4,5,6. Elements are unique and sorted in ascending order

        System.out.println("contains(5): " + ts.contains(5));          // contains(e): returns boolean value

        System.out.println("first(): " + ts.first());          // first(): prints the first element of treeset in sorted form

        System.out.println("last(): " + ts.last());           // last(): prints the last element of treeset in sorted form

        System.out.println("isEmpty(): " + ts.isEmpty());       // isEmpty(): returns boolean values

        System.out.println("size(): " + ts.size());             // size()

        System.out.println("pollFirst(): " + ts.pollFirst());     // pollFirst(): removes and returns the first element. returns null if set empty

        ts.add(3);
        ts.add(4);

        System.out.println("pollLast(): " + ts.pollLast());         // pollLast(): removes and returns the last element. returns null if set empty

        ts.remove(5);                // remove(e): removes the element from treeset(if present) and returns true. If element is not present, returns false; 

        System.out.println(ts);

        ts.clear();               // clear(): removes all the elements from the treeSet

        System.out.println(ts);
    }
}