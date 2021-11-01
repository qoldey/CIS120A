import java.util.Scanner;

public class Abecedarian {
    public static String killword = "1337";

    public static void main(String[] args) {
        String out;
        System.out.printf("Type \"%s\" to exit program.\n", killword);

        while (true) {
            out = input();
            // repeat prompting the user until they ask to stop.
            if (!(out.equals(killword))) {
                // Call the method from a main method that prompts the user for the String they
                // want to check.
                System.out.printf("%s is Abecedarian: %b\n", out, isAbecedarian(out));
            } else {
                System.out.println("Goodbye 0/");
                break;
            }
        }
    }

    // a method that takes a String and returns a boolean indicating whether the
    // String is abecedarian.
    public static boolean isAbecedarian(String input) {

        boolean out = true; // temp
        for (int i = 0; i < input.length() - 1; i++) {

            // abecedarian - each char is lexicographically <= the next.
            // A is lexicographically less than B
            // if (char[i] comes before char[i+1] true)
            if (!(Character.toString(input.charAt(i))
                    .compareToIgnoreCase(Character.toString(input.charAt(i + 1))) <= 0)) {
                out = false;
                break;
            } else {
                out = true;
            }
        }
        return out;

    }

    // method that prompts the user for the String they want to check.
    public static String input() {
        final Scanner input = new Scanner(System.in);
        String errormessage = "Error. Enter String (\"" + killword + "\" to exit): ";
        String output;

        System.out.print("Input String: ");
        while (true) {
            // if user input is a string and only contains letters in the alphabet
            if (input.hasNextLine()) {
                output = input.nextLine();
                if (output.equals(killword)) {
                    break;
                }
                // ^ - Start of String
                // * - Everything
                // $ - End of String
                // Checks that output only contains one(1) string with only letters
                if (!output.equals("") && output.matches("^[a-zA-Z]*$")) {
                    break;
                } else {
                    System.out.print(errormessage);
                }
            } else {
                System.out.print(errormessage);
            }
        }
        // input.close;
        // after closing the input stream, I have been unable to call the input method
        // again. Is there a way to close this from perhaps main, after the user has
        // closed the program? Is this needed?

        return output;
    }

}
