package lec_14;
public class Nullpointerexception_example {
    public static void main(String[] args){
        System.out.print("Hello\n");
        try{
            String s=null;
            System.out.print(s+"\n");//agar agli line comment kardu to exception aayega hi nhi and therefore catch run hi nhi hoga 
            System.out.print(s.length()+"\n");//catch na likhna ho to Finally {} likh try ke baad catch likhna nhi padega
        }catch(Exception e){
            System.out.print(e+"\n");
        }
        System.out.print("Byee!!");
    }
}
