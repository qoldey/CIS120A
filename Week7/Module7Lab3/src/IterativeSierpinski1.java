import java.awt.Color; // rgb color 

public class IterativeSierpinski1 {
    static Turtle pen = new Turtle();
    static Color bColour, pColour;
    public static double scale;

    public static void main(String[] args) {
        pen.up();
        bColour = new Color(17, 50, 77);
        pColour = new Color(220, 184, 255);
        pen.penColor(pColour); // pencolor
        Turtle.bgcolor(bColour); // background colour

        // pen.hide();
        pen.speed(50);
        pen.width(0.1);
        // move to lower left location of equilateral triangle
        // with side lengths 400 and set direction = 0 degrees
        scale = 400;
        // int runs = 2;

        // pen.setPosition(-scale / 2, (-Math.sqrt(3) * scale / 2) / 2);
        pen.setDirection(0);
        for (int i = 1; i < 2; i++) {
            depthOne(scale / i);
            depthOne(scale / (i + 1));
            move1To2(pen, scale);

            depthOne(scale / (i + 1));
            move2To3(pen, scale);

            depthOne(scale / (i + 1));
            move3To1(pen, scale);

            scale /= 2;

        }
        // Lets rock: nested loops to create Sierpinski gasket

    }

    public static void depthOne(double scale) {
        for (int i = 0; i < 3; i++) {
            drawTriangle(pen, scale);
            if (i == 0) {
                move1To2(pen, scale);
            } else if (i == 1) {
                move2To3(pen, scale);
            } else {
                move3To1(pen, scale);
            }
        }
    }

    public static void move1To2(Turtle pen, double scale) {
        pen.forward(scale);
    }

    public static void move2To3(Turtle pen, double scale) {
        pen.left(120);
        pen.forward(scale);
        pen.right(120);
    }

    public static void move3To1(Turtle pen, double scale) {
        pen.left(60);
        pen.backward(scale);
        pen.right(60);
    }

    public static void drawTriangle(Turtle pen, double a) {
        pen.down();
        for (int i = 0; i < 3; i++) {
            pen.forward(a);
            pen.left(120);
        }
        pen.up();
        Turtle.zoomFit(); // zoom to fit end drawing
    }

}