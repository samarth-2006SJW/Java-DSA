package lec_08;
 class hello
    {
        public hello(){this(5); System.out.print("Hiiii");}
        public hello(int x){
            this(5,8);
            System.out.print("Yay!!");
        }
        public hello(int x,int y)
        {
            System.out.print("Samarth");
        }
        void display(){
            System.out.print("Concept of Constructor Chaining!");
        }
    }
public class constructor_chaining {
   
    public static void main(String[] args)
    {
        hello obj=new hello();
        obj.display();  
    }
}
