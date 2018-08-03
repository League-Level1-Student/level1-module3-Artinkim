import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements MouseListener {
int S;
int m;
JFrame f = new JFrame();
JPanel p = new JPanel();
JButton b1 = new JButton();
JButton b2 = new JButton();
JButton b3 = new JButton();
void m()
{
b1.setText(" ");
b2.setText(" ");
b3.setText(" ");
Random rand = new Random();
int r = rand.nextInt(3);
f.setVisible(true);	
f.add(p);
f.setSize(300,600);
p.add(b1);
p.add(b2);
p.add(b3);
b1.setPreferredSize(new Dimension(80,30));
b2.setPreferredSize(new Dimension(80,30));
b3.setPreferredSize(new Dimension(80,30));
b1.addMouseListener(this);
b2.addMouseListener(this);
b3.addMouseListener(this);
if(r == 0)
{
b1.setText("Mole");
}
if(r == 1)
{
b2.setText("Mole");
}
if(r == 2)
{
b3.setText("Mole");
}

}
@Override
public void mouseClicked(MouseEvent arg0) {
	// TODO Auto-generated method stub
	JButton b = (JButton) arg0.getSource();
	if(b.getText().equals("Mole"))
	{
	S++; 
	if(S==10)
	{
	endGame(Date(20,20,20),S);
	}
	}
	else
	{
		m++;
	speak("you missed"+m);	
	}
	
	m();
}
@Override
public void mouseEntered(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mousePressed(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
    }
}
private void endGame(Date timeAtStart, int molesWhacked) {
    Date timeAtEnd = new Date(); 
    JOptionPane.showMessageDialog(null, "Your whack rate is "
         + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
         + " moles per second.");
}
}
