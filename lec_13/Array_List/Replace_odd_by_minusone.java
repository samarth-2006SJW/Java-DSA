package lec_13.Array_List;
import java.util.*;
public class Replace_odd_by_minusone{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        ListIterator<Integer> usi=list.listIterator();
        
        while(usi.hasNext()){
            Integer x=usi.next();
            if((x%2)!=0)
                usi.set(-1);
        }
        System.out.print(list);
       
    }
}
