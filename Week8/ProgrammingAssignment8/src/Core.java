import java.util.Scanner;

//core utils
public class Core {

    public static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

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
