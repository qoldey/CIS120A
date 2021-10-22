import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        int change = input();
        int quarters = change / 25; // get quarters
        int remainder = change % 25;
        int dimes = remainder / 10; // get dimes
        remainder %= 10;
        int nickels = remainder / 5; // get nickels
        remainder %= 5;
        int pennies = remainder / 1; // remainder is pennies.

        System.out.printf("%d cents ($%.2f)\nReturn:\n%d quarters\n%d dimes\n%d nickels\n%d pennies\n", change,
                change * .01, quarters, dimes, nickels, pennies);
        /*
         * Ex: Cents: 118 118 cents ($1.18). Return: 4 quarters 1 dimes 1 nickels 3
         * pennies
         */

    }

    public static int input() {
        Scanner input = new Scanner(System.in);
        int change = 0; // temporary assign
        System.out.print("Cents: ");// prompt for change
        // while input is not a number, keep asking for input.
        while (true) { // forever loop
            if (input.hasNextInt()) { // get input, check if it is a double
                change = input.nextInt(); // only assign the Int to change if input is a number.
                break; // break out of loop when provided a number
            } else { // if above input is not a number,
                System.out.print("Error. Enter a valid number: ");// prompt for change
                input.next();// get input again, this is what is compared on the next iteration.
            }
        }
        input.close();
        return change;
    }
}
