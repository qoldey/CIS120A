import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int number = random.nextInt(101);
        System.out.print(
                "I'm thinking of a number between 1 and 100 (inclusive). Can you guess what it is?\nType a number: ");

        // System.out.printf("Your guess is: %d", guess);
        while (true) {
            int guess = input.nextInt();
            if (guess == number) {
                System.out.println("Good guess!");
                break;
            }
            if (guess < number) {
                System.out.print("Higher: ");
            } else {
                System.out.print("Lower: ");
            }
        }
        input.close();
    }
}