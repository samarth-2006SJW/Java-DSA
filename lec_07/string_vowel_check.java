package lec_07;
import java.util.*;
public class string_vowel_check{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=new String();
        System.out.print("Enter String:");
        s=sc.next();
        sc.close();int countvowel=0,countconso=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
            {
                countvowel++;
            }
            else countconso++;
        }
        System.out.print("Number of vowel in a string="+countvowel+"\nNumber of consonant in a string="+countconso);
    }
}