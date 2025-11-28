package lec_08;
class Laptop_details{
    String brand;
    String RAM;
    int price;

    Laptop_details(String b,String r,int p){
        brand=b;RAM=r;price=p;
    }

    void display(){
        System.out.print("Details of laptop:\n"+"Brand:"+brand+" RAM:"+RAM+" Price:"+price+"\n");
    }
}
public class Laptop {
    public static void main(String[] args){
        Laptop_details obj=new Laptop_details("ASUS","16GB",58000);
        obj.display();
    }
}
