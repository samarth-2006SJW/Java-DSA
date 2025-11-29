package lec_09;
class Shape{
    void draw(){
        System.out.print("Shape is Circle\n");
    }
}
class Circle extends Shape{
    void calculateArea(float r)
    {
        double area=3.14*Math.pow(r,2);
        System.out.print("Area of circle is:"+area);
    }

}
public class shape_circle {
    public static void main(String[] args){
        Circle cir=new Circle();
        cir.draw();cir.calculateArea(7);
    }
}
