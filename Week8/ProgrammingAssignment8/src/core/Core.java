package core;

import java.util.Scanner;

//core utils
public class Core {

    public static final String ERROR000 = "";
    public static final String ERROR001 = "";
    public static final String ERROR002 = "Method requires minimum two(2) Arguments.";
    public static final String ERROR003 = "Unsupported Arguments";
    public static final String ERROR004 = "Unrecognized Argument: Boolean";
    public static final String ERROR005 = "Unrecognized Argument: Int";
    public static final String ERROR006 = "Unrecognized Argument: String";
    public static final String ERROR007 = "Unrecognized Argument: Bounds";

    public static final char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    // get String until have String
    // TODO: add minimum user input of len 1
    // TODO: Resource leak: <Scanner> is never closed
    public static String inputString() {
        String output = "";// tmp
        Scanner sysin = new Scanner(System.in);
        System.out.print("$ ");// prompt
        if (sysin.hasNextLine()) {
            output = sysin.nextLine();
        } else {
            inputString();
        }
        return output;
    }

}
