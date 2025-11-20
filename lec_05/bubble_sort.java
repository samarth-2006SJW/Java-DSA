package lec_05;
import java.util.*;
public class bubble_sort {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size:");
        int n=sc.nextInt();System.out.print("Array elements:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        int temp;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
             if(arr[j]>arr[j+1])
             {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
             }
        }
        System.out.print("Sorted array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
