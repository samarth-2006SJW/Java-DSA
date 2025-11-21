package lec_05;
import java.util.*;
public class insertion_sort {
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
        for(int i=1;i<n;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {                
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        System.out.print("Sorted Array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
