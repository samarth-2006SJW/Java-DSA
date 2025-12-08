package lec_13.Array_List;
import java.util.*;
public class replacing_minus_by_absolute_value {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(-1);
        list.add(4);
        list.add(-7);
        list.add(2);
        ListIterator<Integer> usi=list.listIterator();
        while(usi.hasNext())
        {
            int x=usi.next();
            if(x<0){
            //     usi.set(Math.abs(x));or
                   usi.set(-1*x);
            }
        }
        System.out.print(list);
    }
}
