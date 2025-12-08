package lec_13.Array_List;
import java.util.*;
class Student implements Comparable<Student>{
    String name;
    int rollno;

    Student(String n,int r){
        name=n;
        rollno=r;
    }
    public int compareTo(Student s1){
        return this.rollno-s1.rollno;
    }
    public String toString(){
        return rollno+" "+name;
    }
}
public class sorting_through_compareto {
    public static void main(String[] args){
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("Samarth",283));
        list.add(new Student("Prashant",244));
        Collections.sort(list); //compareto functions ko call karega
        System.out.println(list);
    }
    
}