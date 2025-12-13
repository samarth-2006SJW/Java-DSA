package lec_15;
import java.io.*;
public class file_creation_exception {
    public static void main(String[] args){
        try{
            File file=new File("home.html");
            if(file.createNewFile()){
                System.out.print("doneeee\n"+file.getName());
            }else{
                System.out.print("Already file created");
            }


        }catch(Exception e){
            System.out.print(e+"\n");
        }
    }
}
