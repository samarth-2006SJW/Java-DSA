package lec_05;
import java.util.*;
public class sum_of_elements {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size:");int n=sc.nextInt();
        int[]  arr=new int[5];
        System.out.print("Array elements:");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        sc.close();    
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=arr[i];      
        System.out.print("Sum of array elemnts="+sum);    
    }
}
