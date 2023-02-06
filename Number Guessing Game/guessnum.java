import java.util.Scanner;
import java.util.Random;

public class guessnum {
    public static void main(String[] args) {
        Random RandomNum = new Random();
        int showMe = RandomNum.nextInt(100);

        try (
                Scanner sc = new Scanner(System.in)) {
            int number = showMe;
            int B = 5;

            int i;
            int guess;

            System.out.println("A number is selected ");
            System.out.println("between 1 to 100.");
            System.out.println("Guess the number");
            System.out.println("within 5 trials :)");

            for (i = 0; i < B; i++) {
                System.out.println("Guess the number: ");

                guess = sc.nextInt();

                if (number == guess) {
                    System.out.println("Congratulations!!!");
                    System.out.println("You have won the game :) ");
                }

                else if (number > guess) {
                    System.out.println("The number is greater than " + guess);
                }

                else if (number < guess) {
                    System.out.println("The number is less than " + guess);
                }
            }

            if (i == B) {
                System.out.println("You have exhausted " + B + " trials");
                System.out.println("The number was: " + number);
            }
        }
    }
}
