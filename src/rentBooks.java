import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class rentBooks {

    static Scanner scanner = new Scanner(System.in);

    public static void rentBooksOption() {
        ArrayList<String> booksStorage = new ArrayList<>();


        booksStorage.add("");
        booksStorage.add("1. Harry Potter");
        booksStorage.add("2. Vane dyr");
        booksStorage.add("3. Emperor of Rome");
        booksStorage.add("4. SPQR");

        System.out.println("This is the books we have in storage");
        ConsoleStuff.printSeperator(30);

        for (String bøger : booksStorage) {
            System.out.println(bøger);
        }
        ConsoleStuff.printSeperator(30);

        int userChoice = scanner.nextInt();
        System.out.println("You have now rented: " + booksStorage.get(userChoice));
        String userRentedBookChoice = booksStorage.get(userChoice);

    }



    }

