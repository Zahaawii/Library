import java.util.Scanner;

public class StartOverAgain {

    static Scanner scanner = new Scanner(System.in);

    public static void userEnd() {
        ConsoleStuff.printSeperator(30);
        ConsoleStuff.pressToContinue();
        System.out.println("Would you like to start over or end? Press 1 to contiune or 2 to shutdown");

        int userInput;

        do {
            try {
                userInput = Integer.parseInt(scanner.next());
                System.out.println("Press 1 to start over. \nPress 2 to close the terminal ");
            } catch (Exception e) {
                System.out.println("Dit valg kan ikke registreres. Prøv igen");
                userInput = 0;

            }
        } while (userInput <= 0 || userInput >= 3);

        if (userInput == 1) {
            System.out.println("You chose to start from the beginning");
            ConsoleStuff.printSeperator(30);
            WelcomeMenu.userWelcomeChoice();
        }

        if (userInput == 2) {
            System.out.println("System closing");
            System.exit(0);
        }

    }
}
