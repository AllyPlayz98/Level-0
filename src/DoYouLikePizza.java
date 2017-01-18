import javax.swing.JOptionPane;

public class DoYouLikePizza {
public static void main(String[] args) {
	String pizza = JOptionPane.showInputDialog("Do you like pizza?");
	if (pizza.equals("yes")){
		//GREEN!
		String yes = JOptionPane.showInputDialog("Do you like pepperoni pizza?");
		if (yes.equals("yes")){
			JOptionPane.showMessageDialog(null, "Enjoy your pepperoni pizza!");
		}
		if (yes.equals("no")){
			JOptionPane.showMessageDialog(null, "Enjoy your other kind of pizza!");
		}
		
		
	}
	else if (pizza.equals("no")){
		//PURPLE!
		String no = JOptionPane.showInputDialog("Do you like salad?");
		if (no.equals("yes")){
			JOptionPane.showMessageDialog(null, "Enjoy your pepperoni salad!");
		}
		if (no.equals("no")){
			JOptionPane.showMessageDialog(null, "Then what do you like to eat?");
			
		}
		
	}
}
}
