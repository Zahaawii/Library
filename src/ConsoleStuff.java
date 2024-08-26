import java.util.Scanner;

public class ConsoleStuff {

    static Scanner scanner = new Scanner(System.in);

    public static void printSeperator(int n) {
        for (int i = 0; i < n; i++)
            System.out.print("-");
            System.out.println();
    }

    public static void pressToContinue(){
        System.out.println("Press to continue");
        scanner.next();
        clearConsole();

    }

    public static void clearConsole(){
        for(int i = 0; i < 100; i++)
            System.out.println();
    }

    public static void displayInfo(String info){
        System.out.println(info);
    }
}
