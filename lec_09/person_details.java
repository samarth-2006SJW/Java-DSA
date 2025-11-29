package lec_09;
class Person{
    void displayName(String name){
        System.out.print("Name is:"+name+"\n");
    }
}
class Student extends Person{
    void displayClass(){
        System.out.print("Inside class 12th\n");
    }
}
class Monitor extends Student{
    void checkdiscipline(){
        System.out.print("Is atya disciplined?");
    }
}
public class person_details {
    public static void main(String[] args){
        Monitor mon=new Monitor();
        mon.displayName("Kanchan");
        mon.displayClass();
        mon.checkdiscipline();
    }
}
