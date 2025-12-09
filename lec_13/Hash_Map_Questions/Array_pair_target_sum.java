package lec_13.Hash_Map_Questions;
import java.util.*;//Question ye hai ki ek aisa pair ka index return 
public class Array_pair_target_sum{  //kro jiska sum ek target ke barabar ho
    public static void main(String[] args){
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int target=9;
        int arr[]={2,7,4,5};
        for(int i=0;i<arr.length;i++){
            int diff=target-arr[i];
            if(map.containsKey(diff)){// {diffrence calculate kiya usse pehli if condition fail hogyi ab hogyi fail to map.put(arr[i],i) insert hoga map main yni 2,0 insert hoga ab dusti baat barr diff 2 to if condition true yni 2 as a key present hai map main to 0,1 print kar diya hence 2,u7 pehle pair hai jiska sum 9 hai to uske index as a pair return karne the, kar diye.} 
                System.out.println(map.get(diff)+" "+i);
                break;
            } 
            map.put(arr[i],i)  ;      
        }         
    }
}
