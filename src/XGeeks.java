
// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String jusuper = "that she can move things with her mind.";
		String alexsuper = "that he can make things explode at will.";
		String elisuper = "that he can become invisible at will";
		String olivesuper = "that she can talk to animals at will.";
		String camsuper = "that he can make phones bigger or smaller at will.";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		for (int non = 0; non < 100; non++) {
			String name = JOptionPane.showInputDialog("Please enter your first name.");

			// 3. Show the superpower in a pop-up, depending on the name entered.
			if (name.equals("Olivia")){
			JOptionPane.showMessageDialog(null, "Olivia's superpower is " + olivesuper);
			}
			if (name.equals("Julia")){
			JOptionPane.showMessageDialog(null, "Julia's superpower is " + jusuper);
			}
			if (name.equals("Alex")){
			JOptionPane.showMessageDialog(null, "Alex's superpower is " + alexsuper);
			}
			if (name.equals("Eli")){
			JOptionPane.showMessageDialog(null, "Eli's superpower is " + elisuper);
			}
			if (name.equals("Cameron")){
			JOptionPane.showMessageDialog(null, "Camerons superpower is " + camsuper);
			}
		}
	}
}
