package lec_13.Array_List;
import java.util.*;
public class dynamic_array_implementation {
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        System.out.print("Array:");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.print("\n");
        list.set(2,30);
        list.remove(1);
         for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        
    }    
}
