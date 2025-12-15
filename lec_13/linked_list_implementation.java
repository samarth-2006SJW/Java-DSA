package lec_13;
import java.util.*;
public class linked_list_implementation {
    public static void main(String[] args){
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.addFirst(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.add(8);
        ll.remove(3);
        System.out.print(ll);
    }
}
