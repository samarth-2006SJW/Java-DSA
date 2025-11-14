package lec_03;
import java.util.*;
public class fibonacci {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt(),prev1=0,prev2=1;
        sc.close();
        System.out.println("Fibonacci Sequence:");
        for(int i=0;i<n;i++)
        {   
            System.out.print(prev1);
            int curr=prev1+prev2;
            prev1=prev2;
            prev2=curr;
           
        }

    }
}
