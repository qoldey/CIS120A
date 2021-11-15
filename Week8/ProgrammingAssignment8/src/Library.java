import java.util.ArrayList;

//utils.
public class Library extends Core {

    // append to list of Strings until user inputs startCode, return input.
    // Exit when user inputs exitCode, printing exitMessage
    // if stopOptions exist, exitCode = stopOptions[0], exitMessage = stopOption[1]
    public static ArrayList<String> inputArray(String... options) {
        // use to add additional options
        final int OPTIONCOUNT = 3;
        if (options.length > OPTIONCOUNT) {
            System.err.println("ERROR 001:Unrecognized Arguments");
            System.exit(0);
        }

        // New Array list of strings to get input
        ArrayList<String> inputs = new ArrayList<String>();

        // default options
        String startCode = ":w";
        String exitCode = ":q";
        String exitMessage = "Received Stop signal, exiting.";

        // overwrite default settings if passed options
        // TODO:Make this into a loop
        if (options.length > 0) {
            startCode = options[0];
            if (options.length > OPTIONCOUNT - 2) {
                exitCode = options[1];
                if (options.length > OPTIONCOUNT - 1) {
                    exitMessage = options[2];
                }
            }
        }

        String input;
        while (true) {
            input = inputString();

            // exit program if user inputs exitCode
            if (input.equals(exitCode)) {
                System.out.println(exitMessage);
                System.exit(0);
            }

            if (input.equals(startCode)) {
                break;
            } else {
                inputs.add(input);
            }
        }
        return inputs;
    }

    // a method called letterHist that takes a string as a parameter and returns an
    // int array with the frequency of each letter, optionally printing the results
    // as a histogram with the print parameter.
    public static int[] letterHist(String input, boolean... print) {
        int[] charCount = new int[alphabet.length];

        char letter;

        // Only traverse the string once.
        for (int i = 0; i < input.length(); i++) {

            letter = input.charAt(i);

            for (int j = 0; j < alphabet.length; j++) {

                // The zeroth element of the histogram should contain the number of a’s in the
                // string (upper- and lowercase); the 25th element should contain the number of
                // z’s.
                if (Character.toLowerCase(letter) == Character.toLowerCase(alphabet[j])) {
                    charCount[j]++;
                }
            }
        }

        // optionally print the results.
        // TODO: Add method to core
        if (print.length > 0 && print[0] == true) {
            for (int i = 0; i < charCount.length; i++) {

                System.out.printf("%d %C : ", charCount[i], alphabet[i]);
                for (int j = 0; j < charCount[i]; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }
        }
        return charCount;
    }
}
