package _12_slot_machine;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class slot {
JFrame frame=new JFrame();
JPanel panel=new JPanel();
JButton button=new JButton();
JLabel label=new JLabel();
JLabel label1=new JLabel();
JLabel label2=new JLabel();
void setup() {
	frame.setVisible(true);
	frame.add(panel);
	panel.add(button);
	button.setName("Spin");
	label.set
}


private Icon createLabelImage(String fileName) throws MalformedURLException{
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return null;
}
Icon icon = new ImageIcon(imageURL);

return icon;
}

}
