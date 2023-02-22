package MJava.pack;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;
public class RepeatingGuessingGame {
    public static void main(String[]args) {
        Scanner keyboard = new Scanner(System.in);
        int numGuesses = 0;
        int randomNumber = new Random().nextInt(10) + 1; //generates a number from 1 to 10
        out.println(" ********** ");
        out.println("Welcome to the Guessing Game");
        out.println(" *********** ");
        out.println();
        out.println("Enter an input from 1 to 10: ");
        int inputNumber = keyboard.nextInt();
        numGuesses++;
        while (inputNumber != randomNumber) {
            out.println();
            out.println("Try again... ");
            out.println("Enter an int from 1 to 10: ");
            inputNumber = keyboard.nextInt();
            numGuesses++;
        }
        out.println("You win after ");
        out.println(numGuesses + " guesses.");
    }


}
