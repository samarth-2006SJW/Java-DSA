package lec_08;
class Car{
    String brand;
    int Model;
    int price;

    Car(String b,int m,int p){
        brand=b;
        Model=m;
        price=p;
    }
    void details(int i){
        System.out.print("Details of "+i+"th car:\nBrand:"+brand+" Model:"+Model+" price:"+price+"\n");
    }

}
public class Car_details{
    public static void main(String[] args){
        Car obj1=new Car("BMW",1970,50000000);obj1.details(1);
        Car obj2=new Car("Koenigsegg",1970,60000000);obj2.details(2);
        Car obj3=new Car("Bugatti",1980,400000000);obj3.details(3);
    }
}