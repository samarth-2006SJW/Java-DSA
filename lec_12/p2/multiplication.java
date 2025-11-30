package lec_12.p2;
import lec_12.p1.subtract;
class multi {
    int a,b;
    public multi(int a,int b){
        this.a=a;
        this.b=b;
    }
    public int mult(){
        subtract k=new subtract(9,5);
        System.out.print("Subtraction of 2 numbers="+k.sub()+"\n");
        int c=a*b;
        return c;
    }
}
 public class multiplication{
    public static void main(String[] args){
        multi c=new multi(5,6);
        System.out.print("Multiplication of number="+c.mult());
    }
}
