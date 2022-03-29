import java.util.ArrayList;
import java.util.Scanner;

public class arraylist 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<5; i++)
        {
            list.add(sc.nextInt());
        }
        System.out.println(list);
        list.set(0,99);
        System.out.println(list);
        System.out.println(list.contains(2));
        list.remove(0);
        System.out.println(list);

        for(int i=0; i<4; i++)
        {
            list.get(i);
        }
    }
    
}
