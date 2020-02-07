package user;

import com.tw.university.Biblioteca;
import com.tw.university.Book;

import java.util.ArrayList;

public class User {

    public static void main(String[] args) {
        Biblioteca biblioteca=new Biblioteca();
        System.out.println(biblioteca.welcomeMsg());

        ArrayList<Book> books = new ArrayList<>();
        Book book1 = new Book("Adventure Time");
        Book book2 = new Book("Sorcerer's stone");
        books.add(book1);
        books.add(book2);
        biblioteca.add(books);

        biblioteca.books().forEach(book -> System.out.println(book.name));
    }
}
