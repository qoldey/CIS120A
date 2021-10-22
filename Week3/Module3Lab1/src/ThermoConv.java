import java.util.Scanner;

public class ThermoConv {
    public static void main(String[] args) {

        Object[] input = input(); // get user input function who returns an array of two(2) user inputs
        String unit = (String) input[0]; // temp unit stored in input array position one(1)
        double temp = (double) input[1]; // temperature stored in input array position two(2)

        // if input(not case sensitive) = c,
        if (unit.equalsIgnoreCase("c")) {
            // then run method that converts c to f(tof)
            // %.2f only shows 2 decimal points from the given double (ctof(temp) return)
            System.out.printf(temp + " C = %.2f F\n", ctof(temp)); // ex: 24.0 C = 75.2 F
        }
        // if input (not case sensitive) = f,
        // this could be an else statement since there is only two(2) comparisons
        if (unit.equalsIgnoreCase("f")) {
            // %.25 is a placeholder for the return of ftoc(temp).
            // It tells printf to only show 2 decimal points from output.
            System.out.printf(temp + " F = %.2f C\n", ftoc(temp)); // ex: 32.0 F = 0.00 C
        }
    }

    public static Object[] input() { // function that gets user input and returns an array of objects (variables)
        Scanner input = new Scanner(System.in); // Make new object that reads user input from CLI
        System.out.println("Unit to convert FROM"); // prompt for units
        System.out.print("Celsius or Fahrenheit: "); // prompt for units
        String unit = input.next();// get input, assign it to unit

        // while first char of input(.substring(0, 1) is not(!) c or(||) f,
        // keep asking for input(input.next()).
        // this will accept any text that starts with c or f.
        while (!(unit.substring(0, 1).equalsIgnoreCase("c") || unit.substring(0, 1).equalsIgnoreCase("f"))) {
            System.out.print("Unit not found. C or F?: ");
            unit = input.next(); // get input and compare
        }
        unit = unit.substring(0, 1); // make unit only the first char from input

        double temp = 0.0; // temporary assign
        System.out.print("Temperature: ");// prompt for temp
        // while input is not a number, keep asking for input.
        while (true) { // forever loop
            if (input.hasNextDouble()) { // get input, check if it is a double
                temp = input.nextDouble(); // only assign the double to temp if input is a double.
                break; // break out of loop when provided a double
            } else { // if above input is not a double,
                System.out.print("Error: Enter a valid temperature: ");// prompt for temp
                input.next();// get input again, this is what is compared on the next iteration.
            }
        }
        input.close(); // stop getting input.

        // Object arrays let you store different types of variables within one(1) array.
        return new Object[] { unit, temp }; // make array of objects who are the user input.
    }

    public static double ctof(double temp) {// convert celsius in to fahrenheit out
        double out = (temp * 1.8) + 32; // C to F formula
        return out;
    }

    public static double ftoc(double temp) {// convert fahrenheit in to celsius out
        double out = (temp - 32) / 1.8; // F to C conversion formula
        return out;
    }
}