package MJava.pack;

import java.util.Scanner;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.println("enter an int from 1 to 10: ");

        int inputNumber= keyboard.nextInt();
        int randomNumber=new Random().nextInt(10)+1;
        if(inputNumber==randomNumber) {
            System.out.println("********");
            System.out.println("You win");
            System.out.println("*********");
        }else{
            System.out.println("You lose.");
            System.out.print("The random number was ");
            System.out.println(randomNumber+".");
        }
        System.out.println(("Thank you for playing."));
        keyboard.close();

    }
}
