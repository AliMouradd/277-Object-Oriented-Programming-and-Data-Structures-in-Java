
public class Book {
    String title;
    String author;
    int pages;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    public Book(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    public String info(){
        return title +" written by "+ author +" containing "+ pages +" pages";
        }
}
