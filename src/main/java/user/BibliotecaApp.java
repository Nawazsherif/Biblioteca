package user;

import com.tw.university.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

//Represents the user
public class BibliotecaApp implements IBibliotecaApp {

    private final Library library;
    private final ArrayList<MenuItem> menu;
    Scanner input = new Scanner(System.in);

    public BibliotecaApp(ArrayList<MenuItem> menu, Library library) {
        this.menu = menu;
        this.library = library;
    }

    public void displayMenu() {
        //noinspection InfiniteLoopStatement
        while (true) {
            System.out.println("Main menu : ");
            menu.forEach(menuItem -> System.out.println(menu.indexOf(menuItem) + 1 + ". " + menuItem.option()));

            System.out.println("Enter choice : ");
            int option = input.nextInt();
            if (option <= menu.size() && notNegative(option))
                menu.get(option - 1).select(this);
            else
                System.out.println("Please enter a valid option!");
        }
    }

    private boolean notNegative(int option) {
        return option > 0;
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

    public void startApp() {
        System.out.println(library.welcomeMsg());
    }

    @Override
    public void displayAppMessages(String message) {
        System.out.println(message);
    }

    @Override
    public Book selectBook(ArrayList<Book> books) {
        System.out.println("Enter book to select: ");
        int option = input.nextInt();
        if (option <= books.size() && notNegative(option))
            return books.get(option - 1);
        return null;
    }

    @Override
    public Movie selectMovie(ArrayList<Movie> movies) {
        System.out.println("Enter book to select: ");
        int option = input.nextInt();
        if (option <= movies.size() && notNegative(option))
            return movies.get(option - 1);
        return null;
    }

    @Override
    public void listMovies(ArrayList<Movie> movies) {
        Stream.generate(() -> " _").limit(29).forEach(System.out::print);
        System.out.println();
        System.out.println(String.format("|          Name%-8s|" + "     Director%-4s|" + " Year%-2s|" +
                " Rating |", " ", " ", " "));
        Stream.generate(() -> " -").limit(29).forEach(System.out::print);
        System.out.println();
        movies.forEach(movie -> {
            System.out.println(String.format("|   %d.%-17s|  %-15s| %-6d| %-7d|", movies.indexOf(movie)+1, movie.name(),
                    movie.director(), movie.year(), movie.rating()));
        });
        Stream.generate(() -> " -").limit(29).forEach(System.out::print);
        System.out.println();
    }
}
