package lec_13.Hash_Map_Questions;
import java.util.*;
public class frequency_counter{
    public static void main(String[] args){
        int arr[]={2,2,3,4,2,4,2};
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        System.out.println(map);
    }
}