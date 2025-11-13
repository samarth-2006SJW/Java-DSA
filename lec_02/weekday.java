package lec_02;
import java.util.*;
public class weekday {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number btw 1-7:");
        int ch;
        ch=sc.nextInt();
        sc.close();
        switch(ch)
        {
            case 1:{System.out.print("Monday");
                   break;}
            case 2:{System.out.print("Tuesday");
                   break;}
            case 3:{System.out.print("Wednesday");
                   break; }  
            case 4:{System.out.print("Thursday");
                   break;}
            case 5:{System.out.print("Friday");
                   break;}
            case 6:{System.out.print("Saturday");
                   break;}
            case 7:{System.out.print("Sunday");
                   break;}
            default:System.out.println("Invalid choice");

        }

    }
}
