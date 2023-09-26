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
        System.out.println("What is your party affiliation? (D, R, I, Other)");
        String res = get_string();
        switch (res) {
            case "D": System.out.println("You get a democratic donkey.");
            case "R": System.out.println("You get a republican elephant");
            case "I": System.out.println("I don't know what independs get tbh");
            default: System.out.println("Cool choice! I like " + res + " too");
        }
    }
}