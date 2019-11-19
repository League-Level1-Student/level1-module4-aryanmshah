import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Twitter implements ActionListener {

	
	JFrame frame=new JFrame("Tweet retriever");
	JPanel panel=new JPanel();
	JTextField field= new JTextField (15);
	JButton button=new JButton("Search the twitterverse");
	void setup(){
	
		frame.setVisible(true);
		frame.add(panel);
		panel.add(field);
		panel.add(button);
		frame.pack();
		button.addActionListener(this);
		
	}
	public static void main(String[] args) {
		Twitter twit= new Twitter();
	twit.setup();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub;
		JOptionPane.showConfirmDialog(null, "Tweet tweet")
	}
	
}
