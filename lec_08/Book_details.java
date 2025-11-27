package lec_08;
class Book{
    String title;
    String author;
    float price;

    Book(String t,String a,float p){
        title=t;author=a;price=p;
    }
    float discount()
    {
        price=price-((price*5)/100);
        return price;
    }
}
public class Book_details {
    public static void main(String[] args){
        Book obj=new Book("Harry Potter","J.K Rowling",600);
        System.out.print("Final Price="+obj.discount());
    }
    
}
