package lec_13.Array_List;
import java.util.*;
public class Sorting {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(5);
        Collections.sort(list);
        System.out.print("Sorted array:"+list);
    }
}
