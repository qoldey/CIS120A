import java.awt.Color; // rgb color 

public class IterativeSierpinski2 {
    static Turtle pen = new Turtle();
    static Color bColour, pColour;
    public static double scale;

    public static void main(String[] args) {

        pen.up();

        // pen.hide();
        pen.speed(150);
        pen.width(0.1);
        // move to lower left location of equilateral triangle
        // with side lengths 400 and set direction = 0 degrees
        bColour = new Color(17, 50, 77);
        pColour = new Color(220, 184, 255);
        pen.penColor(pColour); // pencolor
        Turtle.bgcolor(bColour); // background colour

        // pen.hide();
        pen.speed(50);
        pen.width(0.1);
        // move to lower left location of equilateral triangle
        // with side lengths 400 and set direction = 0 degrees

        int runs = 3;
        scale = 100;
        // try1();
        sierpinki(runs, scale);

    }

    public static void sierpinki(double runs, double scale) {

        if (runs == 0) {
            return;
        } else {
            drawTriangle(pen, scale);
            drawTriangle(pen, scale / 2);
            pen.forward(scale / 2);
            drawTriangle(pen, scale / 2);
            pen.up();
            pen.left(120);
            pen.forward(scale / 2);
            pen.right(120);
            pen.down();
            drawTriangle(pen, scale / 2);
            pen.right(120);

            pen.forward(scale / 2);
            pen.left(120);

            sierpinki(runs - 1, scale / 2);

            mforward(pen, scale / 2);

            sierpinki(runs - 1, scale / 2);

            pen.left(120);
            pen.forward(scale / 2);
            pen.right(120);

            sierpinki(runs - 1, scale / 2);

            pen.right(120);
            pen.forward(scale / 2);
            pen.left(120);

        }

    }

    static void mforward(Turtle pen, double scale) {

        pen.up();
        pen.forward(scale);
        pen.down();

    }

    // what do we know and what do we want

    String pseduo = """

                    if runs = 1
                        draw a triangle
                    else
                        move 3 to 1

                        runs--

                        triangle size
                        triangle size/2
                        forward size/2
                        triangle size/2
                        pen up
                        left 120
                        forward scale/2
                        pen down
                        triangle size/2




                    draw triangle @ scale
                    3 to 1 @ scale
                    draw 2 of what you just drew next to each other
                    scale *=2
                    move back scale
                    goto line2


                    int i=1 i<runs i++
                        triangle@scale
                        triangle@scale
                        3to1@scale
                        scale *=2


                    triangles(int i, int scale){

                        if i = 1; triangle @ scale
                        else; i--



                    }

            """;

    public static void try1() {

        pen.setPosition(-scale / 2, (-Math.sqrt(3) * scale / 2) / 2);
        pen.setDirection(0);

        // Lets rock: nested loops to create Sierpinski gasket

        for (int i1 = 0; i1 < 3; i1++) {
            double a1 = scale / 2;
            drawTriangle(pen, a1);
            for (int i2 = 0; i2 < 3; i2++) {
                double a2 = a1 / 2;
                drawTriangle(pen, a2);
                if (i2 == 0) {
                    move1To2(pen, a2);
                } else if (i2 == 1) {
                    move2To3(pen, a2);
                } else {
                    move3To1(pen, a2);
                }
            }

            if (i1 == 1) {
                move1To2(pen, a1);
            } else if (i1 == 2) {
                move2To3(pen, a1);
            } else {
                move3To1(pen, a1);
            }

        }
    }

    public static void drawTriangle(Turtle pen, double scale) {
        pen.down();
        for (int i = 0; i < 3; i++) {
            pen.forward(scale);
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