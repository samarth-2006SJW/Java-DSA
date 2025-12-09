package lec_13.Hash_Map_Questions;
import java.util.*;
public class first_non_repeating_char {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String k=new String();
        System.out.print("Enter A String:");
        k=sc.next();
        sc.close();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char x:k.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(char x:map.keySet())
        {
            if(map.get(x)==1){
                System.out.print("First non repeating character="+x);
                break;
            }
        }
    }
}
