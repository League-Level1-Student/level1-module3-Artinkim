import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements MouseListener {
	JFrame f = new JFrame("Slot Machine");
	JPanel p = new JPanel();
	JButton b = new JButton("Spin");
	String i = "image.jpg";
	String ii = "down.jpg";
	String iii = "image2.jpg";
	JLabel L = new JLabel();
	JLabel LL = new JLabel();
	JLabel LLL = new JLabel();

	SlotMachine() {
		f.setVisible(true);
		f.add(p);
		p.add(b);
		b.addMouseListener(this);
	}

	void m() {
	p.removeAll();
	p.add(b);
		Random rand = new Random();
		for (int r = 0; r < 3; r++) {
			int num = rand.nextInt(3);
			if (num == 0) {
				try {
					L = createLabelImage(i);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (num == 1) {
				try {
					L = createLabelImage(ii);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (num == 2) {
				try {
					L = createLabelImage(iii);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			p.add(L);
			f.pack();
		}
		
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		m();
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
