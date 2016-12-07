import javax.swing.JOptionPane;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class ObedientTortoise {
	public static void main(String[] args) {

		Tortoise.show();
		Tortoise.setSpeed(10);
		Tortoise.setPenColor(PenColors.getRandomColor());
		for (int shapeo = 0; shapeo < 4; shapeo++) {
			int shape = JOptionPane.showOptionDialog(null, "Square, Triangle, Circle, or Shape?", "Shape Drawing", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Shape", "Circle", "Triangle", "Square" }, null);

			if (shape == 3) {
				drawSquare();
			}
			if (shape == 2) {
				drawTriangle();
			}
			if (shape == 1) {
				drawCircle();
			}
			if (shape == 0) {
				drawShape(11);
			}
		}

	}

	static void drawSquare() {
		for (int torto = 0; torto < 4; torto++) {
			Tortoise.move(100);
			Tortoise.turn(360 / 4);
		}
	}

	static void drawTriangle() {
		for (int turto = 0; turto < 3; turto++) {
			Tortoise.move(100);
			Tortoise.turn(360 / 3);
		}
	}

	static void drawCircle() {
		for (int tarto = 0; tarto < 360; tarto++) {
			Tortoise.move(1);
			Tortoise.turn(360 / 360);
		}
	}

	static void drawShape(int s) {
		for (int tzrto = 0; tzrto < s; tzrto++) {
			Tortoise.move(50);
			Tortoise.turn(360 / s);
		}
	}
}
