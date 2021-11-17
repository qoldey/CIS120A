import java.awt.Color; // rgb color
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Turtle pen = cturtle.settings(0.1, true, 50);

        int scale = 50;
        pen.down();

        // function : y=mx+b

        // solve a function
        // get the answers as an array of arrays or list
        // these answers are x y pairs, coordinates
        // steps = 5;
        // set pos xy[0] -> pen.down -> face pos xy[1] -> pen.forward[steps] ->
        //
        // for xy.length - 1
        // face xy[i+1]
        // pen.forward[steps]
        // if pen.getX == x[i+1] && pen.getY == y[i+1]
        // i++

        // Enter a function to be solved:
        // f(x)=-(1/2)x
        // Find all solutions for
        // y = -(1/2)x
        // collect occasions where x and y are a solution within the size of the graph
        // y =
        // run method to graph

        // 0 1
        // 1 3
        // 2 5
        int start;
        int end;
        n

        start = 0;
        end = 10;

        int range = Math.abs(start + end);
        double spacing;

        spacing = 0.5;

        for (double i = 0; i < range; i += spacing) {

        }

        for (int i = 0; i < range; i++) {
            pen.forward(scale);
        }
        Turtle.zoomFit();
    }

}

class cturtle {
    public static Random rng = new Random();

    public static Turtle settings(double width, boolean hide, double speed, Color... c) {

        Turtle pen = new Turtle();

        Color bColour, pColour;

        pen.up();

        bColour = new Color(17, 50, 77);
        pColour = new Color(220, 184, 255);

        if (hide == true) {
            pen.hide();
        }

        if (c.length == 1) {
            pColour = c[0];
        } else if (c.length == 2) {
            bColour = c[1];
        }

        pen.penColor(pColour); // pencolor
        Turtle.bgcolor(bColour); // background colour

        pen.width(width);

        pen.speed(speed);
        return pen;
    }

    public static void drawTriangle(Turtle pen, int scale) {
        pen.down();
        for (int i = 0; i < 3; i++) {
            pen.forward(scale);
            pen.left(120);
        }
        pen.up();
    }

    public static void drawCircle(Turtle pen, double radius, Color... pColour) {
        // Dont need to add radius, just makes it easier to track middle position.
        pen.setPosition(pen.getX(), pen.getY() + radius); // top of circle

        // The side length of a 360-gon with circumscribed radius r is:
        double dist = 2 * radius * Math.sin(Math.PI / 360);
        if (pColour.length == 1) {
            pen.penColor(pColour[1]); // pencolor
        }
        pen.setDirection(0); // start facing east
        pen.down(); // start
        // a regular polygon with 360 sides. Each interior angle is 179 degrees
        for (int i = 0; i < 360; i++) {
            pen.forward(dist); // drawing a short line
            pen.right(1); // turning 1 degree
            Turtle.zoomFit(); // zoom to fit end drawing
        }
        pen.up(); // end

        pen.setPosition(pen.getY(), pen.getY() - radius); // starting pos
    }

    public static Color rngcolor(Turtle pen, Color pColour) {
        // random number 0-255 for rgb values
        int r = (rng.nextInt(256));
        int g = (rng.nextInt(256));
        int b = (rng.nextInt(256));
        // assign rgb values to penColor
        pColour = new Color(r, g, b);
        pen.penColor(pColour);
        return pColour;
    }

    public static void rnglocation(Turtle pen, int scale) {
        // random x y position [0-999] to start next star @
        int x = rng.nextInt(scale * 4);
        int y = rng.nextInt(scale * 4);
        pen.setPosition(x, y);
    }
}