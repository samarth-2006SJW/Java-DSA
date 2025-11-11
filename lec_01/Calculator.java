import java.util.*;
public class Calculator {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("Enter first number:");
        a=sc.nextInt();
        System.out.print("Enter second number:");
        b=sc.nextInt();
        int ch;System.out.print("1-->addition\n2-->Subtraction\n3-->Multiplication\n4-->Division"+"\n Enter your choice:");
        ch=sc.nextInt();
        if(ch==1)
        {
           System.out.print("Addition="+(a+b));
        }
        else if(ch==2)
        { System.out.print("Subtraction="+(a-b));
        }   
        else if(ch==3)
        { System.out.print("Multiplication="+(a*b));}
        else if(ch==4)
        { float c=(float)a/b;
          System.out.print("Division="+c);  
        } 
        else{ System.out.print("Invalid choice");}
        sc.close();
    }
    
}
