package lec_04;
import java.util.*;
public class pyramid_point_left {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n=sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++)
        {
            for(int k=n;k>i;k--)
             System.out.print(" ");
            
            for(int j=0;j<=i;j++)
             System.out.print("*");
            System.out.print("\n");  
        }
        for(int i=0;i<=n;i++)
        {
            System.out.print("*");
        }
        System.out.print("\n");
        
         for(int i=0;i<n;i++)
        {
            for(int k=0;k<=i;k++)
               System.out.print(" ");
            for(int j=n;j>i;j--){
                System.out.print("*");
            }         
            System.out.print("\n");
        }
    }
}
