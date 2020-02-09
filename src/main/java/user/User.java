package user;

import com.tw.university.Biblioteca;
import com.tw.university.Book;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class User {

    Biblioteca biblioteca;

    public User() {
        biblioteca = new Biblioteca();
        ArrayList<Book> books = new ArrayList<>();
        Book book1 = new Book("Adventure Time", "Crusoe", 1999);
        Book book2 = new Book("Sorcerer's stone", "Rowling", 1987);
        books.add(book1);
        books.add(book2);
        biblioteca.add(books);
        System.out.println(biblioteca.welcomeMsg());
    }

    public static void main(String[] args) {
        User user = new User();

        System.out.println("\nMain menu : ");
        System.out.println("1. List books");
        System.out.println("\nEnter choice : ");
        Scanner ss = new Scanner(System.in);
        switch (ss.nextInt()) {
            case 1: {
                user.printAllBooks();
                break;
            }
            default: {
                System.out.println("Please select a valid option!");
            }
        }

    }

    public void printAllBooks() {
        Stream.generate(() -> " _").limit(28).forEach(System.out::print);
        System.out.println();
        System.out.println(String.format("|          Name%-18s|" + "    Author%-5s|" + " Year%-1s|", " ", " ", " "));
        Stream.generate(() -> " -").limit(28).forEach(System.out::print);
        System.out.println();
        biblioteca.books().forEach(book -> System.out.println(String.format("|     %-27s|" + "    %-11s|" + " %-5d|",
                book.name, book.author, book.publishedYear)));
        Stream.generate(() -> " -").limit(28).forEach(System.out::print);
        System.out.println();
    }
}
