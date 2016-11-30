import java.net.URI;

import javax.swing.JOptionPane;

public class SoundTrackofLife {

	public static void main(String[] args) {
		for(int MD = 0; MD<3; MD++){
		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "What do you want to know about Mary Draper?", "Mary Draper", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "What she is famous for.", "What her parents names were.", "What her main job was as a child." }, null);

		// 2. Their answer is stored in the userMood variable. Print it out.
System.out.println(userMood);
		// 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.
if (userMood == 0){
	JOptionPane.showMessageDialog(null, "She is famous for melting her family heirlooms that were metal to cast bullets for the American soldiers during the Revolutionary War.");
}
if (userMood == 1){
	JOptionPane.showMessageDialog(null, "Her parents names were Nathaniel Aldis and Mary Chickering");
}
if (userMood == 2){
	JOptionPane.showMessageDialog(null, "Her main job as a child was to do the family farm work.");
}
		}
		// 4. Play different songs for other moods.

		// If you are seeing ads at the beginning of your videos, install Adblock.

	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/**
 * If you can’t think of any, here are some you can use... bit.ly/video-for-happy bit.ly/video-for-sad
 * bit.ly/video-for-angry
 **/
