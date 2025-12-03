package lec_13.Array_List;
import java.util.*;
class Student{
    String name;
    int rollno;

    Student(String n,int r){
        name=n;
        rollno=r;
    }
    public String toString(){
        return rollno+" "+name;
    }
}
class custom_sorting implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.name.compareTo(s2.name);
    }
}
public class custom_sorting_through_comparator {
    public static void main(String[] args){
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("Samarth",283));
        list.add(new Student("Prashant",244));
        Collections.sort(list,new custom_sorting()); //compareto functions ko call karega
        System.out.println(list);
    }
    
}
