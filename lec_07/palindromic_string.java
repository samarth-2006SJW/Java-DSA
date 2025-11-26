package lec_07;
import java.util.*;
public class palindromic_string {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String s=new String();
        s=sc.next();
        sc.close();
        int k=s.length();int count=0;
        for(int i=0;i<k;i++){
           if(s.charAt(k-i-1)!=s.charAt(i))
             break;
           count++;
        }
        if(count<k)
         System.out.print("Not Palindromic String");
        else System.out.print("Palindromic String"); 
    }
}
