import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements MouseListener {
	int add(int i, int ii) {
		return i + ii;
	}

	int subtract(int i, int ii) {
		return i - ii;
	}

	int multiply(int i, int ii) {
		return i * ii;
	}

	int divide(int i, int ii) {
		return i / ii;
	}

	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton add = new JButton("add");
	JButton sub = new JButton("subtract");
	JButton mul = new JButton("multiply");
	JButton div = new JButton("divide");
	JTextField tf = new JTextField();
	JTextField tf1 = new JTextField();
	int a;
	JLabel answer = new JLabel();

	Calculator() {
		f.add(p);
		f.setVisible(true);
		p.add(add);
		p.add(sub);
		p.add(mul);
		p.add(div);
		p.add(tf);
		p.add(tf1);
		p.add(answer);
		add.addMouseListener(this);
		sub.addMouseListener(this);
		mul.addMouseListener(this);
		div.addMouseListener(this);
		tf.setPreferredSize(new Dimension(100, 30));
		tf1.setPreferredSize(new Dimension(100, 30));
		f.pack();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		int f = Integer.parseInt(tf.getText());
		int ff = Integer.parseInt(tf1.getText());
		if (b.equals(add)) {
			a = f + ff;
		}
		if (b.equals(sub)) {
			a = f - ff;
		}
		if (b.equals(mul)) {
			a = f * ff;
		}
		if (b.equals(div)) {
			a = f / ff;
		}
		answer.setText(a + "");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
