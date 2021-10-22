import java.util.Scanner;

public class BaseChange {

    public static void main(String[] args) {
        Object[] input = input(); // get user input function who returns an array of three(3) user inputs
        String number = (String) input[0]; // in number stored in input array position one(1)
        long inbase = (long) input[1]; // in number base stored in input array position two(2)
        long outbase = (long) input[2]; // wanted outbase stored in input array position three(3)
        long decimal = baseTen(number, inbase); // number converted to base 10

        System.out.println(number + " base " + inbase + " -> base 10: " + decimal); // ex: 2045 base 8 -> base 10: 1061
        System.out.print(number + " base " + inbase + " -> base " + outbase + ": "); // ex: 2045 base 8 -> base 2:
        baseConverter(outbase, decimal); // converts number in base 10 -> outbase. Prints the result
        System.out.println();
    }

    public static Object[] input() { // function that gets user input and returns an array of objects (variables)
        Scanner input = new Scanner(System.in); // Make new object that reads user input from CLI
        // while and do while loops are similar.
        // do while loops loop at least once before checking the condition
        // while loops check condition first, then run.
        // get input number
        String number;
        System.out.print("Number: ");
        do { // do whats in brackets at least once, keep doing while condition is met.
            number = input.nextLine();
            // we want the input to be in string format, so we use .nextLine()
            try {// try pulling number from string input
                Long.parseLong(number);
                // check if can extract number from string input
                break; // if can, break out of loop
            } catch (NumberFormatException e) { // if can't, catch the error.
                // if we get a NumberFormatException error, don't kill the program,
                // print message and continue looping.
                // we get a NumberFormatException error when the user inputs anything non-number
                System.out.print("Error. Enter a valid number: ");
            }
        } while (true); // infinite loop

        // get input base
        long inbase = 0; // temporary assign
        System.out.print("Base of your number: ");// prompt for base
        // while input is not a number, keep asking for input.
        while (true) { // forever loop
            if (input.hasNextLong()) { // get input, check if it is a double
                inbase = input.nextLong(); // only assign the Long to base if input is a number.
                break; // break out of loop when provided a number
            } else { // if above input is not a number,
                System.out.print("Error. Enter a valid base: ");// prompt for base
                input.next();// get input again, this is what is compared on the next iteration.
            }
        }

        // get target base
        long outbase = 0; // temporary assign
        System.out.print("Target Base: ");// prompt for base
        // while input is not a number, keep asking for input.
        while (true) { // forever loop
            if (input.hasNextLong()) { // get input, check if it is a double
                outbase = input.nextLong(); // only assign the Long to base if input is a number.
                break; // break out of loop when provided a number
            } else { // if above input is not a number,
                System.out.print("Error. Enter a valid base: ");// prompt for base
                input.next();// get input again, this is what is compared on the next iteration.
            }
        }

        input.close(); // stop getting input.

        // Object arrays let you store different types of variables within one(1) array.
        return new Object[] { number, inbase, outbase }; // make array of objects who are the user input.
        // I wonder if there is a better way to return multiple values, making a whole
        // new array seems inefficient.
    }

    public static long baseTen(String number, long base) { // method that converts number to base 10 . returns a long.
        long out = 0; // to not add on first iteration of loop
        long pow = 0; // start at pow 0, go up 1 for every position in number
        long value; // stores each position of number right -> left

        // go through each position of a number, starting from right
        // for (int i = 0; number.length() > i; i++) {
        for (int i = number.length() - 1; i >= 0; i--) { // repeat once every digit in number. .length gets
            value = number.charAt(i) - '0'; // convert digit @ position i to int
            // .charAt returns ascii value of number from string
            // subtracting '0' from it returns the number as an int.

            // evaluate right most exponent/multiplication then adds
            out += (value) * (Math.pow(base, pow++)); // go up 1 for every position in number
            // number * base**pow0 + number * base**pow++ + ...
            // expansion of number
        }
        return out;
        // sets return value to out
    }

    public static void baseConverter(long outbase, long decimal) {
        long remainder;
        long quotient = decimal; // set quotient to output of baseTen method

        byte[] array = new byte[64]; // sets array size in bits

        remainder = quotient % outbase; // get remainder
        array[array.length - 1] = (byte) remainder; // assign number to correct location in array
        for (int i = array.length - 2; i >= 0; i--) { // repeat once for each position in the array, starting from

            quotient /= outbase; // divide by base
            remainder = quotient % outbase; // get remainder

            array[i] = (byte) remainder; // assign number @ position i to correct location in array
        }

        if (decimal == 0) { // if number = 0, print 0
            System.out.print("0");
        } else {
            int i = 0; // int i outside of loop so it can be reused by the next loop to start from
            for (; i < array.length; i++) { // finds the first 1 in the array
                if (array[i] != 0) // starting from first position, go up 1 at a time, if reach a 1, break
                    break;
            }
            for (; i < array.length; i++) { // starts printing from that position (i).
                // This is to not show meaningless leading zeros
                System.out.print(array[i]); // print each position in array

            }
        }
    }

}
