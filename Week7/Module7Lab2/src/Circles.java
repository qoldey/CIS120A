import java.awt.Color; // rgb color 
import java.util.Random; // random number gen

public class Circles {
    static double x, y;
    static int r, g, b, scale;

    static Color bColour, pColour;

    static Turtle pen = new Turtle(); // new pen
    static Random rng = new Random(); // rng

    public static void main(String[] args) {
        pen.up();
        bColour = new Color(17, 50, 77);
        Turtle.bgcolor(bColour); // background colour
        scale = 500; // scale
        pen.width(1); // width of line
        pen.hide(); // hide turtle graphic
        pen.speed(1); // lower number draws faster, 100 is default.
        // Stars(scale); // draw stars

        pColour = new Color(202, 184, 255);

        circles(10);
        // circle(pen, x, y, scale, pColour);
    }

    // A public static void method named circle that accepts five arguments:
    // the Turtle, the circle's x-position, the circle's y-position, the circle's
    // radius and the circle's color.
    public static void circle(Turtle pen, double x, double y, double radius, Color pColour) {
        // Dont need to add radius, just makes it easier to track middle position.
        pen.setPosition(x, y + radius); // top of circle - moving to a point on the perimeter of the circle,
        // The side length of a 360-gon with circumscribed radius r is:
        double dist = 2 * radius * Math.sin(Math.PI / 360);
        pen.penColor(pColour); // pencolor
        pen.setDirection(0); // start facing east
        pen.down(); // start
        // a regular polygon with 360 sides. Each interior angle is 179 degrees
        for (int i = 0; i < 360; i++) {
            pen.forward(dist); // drawing a short line
            pen.right(1); // turning 1 degree
            Turtle.zoomFit(); // zoom to fit end drawing
        }
        pen.up(); // end
    }

    // Test out your circle method by drawing circles of several different
    // positions, radii, and Colors.
    public static void circles(int runs) {
        for (int i = 0; i < runs; i++) {
            circle(pen, x, y, rng.nextInt(scale * 4), pColour);
            rnglocation(); // move pen to random location - changes x y
            rngcolor();
        }
    }

    public static void rnglocation() {
        // random x y position [0-999] to start next star @
        x = rng.nextInt(scale * 4);
        y = rng.nextInt(scale * 4);
        pen.setPosition(x, y);
    }

    public static void rngcolor() {
        // random number 0-255 for rgb values
        r = (rng.nextInt(256));
        g = (rng.nextInt(256));
        b = (rng.nextInt(256));
        // assign rgb values to penColor
        pColour = new Color(r, g, b);
        pen.penColor(pColour);
    }
}