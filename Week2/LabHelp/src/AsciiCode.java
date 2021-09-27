public class AsciiCode {

    public static void main(String[] args) {
        String x = "brg";
        char[] y = x.toCharArray();

        for (char z : y) {
            System.out.println((int) z); // cast char z to int - this can be done anywhere, but I'm doing it here to
                                         // show the output.
        }
    }
}