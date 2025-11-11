import java.util.*;
public class max_btw_two {
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number:");
        a=sc.nextInt();
        System.out.print("enter first number:");
        b=sc.nextInt();
        sc.close();
        if(a>b){
         System.out.println("a is greatest");
        }
        else if(a==b){
            System.out.println("both are equal");
        }
        else {
            System.out.println("b is greatest");   
        }
    }
    
}
