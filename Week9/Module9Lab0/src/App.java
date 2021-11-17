import java.awt.Color; // rgb color

// a program which will produce the graph of a function
public class App {

    public static void main(String[] args) {

        // int scale = 50;
        double spacing;
        int start, end;

        start = -5; // lower val
        end = 5; // upper val
        spacing = 0.1;

        drawGraph(function(start, end, spacing), cturtle.settings(0.1, true, 50));

    }

    public static double[][] function(int start, int end, double spacing) {

        double x, y;
        int range = Math.abs(start - end); // I cant figure out how to implement this

        double[][] positions = new double[range][2];
        int i = 0;

        for (double pos = start; pos < end; pos += spacing) {
            x = pos;
            y = f1(x);
            System.out.printf("%.2f %.2f\n", x, y);

            if (i < range) {

                positions[i][0] = x;
                positions[i][1] = y;
                i++;
            }
        }
        return positions;

    }

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

    public static double f4(double x) {

        double y = 1 / x;
        return y;
    }
}

class cturtle {

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