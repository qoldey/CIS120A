public class IterativeSierpinski1 {
    static Turtle pen = new Turtle();

    public static void main(String[] args) {

        pen.hide();
        pen.speed(0);
        pen.width(0.1);
        // move to lower left location of equilateral triangle
        // with side lengths 400 and set direction = 0 degrees
        double scale = 400;
        pen.up();
        pen.setPosition(-scale / 2, (-Math.sqrt(3) * scale / 2) / 2);
        pen.setDirection(0);

        // Lets rock: nested loops to create Sierpinski gasket
        for (int i = 0; i < 3; i++) {
            double a1 = scale / 2;
            drawTriangle(pen, a1);
            if (i == 0) {
                move1To2(pen, a1);
            } else if (i == 1) {
                move2To3(pen, a1);
            } else {
                move3To1(pen, a1);
            }
        }
    }

    public static void drawTriangle(Turtle pen, double a) {
        pen.down();
        for (int i = 0; i < 3; i++) {
            pen.forward(a);
            pen.left(120);
        }
        pen.up();
    }

    public static void move1To2(Turtle pen, double a) {
        pen.forward(a);
    }

    public static void move2To3(Turtle pen, double a) {
        pen.left(120);
        pen.forward(a);
        pen.right(120);
    }

    public static void move3To1(Turtle pen, double a) {
        pen.left(60);
        pen.backward(a);
        pen.right(60);
    }

}