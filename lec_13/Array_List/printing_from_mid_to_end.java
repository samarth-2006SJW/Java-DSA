package lec_13.Array_List;
import java.util.*;
public class printing_from_mid_to_end {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        ListIterator<Integer> usi=list.listIterator();
        int n=list.size()/2,count=0;
        while(usi.hasNext()){
            count++;
            usi.next();// if usi.next nhi likhunga to usi aage hi nhi badhega aur aage nhi badhega to chahe for loop main i=n ho ya kuch bhi ho par print shuru se hi hoga 
            if(count==n)
            {
                for(int i=n;i<list.size();i++){
                    System.out.print(usi.next()+" ");
                      
                }break;
            }
        }
    }
}
