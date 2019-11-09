package _05_typing_tutor;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Typing implements KeyListener {
	JFrame frame= new JFrame();
	static JLabel label=new JLabel();
	static char currentLetter;
	public static void main(String[] args) {
		
		
		Typing typing=new Typing();
		typing.homie();
		currentLetter = generateRandomLetter();

label.setText(currentLetter+"");
label.setFont(label.getFont().deriveFont(28.0f));
label.setHorizontalAlignment(JLabel.CENTER);

	}

	static char generateRandomLetter() {
	      Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
	}
void homie() {
	
	frame.addKeyListener(this);
	frame.setVisible(true);
	frame.setTitle("Type or sigh");
	
}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	 currentLetter=generateRandomLetter();
	 label.setText(currentLetter+"");
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}
