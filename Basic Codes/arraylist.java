import java.util.*;

public class arraylist 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(0);
        list.add(1);
        list.add(2);                                                                                                        // add(E): Add values in arrayList
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println();
        System.out.println("list.add(): List after adding elements 0,1,2,3,4,4 : " + list);                                 // Print the whole list
        System.out.println();



        list.set(0,99);                                                                                                     // set(oldValue, newValue): Update values of arrayList
        System.out.println("list.set(0,99): Elements in the list after updating value at position 0 to 99: " + list);
        System.out.println();
        
        
        System.out.println("list.contains(2): Returns true if list contains the element '2': " + list.contains(2));                                                                   // contains(E): Check if the element is present in arrayList
        System.out.println();
        
        
        list.remove(2);                                                                                                     // remove(i): Remove with index: Remove element from the arraylist at index i.
        System.out.println("list.remove(2): Removes element at index 2 from the list" + list);
        System.out.println();

        list.remove(new Integer(4));                                                                                        // remove(new Datatype[E]): Remove with value: Remove element E from the arraylist. Returns false if element not present
        System.out.println("list.remove(new Integer[4]: Removes the first occurence of value '4' from the list. Returns false if element not present in the list: " + list);
        System.out.println();

        System.out.println("list.get(i): Access values from their index. Iterating through a loop ton print all values. list.size(): get number of elements in the list");
        for(int i=0; i<list.size(); i++)                                                                                    // size(): get number of elements in the arraylist
        {
            System.out.println(list.get(i));                                                                                // get(i): Access values of arraylist from their index
        }
        System.out.println();


        System.out.println("isEmpty(): Returns true if list is empty, false if list is not empty: " + list.isEmpty());      // isEmpty(): Returns true if list is empty, false if list is not empty
        System.out.println();
        
        list.add(3);
        System.out.println("indexOf(3): Returns the index of first occurence of '3': " + list.indexOf(3));                  // indexOf(E): Returns index of first occurence of 'E'. Returns -1 if element not present in the list.
        System.out.println();

        
        System.out.println(("lastIndexOf(3): Returns the last occurence of '3': " + list.lastIndexOf(3)));                  // lastIndexOf(E): Returns index of last occurence of 'E'. Returns -1 if element not present in the list.
        System.out.println();

        Object[] a =  list.toArray();                                                                                       // Convert arraylist to array
        System.out.println("a[0]: First element of the list converted to array: " + a[0]);
        System.out.println();

        list.clear();                                                                                                       // clear(): Delete all elements from the list.
        System.out.println("clear(): Delete all the elements of the list" + list);

        sc.close();
    }   
}