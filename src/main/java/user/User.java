package user;

import com.tw.university.Library;
import com.tw.university.Book;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.lang.System.exit;

//Represents the user
public class User {

    Library library;

    public User() {
        library = new Library();
        ArrayList<Book> books = new ArrayList<>();
        Book book1 = new Book("Adventure Time", "Crusoe", 1999);
        Book book2 = new Book("Sorcerer's stone", "Rowling", 1987);
        books.add(book1);
        books.add(book2);
        library.add(books);
        System.out.println(library.welcomeMsg());
    }

    public static void main(String[] args) {
        User user = new User();
        Scanner ss = new Scanner(System.in);
        while (true) {
            System.out.println("\nMain menu : ");
            System.out.println("1. List books");
            System.out.println("2. Checkout a book");
            System.out.println("3. Return a book");
            System.out.println("4. Quit");
            System.out.println("\nEnter choice : ");
            switch (ss.nextInt()) {
                case 1: {
                    user.printAllBooks(user.library.books());
                    break;
                }
                case 2: {
                    user.printAllBooks(user.library.books());
                    System.out.println("\nEnter book number to checkout : ");
                    int bookNumber = ss.nextInt() - 1;
                    Book book = user.library.books().get(bookNumber);
                    System.out.println(user.library.checkOut(book));
                    break;
                }
                case 3: {
                    user.printAllBooks(user.library.checkedOutBooks());
                    System.out.println("\nEnter book number to return : ");
                    int bookNumber = ss.nextInt() - 1;
                    Book book = user.library.checkedOutBooks().get(bookNumber);
                    System.out.println(user.library.returnBook(book));
                    break;
                }
                case 4: {
                    exit(0);
                }
                default: {
                    System.out.println("Please select a valid option!");
                }
            }
        }

    }

    public void printAllBooks(ArrayList<Book> books) {
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
