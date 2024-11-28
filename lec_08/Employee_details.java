package lec_08;
class Employee{
    String name;int Employee_id;int salary;

    Employee(String n,int ep,int s){
        name=n;Employee_id=ep;salary=s;
    }
    void details(){
        System.out.print("Name:"+name+" ID:"+Employee_id+" Salary:"+salary+"\n");
    }
    void increment(){
        salary=salary+((salary*5)/100);
    }
}
public class Employee_details {
    public static void main(String[] args){
        Employee obj=new Employee("Ghanshyam Singh",456,200000);
        System.out.print("Details before increment\n");
        obj.details();
        System.out.print("Details after increment\n");
        obj.increment();
        obj.details();

    }
    
}
