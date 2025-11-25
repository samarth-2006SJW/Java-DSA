package lec_07;
import java.util.*;
public class Anagram_check {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first string:");
        String str1=new String(),str2=new String();
        str1=sc.next();
        System.out.print("Enter second String:");
        str2=sc.next();
        sc.close();// use of collection framework ye normal array jaisa work nhi karti
        //that is the reason arr[i] ki jagah ham arr.get(i) use karte hain
        ArrayList<Integer> arr1=new ArrayList<>(Collections.nCopies(95,0)); 
        ArrayList<Integer> arr2=new ArrayList<>(Collections.nCopies(95,0));
        for(int i=0;i<str1.length();i++)
        {
            if('a'>str1.charAt(i))
            {
              arr1.set('a'-str1.charAt(i),arr1.get('a'-str1.charAt(i))+1);
            } 
            else arr1.set(str1.charAt(i)-'a',arr1.get(str1.charAt(i)-'a')+1);
        }
        for(int i=0;i<str2.length();i++)
        {
             if('a'>str2.charAt(i))
            {
              arr2.set('a'-str2.charAt(i),arr2.get('a'-str2.charAt(i))+1);
            } 
            else arr2.set(str2.charAt(i)-'a',arr2.get(str2.charAt(i)-'a')+1);

        }
        int flag=0;
        if(str1.length()==str2.length())
        {
            for(int i=0;i<95;i++){
               if(arr1.get(i)!=arr2.get(i)) {
                 flag=1;break;
               }
            }
            if(flag==0)
            {
                 System.out.print("Anagram");
            }
            else{
                 System.out.print("Not Anagram");
            }
        }

        else{
            System.out.print("Not Anagram");
        }
    }
    
}
