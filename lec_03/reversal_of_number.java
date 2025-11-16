package lec_03;
import java.util.*;
public class reversal_of_number {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number for reversal:");
        int n=sc.nextInt();
        sc.close();
        int digit=0,rev=0;
        for(int i=n;i!=0;i=i/10)
        {
            digit=i%10;
            rev=rev*10+digit;
        }
        System.out.print("Reversed Number="+rev);
    }
}
