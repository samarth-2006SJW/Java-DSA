package lec_06;
import java.util.*;
public class sum_of_each_row{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter rows:");int m=sc.nextInt();
        System.out.print("Enter Coloums:");int n=sc.nextInt();
        int[][] arr1=new int[m][n];
        System.out.print("1st Array elements:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
              arr1[i][j]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=arr1[i][j];
            }
            System.out.print("Sum of "+(i+1)+"th row="+sum+"\n");
        }

    }

}