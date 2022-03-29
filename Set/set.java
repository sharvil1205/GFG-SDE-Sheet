import java.util.*;
public class set 
{
    public static void main(String[] args) 
    {
        Set<Integer> s1 = new HashSet<>();
        s1.add(2);
        s1.add(4);
        s1.add(3);
        s1.add(1);
        s1.add(2);
        System.out.println(s1);
        System.out.println(s1.contains(2));
        

        System.out.println(s1.size());
        s1.remove(2);
        System.out.println(s1);
        System.out.println(s1.isEmpty());

        Set<Integer> s2 = new HashSet<>();
        s2.add(5);
        s2.add(1);
        s2.add(6);
        s2.add(7);

        s1.addAll(s2);
        System.out.println(s1);

        s1.clear();

        s1.add(2);
        s1.add(4);
        s1.add(3);
        s1.add(1);
        s1.add(2);
        s1.retainAll(s2);
        System.out.println(s1);

        System.out.println(s1.containsAll(s2));
        System.out.println(s1.equals(s2));

        s1.add(2);
        s1.add(4);
        s1.add(3);
        s1.add(1);
        s1.add(2);
        
        System.out.println(s1.removeAll(s2));
        System.out.println(s1);
    }    
}