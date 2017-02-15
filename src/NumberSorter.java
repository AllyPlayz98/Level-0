import javax.swing.JOptionPane;

public class NumberSorter {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Pick a number and type it in the box below.");
		String b = JOptionPane.showInputDialog("Pick another number and type it in the box below.");
		String c = JOptionPane.showInputDialog("Pick one more number and type it in the box below.");
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		int c1 = Integer.parseInt(c);

		if (a1 < b1 && a1 < c1) {
			if (b1 < c1) {
				System.out.println(a1 + " " + b1 + " " + c1);
			} else {
				System.out.println(a1 + " " + c1 + " " + b1);
			}
		}
		if (b1 < a1 && b1 < c1) {
			if (a1 < c1) {
				System.out.println(b1 + " " + a1 + " " + c1);
			} else {
				System.out.println(b1 + " " + c1 + " " + a1);
			}
		}
		if (c1 < b1 && c1 < a1) {
			if (a1 < b1) {
				System.out.println(c1 + " " + a1 + " " + b1);
			} else {
				System.out.println(c1 + " " + b1 + " " + a1);
			}
		}
	}

}
