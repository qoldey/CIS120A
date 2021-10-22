
public class ChangeBase {

    public static void main(String[] args) {
        String number = "2045"; // input number
        long inbase = 8; // input number base
        long outbase = 2; // output base
        long decimal = baseTen(number, inbase); // number converted to base 10

        System.out.println(number + " base " + inbase + " -> base 10: " + decimal); // ex: 2045 base 8 -> base 10: 1061
        System.out.print(number + " base " + inbase + " -> base " + outbase + ": "); // ex: 2045 base 8 -> base 2:
        baseConverter(outbase, decimal); // converts number in base 10 -> outbase. Prints the result
        System.out.println();
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
