import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Mole implements ActionListener {

	JFrame frame=new JFrame();
    JPanel panel=new JPanel();
   
	public static void main(String[] args) {
		Mole mole=new Mole();
	 mole.setup();
	}


void setup() {
	frame.setVisible(true);
	frame.add(panel);
	
	drawbuttons(5);
	
	frame.setPreferredSize(new Dimension(250,300));
	frame.pack();
}
Random randy=new Random();

void drawbuttons(int a){
	int c=randy.nextInt(25);
	for (int i = 0; i < 25; i++) {
		JButton button=new JButton();
		panel.add(button);
		button.addActionListener(this);
		if(c==i) {
			button.setText("moole");
		}
	}
	
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if(!((JButton) e.getSource()).getText().equals("moole")) {
		speak("Sorry dawg homie big man G ponton i am russsssiiiiannnn that aint moole");
	}
}

void speak(String words) { 
    try { 
        Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}