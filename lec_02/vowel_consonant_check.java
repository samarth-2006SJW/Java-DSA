package lec_02;
import java.util.*;
public class vowel_consonant_check {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character:");
        char ch;
        ch=sc.next().charAt(0);
        sc.close();
        switch(ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':{System.out.print("Vowel");break;}
            default:System.out.print("Consonant");

        }
    }
}
