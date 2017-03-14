
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {

		// 3. ask the user what color they would like the tortoise to draw
		for (int i = 0; i < 5; i++) {

			String color = JOptionPane.showInputDialog("Pick a color.");
			// 4. use an if/else statement to set the pen color that the user requested
			if (color.equals("Cyan")) {
				Tortoise.setPenColor(Color.CYAN);
			}
			// 5. if the user doesn’t enter anything, choose a random color
			else if (color.equals("Blue")) {
				Tortoise.setPenColor(Color.blue);
			} else if (color.equals("Green")) {

				Tortoise.setPenColor(Color.green);
			}

			else {
				Tortoise.setPenColor(PenColors.getRandomColor());
			}
			// 6. put a loop around your code so that you keep asking the user for more colors & drawing them

			// 2. set the pen width to 10
			Tortoise.setPenWidth(10);
			Tortoise.setSpeed(10);
			// 1. make the tortoise draw a shape (this will take more than one line of code)
			for (int pentagon = 0; pentagon < 5; pentagon++) {
				Tortoise.penDown();
				Tortoise.move(100);
				Tortoise.turn(360 / 5);
			}
		}
	}

}
