import java.util.Scanner;

public class WelcomeMenu {

    static Scanner scanner = new Scanner(System.in);
    int loanBook = 1;
    int returnBook = 2;
    int seeLoanBooks = 3;

    public static void Welcome(String prompt){
        ConsoleStuff.displayInfo("Welcome to Zahaas library");
        ConsoleStuff.printSeperator(30);
        System.out.println(prompt);
        ConsoleStuff.printSeperator(30);
    }

    public static void userWelcomeChoice() {
       int userChoice;

        do {
            System.out.println("Press 1, 2 or 3 to go forward");
            ConsoleStuff.printSeperator(30);
            try {
                userChoice = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                System.out.println("You need to choose a number");
                userChoice = 0;
            }

        } while (userChoice <= 0 || userChoice >= 4);

        if(userChoice == 1) {
            System.out.println("You have chosen to rent a book");
            ConsoleStuff.printSeperator(30);
            rentBooks.rentBooksOption();
            StartOverAgain.userEnd();

        }

        if(userChoice == 2) {
            ReturnBooks.returnBooksDisplay("You want to return a book");
            ConsoleStuff.printSeperator(30);
            StartOverAgain.userEnd();
        }

        if(userChoice == 3) {
            UserRentedBooks.returnBooksDisplay("You want to see your rented books");
            UserRentedBooks.BooksRented();
            StartOverAgain.userEnd();

        }

    }
}
