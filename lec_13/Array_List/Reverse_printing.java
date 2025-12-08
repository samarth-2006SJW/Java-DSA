package lec_13.Array_List;
import java.util.*;
public class Reverse_printing {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        int n=list.size();
        int count=0;
        ListIterator<Integer> usi=list.listIterator();
        // while(usi.hasNext()){
        //     count++;
        //     int x=usi.next();
        //     System.out.print(x+" ");
        //     if(count==n/2){
        //         System.out.print(list.get(n/2)+" ");
        //         for(int i=n/2;i>=0;i--){
        //             System.out.print(list.get(i)+" ");
                            
        //         }
        //         break;
        //     }
        //}\
        System.out.print("List custom print:");
        while(usi.hasNext() && usi.nextIndex()<=n/2){
            int x=usi.next();
            System.out.print(x+" ");
        }
        while(usi.hasPrevious()){
            int  x=usi.previous();
            System.out.print(x+" ");
        }
    }    
}
