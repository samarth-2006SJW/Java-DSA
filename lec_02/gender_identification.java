package lec_02;
import java.util.*;
public class gender_identification {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);System.out.print("Enter gender for identification:");
        char ch=sc.next().charAt(0);
        sc.close();
        switch(ch)
        {
            case 'm':{System.out.print("Male");
                     break;}
            case 'f':{System.out.print("Female");
                      break;}
            case 'M':{System.out.print("Male");
                     break;           }
            case 'F':{ System.out.print("Female");
                     break;}
            default:System.out.print("Invalid Gender");

        }
        
    }
}
