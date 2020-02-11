package user;

import com.tw.university.Book;
import com.tw.university.Library;
import com.tw.university.ListBooks;
import com.tw.university.Menu;

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
        ListBooks option = new ListBooks(library, bibliotecaApp);
        bibliotecaApp.addOptions(option);

        bibliotecaApp.startApp();
        bibliotecaApp.displayMenu();
    }
}
