package lec_03;
import java.util.*;
public class Numbers_1_to_n {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=0;i<=n;i++){
            System.out.print(" Numbers:"+i+"\n");
        }
    }
}
