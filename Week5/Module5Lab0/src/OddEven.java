import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Reads the integer
        int number = input();

        // Reports whether the entered integer is even or odd
        if (number % 2 == 0) {
            System.out.printf("%d is even.\n", number);
        } else {
            System.out.printf("%d is odd.\n", number);
        }

    }

    // Prompts the user to input an integer
    public static int input() { // function that gets user input and returns an int
        Scanner input = new Scanner(System.in); // Make new object that reads user input from CLI

        boolean test = true;
        int number = 0; // temporary assign
        System.out.print("Input Int: ");// prompt for base
        do { // forever loop
            if (input.hasNextLong()) { // get input, check if it is an int
                number = input.nextInt(); // only assign the int to number if input is a number
                test = false; // break out of loop when provided a number
            } else { // if above input is not a number,
                System.out.print("Error. Enter a valid number: ");// prompt for number
                input.next();// get input again, this is what is compared on the next iteration
            }
        } while (test == true); // keep looping
        input.close();
        return number;
    }
}