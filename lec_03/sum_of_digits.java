package lec_03;
import java.util.*;
public class sum_of_digits {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt(),sum=0;
        sc.close();
        for(int i=n;i!=0;i=i/10)
        {
            int digit=i%10;
            sum+=digit;
        }
        System.out.print("Addition of digit:"+sum);
    }
}
