package lec_07;
import java.util.*;
public class count_word_in_a_string {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of string array:");
        int n=sc.nextInt();int count=0;
        String[] str=new String[n];
        for(int i=0;i<n;i++)
        {
            str[i]=sc.next();
        }
        sc.close();
        for(int i=0;i<n;i++)
         count++;
        System.out.print("Total words in strings are="+count);         
    }
}
