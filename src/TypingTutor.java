import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener {
	public static void main(String[] args) {
		TypingTutor tt = new TypingTutor();
		tt.m();
	}

	JFrame f = new JFrame();
	JLabel l = new JLabel();
	char currentLetter;
	

	void m() {
		l.setText(currentLetter + "");
		f.setVisible(true);
		l.setFont(l.getFont().deriveFont(28.0f));
		l.setHorizontalAlignment(JLabel.CENTER);
		currentLetter = generateRandomLetter();
		l.setText(currentLetter + "");
		f.add(l);
		f.addKeyListener(this);
		f.pack();
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	
		if (e.getKeyChar() == currentLetter) {
			l.setOpaque(true);
			l.setBackground(new Color(0, 255, 0));
			System.out.println("Correct");
		} else {
			l.setBackground(new Color(255, 0, 0));
		}	currentLetter = generateRandomLetter();
		l.setText(currentLetter + "");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
