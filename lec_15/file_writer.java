package lec_15;
import java.io.*;
public class file_writer {
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
        }createData();

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
}
