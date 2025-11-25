package lec_06;
import java.util.*;
public class two_dimensional_array_implementation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows:");int m=sc.nextInt();
        System.out.print("Enter Coloums:");int n=sc.nextInt();
        int[][] arr=new int[m][n];
        System.out.print("Array elements:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
              arr[i][j]=sc.nextInt();
        }
        sc.close();
        System.out.print("2-D Array:\n");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
              System.out.print(arr[i][j]+ " ");
            System.out.print("\n");  
        }
    }
}
