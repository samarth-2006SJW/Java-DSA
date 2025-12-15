package lec_14;
public class Arithmetic_exception_example {
    public static void main(String[] args){
        System.out.print("Hello!\n");
        try{
            int a=5;
            int b=0;
            int c= a/b;
            System.out.print(c+"\n");

        }catch(Exception e){
            System.out.print(e+"\n");
        }
        System.out.print("Byeeee!!");
    }
}
