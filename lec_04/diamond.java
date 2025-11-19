package lec_04;
import java.util.*;
public class diamond {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows:");
        int n=sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++){
            for(int k=n;k>i;k--)
             System.out.print(" ");
            for(int j=0;j<2*i+1;j++)
             System.out.print("*");
            System.out.print("\n");  
        }
        for(int i=0;i<=2*n;i++)
        {
            System.out.print("*");
        }
        System.out.print("\n");
         for(int i=0;i<n;i++){
            for(int k=0;k<=i;k++)
             System.out.print(" ");
            for(int j=2*n-1;j>2*i;j--)
             System.out.print("*");
            System.out.print("\n");  
        }
    }
}
