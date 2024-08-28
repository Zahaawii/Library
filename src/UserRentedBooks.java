import java.util.ArrayList;
import java.util.Scanner;

public class UserRentedBooks {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> rentedBooks = new ArrayList <>();

    public static void returnBooksDisplay(String prompt) {
        System.out.println(prompt);
    }

    public static void BooksRented() {

        ConsoleStuff.printSeperator(30);
        rentedBooks.add("");
        rentedBooks.add("1. Harry potter");
        rentedBooks.add("2. SPQR");
        rentedBooks.add("3. Hack dit studieliv");
        rentedBooks.add("4. Studieteknikker");

        for(String books : rentedBooks) {
            System.out.println(books);
        }

        ConsoleStuff.printSeperator(30);
        System.out.println("You have rented these books.");


        }
    }

