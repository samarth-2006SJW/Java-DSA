package lec_05;
import java.util.*;
public class binary_search{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter element to be searched:");
        int key=sc.nextInt();
        System.out.print("Enter size :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }sc.close();Arrays.sort(arr); //added coz what if array is not sorted since bs required sorted array
        int l=0,r=n-1,mid=0;
        boolean found=false;
        while(l<=r){
            mid=(l+r)/2;
            if(arr[mid]==key)
            {
             System.out.print("Element found and at index "+mid);
             found=true;
             break;
            }
            else if(key>arr[mid])
               l=mid+1;
            else if(key<arr[mid])  
               r=mid-1;  
        }
        if(found==false)
          System.out.print("Element not found"); 
          
        
    }
}
