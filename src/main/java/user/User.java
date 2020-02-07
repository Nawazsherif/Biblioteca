package user;

import com.tw.university.Biblioteca;
import com.tw.university.Book;

import java.util.ArrayList;
import java.util.stream.Stream;

public class User {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        System.out.println(biblioteca.welcomeMsg());

        ArrayList<Book> books = new ArrayList<>();
        Book book1 = new Book("Adventure Time", "Crusoe", 1999);
        Book book2 = new Book("Sorcerer's stone", "Rowling", 1987);
        books.add(book1);
        books.add(book2);
        biblioteca.add(books);

        Stream.generate(() -> " _").limit(28).forEach(System.out::print);
        System.out.println();

        System.out.println(String.format("|Name%-28s|" + "Author%-9s|" + "Year%-2s|"," "," "," "));

        Stream.generate(() -> " -").limit(28).forEach(System.out::print);
        System.out.println();

        biblioteca.books().forEach(book -> System.out.println(String.format("|%-32s|" + "%-15s|" + "%-6d|" ,book.name,book.author,book.publishedYear)));

        Stream.generate(() -> " -").limit(28).forEach(System.out::print);
        System.out.println();
    }
}
