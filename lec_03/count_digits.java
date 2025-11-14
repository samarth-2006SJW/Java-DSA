package lec_03;
import java.util.*;
public class count_digits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number for digit calculation:");
        int n=sc.nextInt(),count=0;
        sc.close();
        for(int i=n;i!=0;i=i/10){
            count++;
        }
        System.out.print("Number of digits="+count);
    }
}
