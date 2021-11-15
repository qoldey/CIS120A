package core;

import java.util.ArrayList;

//
// Utils built ontop of core.Core
//
public class utils {

    // append to list of Strings until user inputs startCode, return input.
    // Exit when user inputs exitCode, printing exitMessage
    // if stopOptions exist, exitCode = stopOptions[0], exitMessage = stopOption[1]
    public static ArrayList<String> inputArray(String... options) {
        // use to add additional options later
        final int OPTIONCOUNT = 3;
        if (options.length > OPTIONCOUNT) {
            throw new IllegalArgumentException("ERROR 001:Unrecognized Arguments");
        }

        // New Array list of strings to get input
        ArrayList<String> inputs = new ArrayList<String>();

        // default options
        String startCode = ":w";
        String exitCode = ":q";
        String exitMessage = "Received Stop signal, exiting.";

        // overwrite default settings if passed options
        // TODO:Make this into a loop method?
        if (options.length > 0) {
            startCode = options[0];
            if (options.length > 1) {
                exitCode = options[1];
                if (options.length > 2) {
                    exitMessage = options[2];
                }
            }
        }

        String input;
        while (true) {
            input = Core.inputString();

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
    public static int[] letterHist(String input, Object... options) {
        // check for unrecognized args
        if (options.length > 3) {
            throw new IllegalArgumentException(Core.ERROR007);
        }

        int[] charCount = new int[Core.alphabet.length];
        char letter;

        // Only traverse the string once.
        for (int i = 0; i < input.length(); i++) {
            letter = input.charAt(i);
            for (int j = 0; j < Core.alphabet.length; j++) {
                // 0: # of A's : 25: # of Z's
                if (Character.toLowerCase(letter) == Character.toLowerCase(Core.alphabet[j])) {
                    charCount[j]++;
                }
            }
        }

        // optionally print the results.
        // TODO: loop this
        if (options.length == 0) {
            return charCount;
        }
        if (options.length == 1) {
            lib.print(charCount, (String) options[0]);
        }
        if (options.length == 2) {
            lib.print(charCount, (String) options[0], (boolean) options[1]);
        }
        if (options.length == 3) {
            lib.print(charCount, (String) options[0], (boolean) options[1], (boolean) options[2]);
        }
        return charCount;
    }
}
