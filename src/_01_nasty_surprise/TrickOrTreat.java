package _01_nasty_surprise;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TrickOrTreat implements ActionListener{
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	public void showButton () {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		
		button1.setText("Trick");
		button2.setText("Treat");
		Dimension big = new Dimension(400, 200);
		button1.setPreferredSize(big);
		button2.setPreferredSize(big);
		panel.add(button1);
		panel.add(button2);
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(button1==e.getSource()) {
			showPictureFromTheInternet("https://i.pinimg.com/originals/0f/4a/b3/0f4ab3edb196b09fd7e3072a9a097a98.jpg");
		}
		if(button2==e.getSource()) {
			showPictureFromTheInternet("https://www.dictionary.com/e/wp-content/uploads/2018/03/jeff-the-killer-2.jpg");
		}
	}
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
}
