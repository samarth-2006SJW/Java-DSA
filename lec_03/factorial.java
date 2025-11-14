package lec_03;
import java.util.*;
public class factorial {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n=sc.nextInt(),fac=1;
        sc.close();
        for(int i=1;i<=n;i++)
        {
            fac*=i;
        }
        System.out.print("Factorial="+fac);
    }
}
