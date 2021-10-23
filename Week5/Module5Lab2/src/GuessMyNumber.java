import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int guess;

        // generates a random number (in the interval [0 , 100})
        int number = random.nextInt(101);

        System.out.print(
                "I'm thinking of a number between 1 and 100 (inclusive). Can you guess what it is?\nType a number: ");

        int i = 0;
        do {
            // prompts the user for their guess.
            do {
                if (input.hasNextInt()) {
                    guess = input.nextInt();
                    break;
                } else {
                    System.out.print("Error. Type a number: ");
                    input.next();
                }
            } while (true);

            // After each guess, report whether the guess was correct or incorrect.
            if (guess == number) {
                // If the guess was correct, terminate the program and print a success message.
                System.out.println("Good guess!");
                break;
            } else if (guess < number) {
                System.out.printf("Off by %d. ", number - guess);
            } else {
                System.out.printf("Off by %d. ", guess - number);
            } // If the guess was incorrect, report that fact and the miss distance of the
              // guess.
            i++;
            // The user is permitted three guesses.
        } while (i < 3);
        input.close();
        System.out.println();
    }

    public static boolean numGuess() {

        return true;

    }

}
