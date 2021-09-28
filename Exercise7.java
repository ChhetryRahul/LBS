package Advanced_java.Adv_Exercise7;
import java.util.ArrayList;

class Book {
    public String name,author; 

    public Book(String name,String author) {
        this.name = name;
        this.author = author;
    }
    @Override
    public String toString() {
        return "Book{" + "name = '" + name + '\'' + " : author = '" + author + "'}";
    }
}

class MyLibrary {

    public ArrayList<Book> books;

    public MyLibrary(ArrayList<Book> books){
        this.books = books;        
    }
    public void addBook(Book book){
        this.books.add(book);
        System.out.println("The book has been added");
    }   
    public void issue_Book(Book book , String issued_to) {
        System.out.println("The book has been issued to "+ issued_to);
        this.books.remove(book);
    }
    public void return_Book(Book book){
        System.out.println("The book has been returned");
        this.books.add(book);
    }

}

public class Exercise7 {   
    public static void main(String[] args) {
        System.out.println("Welcome to the Modern Library");

        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("Harry Potter","J.K Rowling");
        bk.add(b1);

        Book b2 = new Book("C++","ClSR");
        bk.add(b2);

        Book b3 = new Book("Into Java","ClSR");
        bk.add(b3);
        
        MyLibrary l = new MyLibrary(bk);
        l.addBook(new Book("RDPD","Robert kiyosaki"));
        System.out.println(l.books); 
        l.issue_Book(b1,"Rahul");
        System.out.println(l.books); 
        l.return_Book(b1);
        System.out.println(l.books); 
        System.out.println("Hello");
    }
}
