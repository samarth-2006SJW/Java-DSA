package lec_13.Array_List;
import java.util.*;
public class List_Iterator{
    public static void main(String[] args){
     ArrayList<Integer> list=new ArrayList<>();
     list.add(5);   
     list.add(6);   
     list.add(7);
     list.add(8);
     ListIterator<Integer> it=list.listIterator();
     System.out.print("Forward printing:");
     while(it.hasNext()){
        System.out.print(it.next()+" ");
     }
     System.out.print("\n"+"Previous printing:"); 
     while(it.hasPrevious()){
        System.out.print(it.previous()+" ");
     }
     System.out.print("\nList before Manipulation:");
     while(it.hasNext()){
      int x=it.next();
      System.out.print(x+" ");
      if(x==8)
         it.add(10);//jahan add ki value 8 hogi wahan 10 krke ten ko aage shift karege par yhi it.set 8 ko hata ke uski jagah 10 karega yni add ke baad 5,6,7,10,8 but set ke baad 5,6,7,10
     }
     System.out.print("\nList after Manipulation:"+list);
    }
}