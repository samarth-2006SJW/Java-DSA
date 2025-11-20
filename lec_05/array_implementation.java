package lec_05;
import java.util.*;
public class array_implementation {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size:");
        int n=sc.nextInt();
        int a[]=new int[n]; //for doing what you did as int a[n] in cpp or you can do normal implementation
        System.out.print("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }sc.close();
        System.out.print("Array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
