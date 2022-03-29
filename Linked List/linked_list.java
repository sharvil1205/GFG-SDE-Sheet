import javax.print.event.PrintJobListener;
import java.util.*;

public class linked_list
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        String s = sc.nextLine();
        String s1[] = s.split(" ");
        for(int i=0; i<s1.length; i++)
        {
            list.add(Integer.parseInt(s1[i]));
        }
        for(int i=0; i<s1.length; i++)
        {
            System.out.println(list.poll());
        }
    }
}