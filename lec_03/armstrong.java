package lec_03;
import java.util.*;
public class armstrong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter number:");
        int n=sc.nextInt(),count=0,arm=0;
        sc.close();
        for(int i=n;i!=0;i=i/10)
        {
            count++;
        }
        System.out.print(count+"\n");
        for(int i=n;i!=0;i=i/10){
            int digit=i%10;
            arm=arm+(int)Math.pow(digit,count);
        }
        if(arm==n) System.out.print("Armstrong Number");
        else System.out.print("Ain't Armstrong");
    }
}
