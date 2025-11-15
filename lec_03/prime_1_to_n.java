package lec_03;
import java.util.*;
public class prime_1_to_n {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();sc.close();
        System.out.print("All Prime Number:\n");
        for(int i=2;i<=n;i++)
        {   
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                 count++;
            }
            if(count==2)
             System.out.print(i+"\n");
        }
    }
}
