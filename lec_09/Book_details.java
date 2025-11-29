package lec_09;
class Book{
    void read() {
        System.out.println("Reading a book");
    }
 }
 class Novel extends Book {
    void storyLine() {
        System.out.println("The novel has an interesting storyline");
    }
}
class Book_details{
    public static void main(String[] args){
        Novel n = new Novel();
        n.read();
        n.storyLine();
    }
}