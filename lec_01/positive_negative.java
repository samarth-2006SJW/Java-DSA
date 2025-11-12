import java.util.*;
public class positive_negative {
    public static void main(String[] args)
    {
        int a;Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        a=sc.nextInt();
        if(a>0)
        { System.out.println("Positive");}
        else if(a==0)
        { System.out.println("Number is Zero");}
        else{
            System.out.println("Negative");
        }
        sc.close();

    }
    
}
