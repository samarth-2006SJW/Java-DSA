package lec_15;
import java.io.*;
public class file_reader {
    public static void main(String[] args){
        createData();
        readFileData();
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
     static void createData(){
        try {
            FileWriter writer=new FileWriter("home.html",true);// agar iske samne true na lagau to jitni baar run hoga code utni baar file main data overrride hoga
            writer.write("hum sab dost hai guysssss!!!\n");
            writer.close();
        } catch (Exception e) {
            System.out.print(e+"\n");
        }
    }
    static void readFileData(){
        try {
            FileReader reader=new FileReader("home.html");// java.io.IOException: Stream closed ye exception aayega if turant hi close kardu 
            int ch;
            while((ch=reader.read())!=-1)//file ka har ek char khali hai = empty file
            {
                System.out.print((char)ch);
            } reader.close();  
        } catch (Exception e) {
            System.out.print(e+"\n");

        }
       
    }
}
