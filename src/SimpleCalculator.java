import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
		for (int rptcalc = 0; rptcalc < 10; rptcalc++) {

			// 1. Get 2 numbers from the user and convert them to integer.
			String num1 = JOptionPane.showInputDialog("Choose a number and type it in the box below.");
			String num2 = JOptionPane.showInputDialog("Choose another number and type it in the box below.");
			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);
			// 2. Customize pop-up to support add/subtract/multiply/divide
			// operations.
			int operation = JOptionPane.showOptionDialog(null, "Which operation would you like to preform?",
					"Operation", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Addition", "Subtraction", "Multiplication", "Division" }, null);

			// 5. Call the methods created in steps 3 and 4 to perform the
			// appropriate operation.
			if (operation == 0) {
				addition(n1, n2);
			} else if (operation == 1) {
				subtraction(n1, n2);
			} else if (operation == 2) {
				multiplication(n1, n2);
			} else if (operation == 3) {
				division(n1, n2);
			}
		}

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator
		// operations
	}

	// 3. Create method for addition operation.
	// Method should create pop-up that shows equation and solution, eg. 45 + 25
	// = 70.
	// HINT: use 'static void add(int num1, num2) { ... }
	static void addition(int n1, int n2) {
		int sum = n1 + n2;
		JOptionPane.showMessageDialog(null, "Your sum is" + " " + sum);
	}

	// 4. Create similar methods for subtraction, multiplication and division.
	static void subtraction(int n1, int n2) {
		int difference = n1 - n2;
		JOptionPane.showMessageDialog(null, "Your difference is" + " " + difference);
	}

	static void multiplication(int n1, int n2) {
		int product = n1 * n2;
		JOptionPane.showMessageDialog(null, "Your product is" + " " + product);
	}

	static void division(int n1, int n2) {
		int quotient = n1 / n2;
		JOptionPane.showMessageDialog(null, "Your quotient is" + " " + quotient);
	}
}
