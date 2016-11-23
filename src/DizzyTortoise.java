import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class DizzyTortoise {

	public static void main(String[] args) {

		// 2. Ask the user how dizzy you want the tortoise from 1-10, then spin that number of times.
		String question = JOptionPane.showInputDialog("How dizzy should the tortise be?");
		int answer = Integer.parseInt(question);
		// 1. Use the dance method to make the Tortoise spin.
		dance(answer);

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}
