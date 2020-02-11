package user;

import com.tw.university.*;

import java.util.ArrayList;
import java.util.stream.Stream;

//Represents the user
public class User implements BibliotecaUI {

    BibliotecaApp bibliotecaApp;

    public static void main(String[] args) {

        User user = new User();
        user.startApp();
        user.displayMenu();
    }

    public void startApp() {
        bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.bind(this);
        Library library = bibliotecaApp.library;
        System.out.println(library.welcomeMsg());
    }

    private void displayMenu() {
        Menu menu = new ListBooks(bibliotecaApp.library,bibliotecaApp.bibliotecaUI);
        menu.onSelect();
    }

    @Override
    public void listBooks(ArrayList<Book> books) {
        Stream.generate(() -> " _").limit(28).forEach(System.out::print);
        System.out.println();
        System.out.println(String.format("|          Name%-18s|" + "    Author%-5s|" + " Year%-1s|", " ", " ", " "));
        Stream.generate(() -> " -").limit(28).forEach(System.out::print);
        System.out.println();
        books.forEach(book -> System.out.println(String.format("|   %d. %-26s|" + "    %-11s|" + " %-5d|",
                books.indexOf(book) + 1, book.name, book.author, book.publishedYear)));
        Stream.generate(() -> " -").limit(28).forEach(System.out::print);
        System.out.println();
    }
}
