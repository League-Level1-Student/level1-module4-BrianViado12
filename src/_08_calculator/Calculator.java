package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton multi = new JButton();
	JButton div = new JButton();
	JTextField field1 = new JTextField(15);
	JTextField field2 = new JTextField(15);
	JLabel label = new JLabel();
	
	void makeCalculator(){
		frame.setVisible(true);
		frame.add(panel);
		panel.add(label);
		panel.add(field1);
		panel.add(field2);
		makeButton(add, "Add");
		makeButton(sub, "Sub");
		makeButton(multi,"Multi");
		makeButton(div, "Div");
		frame.pack();
	}
	void makeButton(JButton addButton, String name) {
		addButton.setText(name);
		panel.add(addButton);
		addButton.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String field01= field1.getText();
		String field02= field2.getText();
		int num1 = Integer.parseInt(field01);
		int num2 = Integer.parseInt(field02);
		int result = 0;
		if(e.getSource()==add) {
			 result=num1+num2;
		} else if(e.getSource()==sub) {
			result=num1 - num2;
		} else if(e.getSource()==multi) {
			result=num1*num2;
		} else if(e.getSource()==div) {
			result=num1/num2;
		}
		label.setText(""+ result);
		frame.pack();
	}
}
