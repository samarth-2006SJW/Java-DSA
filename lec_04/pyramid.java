package lec_04;
import java.util.*;
public class pyramid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of rows:");
        int n=sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++){
            for(int k=n-1;k>i;k--)
             System.out.print(" ");
            for(int j=0;j<2*i+1;j++)
             System.out.print("*");
            System.out.print("\n");  
        }
    }
    
}
