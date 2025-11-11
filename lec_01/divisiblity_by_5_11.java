import java.util.*;
public class divisiblity_by_5_11 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.close();
        if(a%5==0)
        {System.out.print("Divisible by 5");}
        else if(a%11==0)
        {
            System.out.print("Divisible by 11");
        }
        else {System.out.print("Not divisible by 5 or 11");}

    }    
}
