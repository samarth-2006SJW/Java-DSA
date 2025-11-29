package lec_09;
class Device{
    void poweron(){
        System.out.print("Device powered On\n");
    }
}
class Laptop extends Device{
    void boot(){
        System.out.print("Device is booting\n");
    }    
}
class Gaming_Laptop extends Laptop{
    void startGame(){
        System.out.print("God of War will be spammed shortly!");
    }
    
}
public class Laptop_inheritance {
    public static void main(String[] args){
        Gaming_Laptop obj=new Gaming_Laptop();
        obj.poweron();
        obj.boot();
        obj.startGame();
    }
}
