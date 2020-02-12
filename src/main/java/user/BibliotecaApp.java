package user;

import com.tw.university.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

//Represents the user
class BibliotecaApp implements BibliotecaUI {

    private final Library library;
    private final Menu menu;
    Scanner input = new Scanner(System.in);

    public BibliotecaApp(Menu menu, Library library) {
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
    public Book checkOutBooks(ArrayList<Book> books) {
        return selectABook(books);
    }

    @Override
    public void displayMessage(String message) {
        System.out.println(message);
    }

    @Override
    public Book returnBooks(ArrayList<Book> books) {
        return selectABook(books);
    }

    private Book selectABook(ArrayList<Book> books) {
        System.out.println("Enter choice: ");
        int option = input.nextInt();
        if (option <= books.size() && notNegative(option))
            return books.get(option - 1);
        return null;
    }
}
