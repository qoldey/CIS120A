import java.util.Random; //import random number generator
import java.util.Scanner; //import Scanner to read user input

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random(); // make a new random number generator object
        Scanner input = new Scanner(System.in); // make a new scanner object
        int number = random.nextInt(100) + 1; // generate a random number between 1-100, assign it to number
        System.out.print(
                "I'm thinking of a number between 1 and 100 (inclusive). Can you guess what it is?\nType a number: ");
        int guess = input.nextInt(); // get user input
        input.close(); // stop getting user input
        System.out.printf("Your guess is: %d\nThe number I was thinking of is: %d\nYou were off by: %d\n", guess,
                number, number - guess);
    }
}
