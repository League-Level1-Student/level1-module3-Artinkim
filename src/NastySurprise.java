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

public class NastySurprise implements ActionListener {
	public static void main(String[] args) {
		NastySurprise ns = new NastySurprise();
		ns.m();
	}

	JFrame j = new JFrame();
	JPanel p = new JPanel();
	JButton b = new JButton("Trick");
	JButton bb = new JButton("Treat");

	void m() {
		j.setVisible(true);
		j.add(p);
		p.add(b);
		p.add(bb);
		j.pack();
		b.addActionListener(this);
		bb.addActionListener(this);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton bu = (JButton) e.getSource();
		if (bu == bb) {
			showPictureFromTheInternet("http://en.bcdn.biz/Images/2016/11/15/776342f0-86f5-4522-84c9-a02d6b11c766.jpg");
		}
		if (bu == b) {
			showPictureFromTheInternet("https://images-na.ssl-images-amazon.com/images/I/51Tr-tGz%2BVL._US500_.jpg");
		}
	}

}
