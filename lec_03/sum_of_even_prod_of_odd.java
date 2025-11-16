package lec_03;
import java.util.*;
public class sum_of_even_prod_of_odd {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt(),sume=0,prodo=1;
        sc.close();
        for(int i=n;i!=0;i=i/10)
        {
            int digit=i%10;
            if(digit%2==0)
             sume+=digit;
            else
             prodo*=digit; 
        }
        System.out.print("addition of even digits="+sume+"\n"+"product of odd digits="+prodo);
    }
}
