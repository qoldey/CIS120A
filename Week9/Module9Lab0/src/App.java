import java.awt.Color; // rgb color

//TODO: You may also want to have your graph-drawing method scale the y axis so that the graph is neither too compressed or too stretched in the y-direction.

// a program which will produce the graph of a function
public class App {

    public static void main(String[] args) {
        double spacing;
        int start = -10; // lower val
        int end = 10; // upper val

        // You may need to experiment with the spacing to see what gives you a nice,
        // smooth-looking graph.
        // f1 = 1, f3 = 0.25, f4 = 5
        spacing = 1.005; // f2 =1.005

        Turtle pen = settings(0.1, true, 50);
        setup(pen, start, end);
        drawGraph(function(start, end, spacing), pen);

    }

    // create an array of x-values which are uniformly separated by some small value
    // and with a range of values that you decide upon.
    public static double[][] function(int start, int end, double spacing) {

        double x, y;
        int range = Math.abs(start - end);

        double[][] positions = new double[range][2];
        int i = 0;

        for (double pos = start; pos < end; pos += spacing) {
            x = pos;
            y = f2(x); // the function to be run for y, there is a few methods in this class.
            System.out.printf("%.2f %.2f\n", x, y);

            if (i < range) {

                positions[i][0] = x;
                positions[i][1] = y;
                i++;
            }
        }
        return positions;

    }

    public static void setup(Turtle pen, int start, int end) {
        int range = Math.abs(start - end);
        int dist = 5;

        pen.up();
        pen.setPosition(0, range);
        pen.setDirection(270);
        pen.down();
        pen.forward(range / 2);
        Turtle.zoomFit();
        pen.up();
        pen.setDirection(180);
        pen.forward(dist);
        Turtle.zoomFit();
        drawX(pen, range / 10);

        pen.setDirection(180);
        pen.backward(dist);
        pen.setDirection(270);
        pen.down();
        pen.forward(range / 2);
        Turtle.zoomFit();
        pen.up();
        pen.setDirection(0);
        pen.down();
        pen.forward(range / 2);
        Turtle.zoomFit();
        pen.up();
        pen.setDirection(270);
        pen.forward(dist);
        Turtle.zoomFit();
        drawY(pen, range / 10);

        pen.setDirection(270);
        pen.backward(dist);
        pen.setDirection(0);
        pen.down();
        pen.forward(range / 2);
        pen.up();
    }

    // Pass these two arrays to a method that draws the graph
    public static void drawGraph(double[][] zeros, Turtle pen) {

        for (int i = 0; i < zeros.length; i++) {
            Turtle.zoomFit();

            // Be careful of connecting points across discontinuities!
            // if (x == 0) { //idk why this doesn't work and the next one does
            if (zeros[i][1] < -999999999) { // lol it worked
                pen.up();
            } else {
                pen.setPosition(zeros[i][0], zeros[i][1]);
                pen.down();

            }

        }
        Turtle.zoomFit();
    }

    public static void drawX(Turtle pen, int scale) {

        double x = pen.getX();
        double y = pen.getY();
        double divideBy = 2.75;

        pen.up();
        pen.setDirection(180);
        pen.forward(scale / divideBy);
        pen.setDirection(45);
        pen.down();
        pen.forward(scale);
        pen.up();
        pen.setPosition(x, y);
        pen.setDirection(0);
        pen.forward(scale / divideBy);
        pen.setDirection(135);
        pen.down();
        pen.forward(scale);
        pen.up();
        pen.setPosition(x, y);

    }

    public static void drawY(Turtle pen, int scale) {
        double x = pen.getX();
        double y = pen.getY();

        pen.up();
        pen.setDirection(180);
        pen.forward(scale / 2);
        pen.setDirection(45);
        pen.down();
        pen.forward(scale);
        pen.up();
        pen.backward(scale / 2);
        pen.setDirection(135);
        pen.down();
        pen.forward(scale / 2);
        pen.up();
        pen.setPosition(x, y);

    }

    // You should test your program on a variety of functions including, but not
    // limited to:
    public static double f1(double x) {

        double y = (-x / 2);
        return y;

    }

    public static double f2(double x) {

        double pow = 2;
        double y = Math.pow(x, pow);
        return y;
    }

    public static double f3(double x) {

        double y = Math.sin(x);
        return y;
    }

    public static double f4(double x) { // this was printing properly and now it's not

        double y = 1 / x;
        return y;
    }

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
}