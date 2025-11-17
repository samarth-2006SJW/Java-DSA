package lec_03;
import java.util.*;
public class Sum_of_n {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int n=sc.nextInt(),sum=0;
        sc.close();
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.print("Addition="+sum);
    }
}
