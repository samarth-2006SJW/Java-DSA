package lec_03;
import java.util.*;
public class prime_number {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENter a Number:");
        int n=sc.nextInt(),count=0;
        sc.close();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
             count++;
        }
        if(count==2)
         System.out.print("Prime Number");
        else
         System.out.print("Ain't prime"); 
    }
}
