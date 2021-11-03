public class Triangle {
    public static void main(String[] args) {
        triangle(4);
    }

    public static void triangle(int scale) {

        for (int i = 1; i <= scale; i++) {
            System.out.println();
            for (int j = scale; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
        }
        System.out.println();
    }
}
