package _04_chuckle_clicker;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	void makeButtons() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		button1.addActionListener(this);
		button2.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		button1.setText("Joke");
		button2.setText("Punchline");
		Dimension size = new Dimension(400,200);
		button1.setPreferredSize(size);
		button2.setPreferredSize(size);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			JOptionPane.showMessageDialog(null, "Hi!");
			JOptionPane.showMessageDialog(null, "As I get older, I remember all the people I lost along the way.");
		}
		if(e.getSource()==button2) {
			JOptionPane.showMessageDialog(null, "Maybe a career as a tour guide was not the right choice.");
		}
	}
}
