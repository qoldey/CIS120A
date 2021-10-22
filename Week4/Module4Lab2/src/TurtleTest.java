import java.awt.Color; // Allows us to get rgb color schemes within our class.
//https://www.stevenlrichardson.com/CIS120A/WebContent/TurtleJavadoc/

//You should now have a project named TurtleTest in your workspace.  Open the src/TurtleTest.java file and run it.
public class TurtleTest extends Turtle {
    // inherit the Turtle class from Turtle.jar
    // allowing us to use one turtle throughout our class.

    public static void main(String[] args) {
        new TurtleTest(); // New turtle object (inherited from Turtle.jar)
        // started in TurtleTest method.
    }

    public TurtleTest() { // object where we will be drawing.
        Color background = new Color(53, 31, 91); // rgb colors assigned to background
        Color lineColor = new Color(172, 121, 198); // rgb colors assigned to lineColor
        Turtle.bgcolor(background); // Sets background color to background.
        penColor(lineColor); // sets line color to line lineColor.

        width(1); // width of line
        hide(); // hide turtle graphic
        speed(1); // lower number draws faster, 100 is default.%

        int size = 50; // starting size
        for (int u = 0; u < 16; u++) {
            for (int i = 0; i < 8; i++) {
                square(size);
                forward(size / 4);
                right(45);
            }

            triangle(size / 4);
            // right(size * 5);
            size += 50;
            Turtle.zoomFit(); // zoom to fit end drawing

        }
    }

    public void square(double size) { // draws a square @ size of input
        for (int i = 0; i < 4; i++) {
            forward(size);
            right(90);
        }
    }

    public void triangle(double size) { // draw a triangle @ size of input
        for (int i = 0; i < 3; i++) {
            forward(size);
            right(120);
        }

    }

}
