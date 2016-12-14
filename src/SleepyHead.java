
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/*
		 * Ask the user for these values using
		 * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
		 * JOptionPane.YES_NO_OPTION);
		 */
		int isitWeekday = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Weekday", JOptionPane.YES_NO_OPTION);
		int isitVacation = JOptionPane.showConfirmDialog(null, "Are you on a vaction?", "Vacation",
				JOptionPane.YES_NO_OPTION);
		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
		 * print “get up lazybones!” If it is a weekday, and we are on vacation,
		 * print “sleep in”.
		 */
		if (isitWeekday == JOptionPane.YES_OPTION){
			if (isitVacation == JOptionPane.YES_OPTION){
				System.out.println("You can sleep in today!");
			}
			else
		{
			System.out.println("Get up lazybones!");
		}
		}
			else
			{
				System.out.println("You can sleep in today!");
			}
	}
}
