import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
		String result = ("The winning numbers are... ");
		for (int nr = 0; nr < 5; nr++) {
			int rn = new Random().nextInt(50) + 1;
			if (nr == 4) {
				result += "and " + rn;
			} else {
				result += rn + ", ";
			}
		}
		JOptionPane.showMessageDialog(null, result+"!");
	}
}
