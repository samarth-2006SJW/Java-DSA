package lec_02;
import java.util.*;
public class vote_eligibility {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age plz:");
        int ch=sc.nextInt();
        sc.close();
        int value=ch>=18?1:0;
        switch(value)
        {
            case 1:{System.out.print("Eligible");
                   break;}
            case 0:{ System.out.print("Not Eligible");
                   break;}
                       
        }
        
    }
}
