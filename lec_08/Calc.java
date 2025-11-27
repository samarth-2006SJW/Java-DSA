package lec_08;
import java.util.*;
class calculator{
    int addition(int a,int b){
         int c=a+b;
         return c;
    }
    int subtraction(int a,int b){
        int c=a-b;
        return c;
    }
    int multiplication(int a,int b){
        int c=a*b;
        return c;
    }
    float division(float a,float b){
        float c=(float)a/b;
        return c;
    }
}
public class Calc {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        System.out.print("Enter second number:");
        int b=sc.nextInt();
        System.out.print("1->addition\n2->subtraction\n3->multiplication\n4->division\nEnter your choice:");
        int ch=sc.nextInt();
        sc.close();
        calculator obj=new calculator();
        if(ch==1) System.out.print("Addition of two numbers="+obj.addition(a,b));
        else if(ch==2) System.out.print("Subtraction of two numbers="+obj.subtraction(a,b));
        else if(ch==3) System.out.print("Multiplication of two numbers="+obj.multiplication(a,b));
        else if(ch==4) System.out.print("Division of two numbers="+obj.division(a,b));
        else System.out.print("Invalid choice");
    }
    
}
