// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		for (int o = 0; o<5; o++){
			//1. ask the user if they like bananas
			String bq = JOptionPane.showInputDialog("Do you like bananas?");
			//2. if they say no, 
				//tell them they are crazy 
			if (bq.equals("No")){
				JOptionPane.showMessageDialog(null, "You are CRAZY!!");
			}
				//and end quiz
			//3. if they say yes
			//	ask them what is their favorite hobby
			else if (bq.equals("Yes")){
				String bqb = JOptionPane.showInputDialog("What is your favorite hobby?");
			
			//	show a pop up that says "<your hobby> is much better with bananas!"
JOptionPane.showMessageDialog(null, bqb + " is much better with bananas!");
			}
			//4. OPTIONAL: if they say something other than “yes” or “no”
			//	show a pop up that says “You are bananas!”
			else {
				JOptionPane.showMessageDialog(null, "You are BANANAS!!");
			}
		
		}
	
	}

}
