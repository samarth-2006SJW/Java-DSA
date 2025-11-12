import java.util.*;
public class multiple_of_3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=sc.nextInt();
        sc.close();if(a%3==0){
                System.out.print("Number is a multiple of three");
        }
        else{
            System.out.print("Not a multiple of three");
        }
    }
    
}
