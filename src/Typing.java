import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Typing implements KeyListener {
	JLabel label=new JLabel();
	char currentLetter;
	JFrame frame= new JFrame();
void Gui(){
	currentLetter = generateRandomLetter();
	frame.setVisible(true);
	
	frame.setSize(1000, 1000);
	
	
	frame.setTitle("Type or Die");
	
	
	
	
	frame.add(label);
	label.setText(Character.toString(currentLetter));
	
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
frame.addKeyListener(this);

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
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	currentLetter = generateRandomLetter();
	label.setText(Character.toString(currentLetter));
	
}
}
