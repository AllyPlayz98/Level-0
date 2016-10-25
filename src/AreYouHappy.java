import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String areyouhappy =  JOptionPane.showInputDialog("Are you happy?");
	if (areyouhappy.equals("yes")){
		JOptionPane.showMessageDialog(null, "Keep doing whatever your doing.");
	}
	if (areyouhappy.equals("no")){
		String doyouwanttobehappy = JOptionPane.showInputDialog("Do you want to be happy?");
	
	if (doyouwanttobehappy.equals("yes")){
		JOptionPane.showMessageDialog(null, "Change something.");
	}
	if (doyouwanttobehappy.equals("no")){
		JOptionPane.showMessageDialog(null, "Keep doing whatever your doing.");
	}
	}
}
}
