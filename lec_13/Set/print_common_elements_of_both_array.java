package lec_13.Set;
import java.util.*;
public class print_common_elements_of_both_array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        HashSet<Integer> arr=new HashSet<>();
        HashSet<Integer> rslt=new HashSet<>();System.out.print("Enter first size:");
        int n=sc.nextInt();System.out.print("Enter second size:");
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            list.add(k);
        }
        for(int i=0;i<m;i++){
            int k=sc.nextInt();
            list1.add(k);
        }
        sc.close();
        arr.addAll(list);
        for(int i:list1)
        {
            if(arr.contains(i)){
                rslt.add(i);
            }
        }
        System.out.print(rslt);  
    }
}
