package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton multi = new JButton();
	JButton div = new JButton();
	
	
	void add() {
		add.setText("Add");
		panel.add(add);
		add.addActionListener(this);
	}
	void sub() {
		sub.setText("Sub");
		panel.add(sub);
		sub.addActionListener(this);
	}
	void multi() {
		multi.setText("Multi");
		panel.add(multi);
		multi.addActionListener(this);
	}
	void div() {
		div.setText("Div");
		panel.add(div);
		div.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
