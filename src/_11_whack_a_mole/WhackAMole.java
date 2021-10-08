package _11_whack_a_mole;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton mole;
	int score = 0;
	Date date = new Date();
	int miss = 0;
	
	void Mole() {
		frame = new JFrame();
		panel = new JPanel();
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(500, 200);
		int num = new Random().nextInt(10);
		drawButtons(num);
	}
	
	void drawButtons(int rand) {
		for (int i = 0; i < 10; i++) {
			if (rand==i) {
				mole = new JButton();
				panel.add(mole);
				mole.setText("mole");
				mole.addActionListener(this);
			} else {
				JButton wrong = new JButton();
				panel.add(wrong);
				wrong.addActionListener(this);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mole) {
			speak("Hit");
			score++;
		}else {
			speak("missed");
			miss++;
		}
		if(miss==5) {
			JOptionPane.showMessageDialog(null, "No more trys");
			System.exit(0);
		}
		if(score==10) {
			endGame(date, 10);
		}
		frame.dispose();
		Mole();
	}
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}
	
	static void speak(String words) {
        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                    + words + "');\"";
            try {
                Runtime.getRuntime().exec( cmd ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        } else {
            try {
                Runtime.getRuntime().exec( "say " + words ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        }
    }
	private void playSound(String fileName) { 
	    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	    sound.play();
	}
}
