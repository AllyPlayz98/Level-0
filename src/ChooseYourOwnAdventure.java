import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
	public static void main(String[] args) {
		int Q1 = JOptionPane.showOptionDialog(null,
				"Newt Scmander needs to find his Demiguise, Dougal. \nThey are invisible and can forsee the near future, so he will be diffuclt to find. \nWhere should Newt look first?",
				"Demiguise", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "The video game store", "The jewelry store", "The halloween store", "The pet store" }, null);
		if (Q1 == 0) {
			int Q2 = JOptionPane.showOptionDialog(null, "Where should Newt look first?", "Video game store", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "The Harry Potter section", "The Minecraft section" }, null);
			if (Q2 == 0) {
				JOptionPane.showMessageDialog(null, "Newt saw a video game about his adventures, and saw Dougal on the cover, but it wasen't Dougal.");
			} else if (Q2 == 1) {
				JOptionPane.showMessageDialog(null, "On a video game cover about Minceraft there was a ghost that looked like a Demiguise, \nbut was not a Demiguise at all.");
			}
		} else if (Q1 == 1) {

		} else if (Q1 == 2) {

		} else if (Q1 == 3) {

		}
		/*******************************************************************************
		 * Copyright (c) The League of Amazing Programmers 2013-2017 Level 0 Choose Your Own Adventure Duration=1.00
		 * Platform=Eclipse Type=Instruction Objectives=multiple nested if
		 * 
		 * 
		 ******************************************************************************/

		/**
		 * Give the user options to decide the path of a story.
		 */
	}
}
