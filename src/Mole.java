import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	for (int i = 0; i < 25; i++) {
		JButton button=new JButton();
		panel.add(button);
		button.addActionListener(this);
	}
	
	
	frame.setPreferredSize(new Dimension(250,300));
	frame.pack();
}

void drawbuttons(int a){
	
	
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}