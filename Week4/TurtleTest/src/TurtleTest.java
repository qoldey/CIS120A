//import java.awt.Color;

public class TurtleTest {

	public static void main(String[] args) {
		Turtle line = new Turtle();
		line.hide();
		// Turtle.bgcolor(new Color(110, 144, 198));
		// line.penColor(new Color(172, 121, 198));

		// for (int i = 0; i < 4; i++) {
		line.forward(100);
		// line.right(90);
		// }
		// line.forward(500);
		// line.setDirection(270);
		// line.forward(50);

		Turtle.zoomFit();
	}
}
