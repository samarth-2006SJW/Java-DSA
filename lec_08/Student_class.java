package lec_08;
class Student{
    String name;
    int rollNumber;
    int marks;

    Student(String s,int r,int m){
        name=s;rollNumber=r;marks=m;
    }

    void display(){
        System.out.print("Student's name:"+name+" Roll:"+rollNumber+" Marks:"+marks+"\n");
    }
}
public class Student_class {
    public static void main(String[] args){
        Student obj1=new Student("Samarth",34,98);obj1.display();
        Student obj2=new Student("Vaishvi",59,45);obj2.display();
        Student obj3=new Student("Chushant",52,75);obj3.display();
        
    }
    
}
