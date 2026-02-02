package lec_16;
class MyThread extends Thread{
    public void run(){
        System.out.print("Multithreading\n");
        System.out.print(Thread.currentThread().getName()+"\n"); 
        for(int i=6;i<=10 ;i++){
            System.out.println(i+" t1 ");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.print(e+"\n");
            }
           
        }
       
    }   // lec_16 ke andar aake java name.javaa karke chalana fir chalega

}
public class pausing_thread_using_sleep{
    public static void main(String[] args){//main defaultnthread hota hai samjha bhai!!!1
        System.out.print(Thread.currentThread().getName()+"\n");
        MyThread obj=new MyThread();
        obj.start(); 
        for(int i=1;i<=5;i++){
            System.out.print(i+" ");
        }
        try {
             obj.join();//ye agar loop ke pehle likhu to pehle thread-0 execute hoga pehle then main thread 
        }
        catch (Exception e) {
            System.out.print(e+"\n");
        }    
    }    
}