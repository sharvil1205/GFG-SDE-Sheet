import java.util.*;      // CLimbing stairs problem: How many ways can we climb stairs if we can go 1,2,3 steps at a time.
public class dp_mem_tabu 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println(memo(n, map));
    }   
    static int memo(int n, HashMap<Integer, Integer> map)
    {
        if(map.containsKey(n)) return map.get(n);
        if(n<=0)return 0;
        if(n==1 || n==2) return n;
        int step1 = memo(n-1, map);
        int step2 = memo(n-2, map);
        int step3 = memo(n-3, map);
        int step = step1+step2+step3;
        map.put(n, step);
        return step;
    }   
}