package lec_05;
import java.util.*;
public class linear_search {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter element to be searched:");
        int key=sc.nextInt();
        System.out.print("Enter size:");int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter array elements:");
        for(int i=0;i<n;i++)
         arr[i]=sc.nextInt();
        sc.close();int j;
        for(j=0;j<n;j++)
        {
            if(arr[j]==key){
             System.out.print("Element found");
             break;
            }
        } 
        if(j==n) System.out.print("Element not found");   
           
    }
}
