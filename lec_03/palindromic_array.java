package lec_03;
import java.util.*;
public class palindromic_array {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number:");
        int n=sc.nextInt(),rev=0;
        sc.close();
        for(int i=n;i!=0;i=i/10)
        {
            int digit=i%10;
            rev=rev*10+digit;
        }
        if(n==rev)
         System.out.print("Palindromic Number");
        else System.out.print("Ain't Palindromic Number"); 

    }
}
