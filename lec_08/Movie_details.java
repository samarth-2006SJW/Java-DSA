package lec_08;
class Movie{
    String name;float rating;int RY;
    Movie(String n,float r,int ry){
        name=n;rating=r;RY=ry;
    }
    void details(){
        System.out.print("Movie:"+name+" Rating:"+rating+" Year of release:"+RY+"\n");
    }
}
public class Movie_details {
    public static void main(String[] args){
        Movie obj1=new Movie("Doomsday",9.8f,2026);obj1.details();
        Movie obj2=new Movie("Endgame",9.7f,2023);obj2.details();
        Movie obj3=new Movie("Thama",8.75f,2025);obj3.details();
        Movie obj4=new Movie("Delhi Crime",7.5f,2023);obj4.details(); 
        Movie obj5=new Movie("Kantara",9.4f,2025);obj5.details();
    }
    
}
