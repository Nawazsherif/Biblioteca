package user;

import com.tw.university.*;

import java.util.ArrayList;

public class StartApplication {

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
        menu.add(new Login(library));
        menu.add(new ListBooks(library));
        menu.add(new CheckOutBooks(library));
        menu.add(new ReturnBooks(library));
        menu.add(new ListMovies(library));
        menu.add(new CheckOutMovie(library));
        menu.add(new QuitApplication());
        menu.add(new Logout());

        BibliotecaApp bibliotecaApp = new BibliotecaApp(menu, library);
        bibliotecaApp.startApp();
        bibliotecaApp.displayMenu();
    }
}
