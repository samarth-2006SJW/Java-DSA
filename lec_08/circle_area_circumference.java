package lec_08;
import java.util.*;
class Circle{
    double radius;
    Circle(double r){
        radius=r;
    }
    double area(){
        double k=Math.pow(radius,2);
        double area=3.14*k;
        return area;

    }
    double perimeter(){
        double k=2*radius;
        double perimeter=3.14*k;
        return perimeter;
    }
}
public class circle_area_circumference {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius");
        double r=sc.nextFloat();
        Circle obj=new Circle(r);
         double k=obj.area();
        System.out.print("Area of circle="+k+"\n");
        double z=obj.perimeter();
        System.out.print("Area of circle="+z+"\n");
        sc.close();


    }
}
