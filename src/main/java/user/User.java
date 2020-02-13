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

        Movie movie1 = new Movie("Ninja storms", 1990, "Cameron", 8);
        Movie movie2 = new Movie("Dino Thunder", 1990, "Cameron", 8);
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);

        Library library = new Library(books, movies);

        ArrayList<MenuItem> menu = new ArrayList<>();
        menu.add(new ListBooks(library));
        menu.add(new checkOutBooks(library));
        menu.add(new returnBooks(library));
        menu.add(new QuitApplication());

        BibliotecaApp bibliotecaApp = new BibliotecaApp(menu, library);
        bibliotecaApp.startApp();
        bibliotecaApp.displayMenu();
    }
}
