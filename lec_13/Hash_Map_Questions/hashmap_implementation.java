package lec_13.Hash_Map_Questions;
import java.util.*;
public class hashmap_implementation {
    public static void main(String[] args)
    { 
        HashMap<Integer, Integer> map =new HashMap<Integer,Integer>();
        map.put(1,10);
        map.put(2,20);
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.getOrDefault(11,0));
        for(int x:map.keySet())
{
    System.out.println(map.get(x));
}
    }
}
