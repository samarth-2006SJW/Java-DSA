package lec_06;

import java.util.Scanner;

public class Multiplication {
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
         for(int j=0;j<n;j++) // so here then it will j<p
         {
            arr3[i][j]=0;  //this only works for square matrices coz if arr1 is m*n and arr2 is n*p
            for(int k=0;k<n;k++)
            {
                arr3[i][j]+=arr1[i][k]*arr2[k][j];
            }
         }
         System.out.print("Multiplicative matrix:\n");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
             System.out.print(arr3[i][j]+" ");
            System.out.print("\n"); 
        } 

    }
}
