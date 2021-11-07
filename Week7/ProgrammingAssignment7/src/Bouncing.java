import java.awt.Color; // rgb color 
import java.util.Random;

public class Bouncing {

    // interior = l*w

    // tp random number under l and w
    // go forward
    // stop when x || y == l || w || 0
    // start going -direction

    public static void main(String[] args) {
        boolean hide;
        int x, y; // starting x y location
        int l, w; // length and width
        double speed, width;
        double diameter, frames;

        Turtle pen = new Turtle();
        Random rng = new Random();

        l = 90;
        w = 160;

        hide = true;
        speed = 20;
        width = 1;

        x = rng.nextInt(w); // random starting x < w
        y = rng.nextInt(l); // random starting y < l

        diameter = 2; // dot diameter
        frames = 1; // dot frames per change

        Color[] theme = settings(pen, speed, hide, width);
        setup(pen, l, w); // background square
        bounce(pen, theme[0], theme[1], x, y, diameter, w, l, frames);
    }

    public static void bounce(Turtle pen, Color pColour, Color bColour, double x, double y, double diameter, int w,
            int l, double frames) {
        double xChange = frames;
        double yChange = frames;
        pen.penColor(bColour);
        while (true) {
            System.out.printf("%.2f %.2f\n", pen.getX(), pen.getY());

            x += xChange;
            y += yChange;

            pen.down();
            pen.dot(bColour, diameter); // draw dot backgroundcolor to cover
            pen.up();

            pen.setPosition(x, y);

            pen.down();
            pen.dot(pColour, diameter - 1); // draw dot pencolour
            pen.up();

            // speed + position
            if (x > w - diameter || x < 0 + diameter) {
                xChange = -xChange; // if reach wall x go negative change next loop
            }

            if (y > l - diameter || y < 0 + diameter) {
                yChange = -yChange; // if reach wall y go negative change next loop

            }

        }

    }

    public static void setup(Turtle pen, int l, int w) {

        square(pen, l, w); // draw wall @ l w

        for (int i = 0; i < 5; i++) { // fit square
            try {
                Turtle.zoomFit();
            } catch (NullPointerException e) {
                System.out.printf("Zoom Failed, trying up to %d more times\n", 5 - i);
            }
        }

        System.out.println("Loading...");
        fill(pen, w, w, l); // fill the square

    }

    public static Color[] settings(Turtle pen, double speed, boolean hide, double width, Color... c) {

        Color bColour, pColour;

        bColour = new Color(0, 0, 0);
        pColour = new Color(255, 255, 255);

        if (c.length > 0) {
            pColour = c[0];
        } else if (c.length > 1) {
            bColour = c[1];
        }

        Turtle.bgcolor(bColour); // background colour
        pen.penColor(pColour); // pencolor

        if (hide == true) {
            pen.hide();
        }

        pen.up();

        pen.width(width);
        pen.speed(speed);

        Color[] theme = new Color[2];
        theme[0] = bColour;
        theme[1] = pColour;
        return theme;

    }

    public static void fill(Turtle pen, int w, int t, int l) {
        if (w - 1 < t / 2) {
            pen.up();
            return;

        } else {
            pen.up();
            pen.left(90);
            pen.forward(1);
            pen.left(90);
            pen.down();
            pen.forward(l);

            pen.up();
            pen.right(90);
            pen.forward(1);
            pen.right(90);
            pen.down();

            pen.forward(l);
            fill(pen, w - 1, t, l);
        }
    }

    public static void square(Turtle pen, int l, int w) {
        pen.down();
        pen.forward(w);
        pen.left(90);
        pen.forward(l);
        pen.left(90);
        pen.forward(w);
        pen.left(90);
        pen.forward(l);
        pen.up();
    }

}
