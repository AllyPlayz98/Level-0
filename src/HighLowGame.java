 import java.util.Random;

import javax.swing.JOptionPane;


// Copyright Wintriss Technical Schools 2013
public class HighLowGame {


	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100)+1;
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. do the following 10 times
		for (int f = 0; f<10; f++){
			
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
String g = JOptionPane.showInputDialog("Guess a number.");

			// 4. convert the users’ answer to an int (Integer.parseInt(string))
int numAns = (Integer.parseInt(g));
			// 5. if the guess is correct
if (numAns == random){
	JOptionPane.showMessageDialog(null, "You Win!");
	System.exit(0);
	break;
}
				// 6. win
			// 7. if the guess is high
if (numAns > random){
	JOptionPane.showMessageDialog(null, "Your guess is to high. Try again!");
}
				// 8. tell them it's too high
			// 9. if the guess is low
if (numAns < random){
	JOptionPane.showMessageDialog(null, "Your guess is to low. Try again!");
}
				// 10. tell them it's too low

		}
		// 12. tell them they lose
		JOptionPane.showMessageDialog(null, "You lose!");
	}

}




