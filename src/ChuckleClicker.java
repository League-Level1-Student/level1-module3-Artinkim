import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	public static void main(String[] args) {
		ChuckleClicker cc = new ChuckleClicker();
		cc.makeButtons();
	}

	JButton b = new JButton("Joke");
	JButton bb = new JButton("Punchline");

	void makeButtons() {
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		p.add(b);
		p.add(bb);
		f.add(p);
		f.pack();
		f.setVisible(true);
		b.addActionListener(this);
		bb.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Hi");
		if (b == (JButton) e.getSource()) {
			JOptionPane.showMessageDialog(null, "Why the chicken cross the road");
		}
		if (bb == (JButton) e.getSource()) {

			JOptionPane.showMessageDialog(null, "To get to the other side");
		}

	}
}
