package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckle implements ActionListener {

	JButton button1=new JButton();
	JButton button2=new JButton();
	public void makeButton() {
		JFrame frame= new JFrame();
		frame.setVisible(true);
		frame.pack();
		JPanel panel=new JPanel();
		frame.add(panel);
		
		
		panel.setVisible(true);
		panel.add(button1);
		panel.add(button2);
		button1.setVisible(true);
		button2.setVisible(true);
		button1.setText("Joke");
		button2.setText("Punchline");
		button1.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button1) {
			JOptionPane.showConfirmDialog(null, "How do you make an india self destruct.........You press the red button ");
			
		}
		else{
			
			JOptionPane.showConfirmDialog(null, "No SE amigo jajajaj");
		
		}
	}

	
	
	
	
	
	
}
