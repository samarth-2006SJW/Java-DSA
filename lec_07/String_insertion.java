package lec_07;
import java.util.*;
public class String_insertion {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String str=new String(),str1=new String(),str2=new String();str=sc.nextLine();
        System.out.print("String to be inserted:");
        str1=sc.next();int index=8;
        sc.close();
        for(int i=0;i<str.length();i++)
        {
            str2+=str.charAt(i);
            if(i==index)
               str2+=str1;
            
        }
        System.out.print("String after insertion:"+str2);
    }
    
}
