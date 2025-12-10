package lec_13.Array_List;
import java.util.*;
public class removing_elements_less_than_target_before_it {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(5);
        list.add(14);
        list.add(3);
        list.add(10);
        int target=14,index=list.indexOf(target);
        System.out.print(list.indexOf(target));
        ListIterator<Integer> usi=list.listIterator();
        for(int i=0;i<index;i++){
            usi.next();
        }
        while(usi.hasPrevious()) {
            int x=usi.previous();
            if(x<target)
                usi.remove();
        }   
        System.out.print(list);
    }  
}
