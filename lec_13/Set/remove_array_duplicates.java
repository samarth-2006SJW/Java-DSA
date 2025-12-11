package lec_13.Set;
import java.util.*;
public class remove_array_duplicates {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            list.add(k);
        }sc.close();
        HashSet<Integer> list1=new HashSet<>();
        for(int i:list){
            list1.add(i);
        }
        if(list.size()==list1.size())
            System.out.print("Duplicates element exist");
        else System.out.print("Duplicates element doesn't exist\n");
        System.out.print(list1);
    }
}
