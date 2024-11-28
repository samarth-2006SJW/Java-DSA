package lec_08;
import java.util.*;
class Rectangle{
    int length,breadth;
    Rectangle(int l,int b){
        length=l;
        breadth=b;
    }
    int area(){
                   
          int area=length*breadth;
          return area;
    }
    int perimeter()
    {
        int perimeter=2*(length+breadth);
        return perimeter;
    }
}
public class Area_calculation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length:");
        int l=sc.nextInt();System.out.print("Enter breadth:");
        int b=sc.nextInt();sc.close();
        Rectangle r=new Rectangle(l,b);
        int k=r.area();
        System.out.print("Area of Reactangle="+k+"\n");
        int z=r.perimeter();
        System.out.print("Perimeter of Rectangle="+z);
    }
}
