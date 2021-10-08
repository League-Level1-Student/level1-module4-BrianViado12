package _09_latest_tweet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LatestTweet {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JTextField field = new JTextField();
	
	void Tweet() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(field);
		panel.add(button);
		
	}
}
