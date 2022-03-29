import java.util.*;
public class hashmap {
    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        System.out.println(map);
        
        System.out.println(map.size());

        System.out.println(map.containsKey("a"));
        System.out.println(map.containsKey("z"));
        System.out.println(map.containsValue(1));
        System.out.println(map.containsValue(9));
        System.out.println(map.get("c"));

        map.put("d", 4);
        System.out.println(map);

        map.put("d", 5);
        System.out.println(map);

        map.remove("b");
        System.out.println(map);

        System.out.println(map.remove("a", 2));
        System.out.println(map.remove("a", 1));
        System.out.println(map);

        System.out.println(map.get("c"));
        System.out.println(map.get("f"));
        System.out.println(map.values());

        System.out.println(map.equals("c"));

    }
}