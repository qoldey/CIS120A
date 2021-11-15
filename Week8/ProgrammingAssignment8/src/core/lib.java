package core;

public class lib {

    // Print contents of a 2D-Array //Object Array
    // print A as B, c=show n(B), d=show alphabet
    public static void print(int[] input, Object... options) {
        // check for unrecognized args
        final int OPTIONCOUNT = 3;
        if (options.length > OPTIONCOUNT) {
            throw new IllegalArgumentException(Core.ERROR006);
        }
        // init defaults options
        String printout = "#"; // option 1
        boolean printVal = false; // 2
        boolean printAlphabet = false; // ...

        // assign options
        if (options.length > 0) {
            if (!(options[0] instanceof String)) {
                throw new IllegalArgumentException(Core.ERROR003);
            } // if option is passed && is a String
            printout = (String) options[0];
            if (options.length > 1) {
                if (!(options[1] instanceof Boolean)) {
                    throw new IllegalArgumentException(Core.ERROR004);
                } // if option is passed && is a Boolean
                printVal = (boolean) options[1];
                if (options.length > 2) {
                    if (!(options[2] instanceof Boolean)) {
                        throw new IllegalArgumentException(Core.ERROR004);
                    } // if option is passed && is a Boolean
                    printAlphabet = (boolean) options[2];
                }
            }
        }

        // print
        int letterIndex = 0;
        for (int i = 0; i < input.length; i++) {

            if (printVal) {
                System.out.printf("%d ", input[i]);
            }
            // if input is passed in letterHist format
            if (printAlphabet) {
                char letter;
                letter = Core.alphabet[letterIndex];

                System.out.printf("%C ", letter);
                if (letterIndex == Core.alphabet.length) {
                    letterIndex = 0;
                } else {
                    letterIndex++;
                }
            }
            for (int j = 0; j < input[i]; j++) {

                System.out.print(printout);
            }
            System.out.println();
        }
    }
}