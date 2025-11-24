package lec_06;
import java.util.*;
public class subtraction {
   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows:");int m=sc.nextInt();
        System.out.print("Enter Coloums:");int n=sc.nextInt();
        int[][] arr1=new int[m][n];
        int[][] arr2=new int[m][n];
        int[][] arr3=new int[m][n];
        System.out.print("1st Array elements:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
              arr1[i][j]=sc.nextInt();
        }
        System.out.print("2nd Array elements:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
              arr2[i][j]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
             arr3[i][j]=arr1[i][j]-arr2[i][j];
        }
        System.out.print("Subtractive matrix:\n");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
             System.out.print(arr3[i][j]+" ");
            System.out.print("\n"); 
        }
    }
}

