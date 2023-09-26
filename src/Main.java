import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.*;

public class Main {
    private static final Logger log = Logger.getLogger("Main");

    private static String get_string() {
        System.out.print("Please enter a string: ");
        Scanner in = new Scanner(System.in);
        String res;
        try {
            res = in.nextLine();
        } catch (InputMismatchException e) {
            log.log(Level.WARNING, "Input an string please, e.x. 'Hola'");
            System.out.println("- - - -");
            return get_string();
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}