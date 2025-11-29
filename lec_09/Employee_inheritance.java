package lec_09;
class employee{
    void work()
    {
        System.out.print("Employee Working\n");
    }
}
class Manager extends employee{
    void attendMeeting(){
        System.out.print("Manager calls for a meeting");
    }
}
public class Employee_inheritance {
   public static void main(String[] args){
    Manager obj=new Manager();
    obj.work();
    obj.attendMeeting();
   } 
}
