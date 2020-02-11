package user;

import com.tw.university.*;

import java.util.ArrayList;

public class User {

    public static void main(String[] args) {
        Book book1 = new Book("Adventure Time", "Crusoe", 1999);
        Book book2 = new Book("Sorcerer's stone", "Rowling", 1987);

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        Library library = new Library(books);
        Menu menu = new Menu();

        BibliotecaApp bibliotecaApp = new BibliotecaApp(menu, library);
        bibliotecaApp.addOptions(new ListBooks(library, bibliotecaApp));
        bibliotecaApp.addOptions(new checkOutBooks(library, bibliotecaApp));

        bibliotecaApp.startApp();
        bibliotecaApp.displayMenu();
    }
}
