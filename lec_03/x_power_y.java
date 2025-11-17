package lec_03;
import java.util.*;
public class x_power_y {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base:");
        int base=sc.nextInt();System.out.print("Enter exponent:");
        int exponent=sc.nextInt();
        int Result=(int)Math.pow(base,exponent);
        System.out.print("Base to power Exponent="+Result);
        sc.close();
    }
}
