import java.io.Console;
import java.util.Scanner;
import java.util.ArrayList;

public class ReturnBooks {

    static Scanner scanner = new Scanner (System.in);
    static ArrayList <String> rentedBooks = new ArrayList <>();

    public static void returnBooksDisplay(String prompt) {
        System.out.println(prompt);
    }

    public static void returnBooksRented() {

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
        System.out.println("You have rented these books. Which one would you like to return");
        System.out.println("Type the number and not the name");
        ConsoleStuff.printSeperator(30);

        int userInput = scanner.nextInt();

        System.out.println("You have returned: " + rentedBooks.get(userInput));
        ConsoleStuff.printSeperator(30);

        rentedBooks.remove(userInput);

        System.out.println("Your new rented book list");
        for(String rentedBooksreturned : rentedBooks) {
            System.out.println(rentedBooksreturned);
        }


    }
}
