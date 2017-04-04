
// Copyright Wintriss Technical Schools 2013
import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.JOptionPane;

public class SleepyHead2 {

	public static void main(String[] args) {
		/*
		 * Ask the user for these values using*/
		for (int wv = 0; wv<3; wv++){
		 int answer = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head 2",
		  JOptionPane.YES_NO_OPTION);
		 if (answer == JOptionPane.YES_OPTION){
			 int answer2 = JOptionPane.showConfirmDialog(null, "Are you on a vacation?", "Sleepy Head 2",
					  JOptionPane.YES_NO_OPTION);
			 if (answer2 == JOptionPane.YES_OPTION){
				 JOptionPane.showMessageDialog(null, "You can sleep in!");
			 }
			 else{
				 JOptionPane.showMessageDialog(null, "Get up lazybones!");
			 }
		 }
		 else{
			 JOptionPane.showMessageDialog(null, "You can sleep in!");
		 }
		
		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
		 * print “get up lazybones!” If it is a weekday, and we are on vacation,
		 * print “sleep in”.
		 */
		
		
	}
}
}
