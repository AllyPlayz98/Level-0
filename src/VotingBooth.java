import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("How old are you?");
	int ageInt = Integer.parseInt(age);
	if (ageInt >=18){
		JOptionPane.showInputDialog("Who will you vote for?");
	}
	else{
		JOptionPane.showMessageDialog(null, "You are to young to vote and your vote will not count!");
	}
}
}
