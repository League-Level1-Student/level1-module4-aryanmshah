package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {

	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JTextField text1=new JTextField(5);
	JTextField text2=new JTextField(5);
	JButton button1=new JButton("Add");
	JButton button2=new JButton("sub");
	JButton button3=new JButton("mul");
	JButton button4=new JButton("div");
	JLabel label=new JLabel();
	void setup() {
		
		frame.setVisible(true);
		frame.add(panel);
        panel.add(text1);
        panel.add(text2);
        panel.add(button1);
        button1.addActionListener(this);
        
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
       panel.add(label);
        frame.pack();
	}
	
	int a=0;
	int b=0;
	int c=0;
	

	void add() {
		
		c=a+b;
		
	}
	
void sub() {
		
		c=a-b;
		
	}
void mul() {
	
	c=a*b;
	
}
void div() {
	
	c=a/b;
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	 a=Integer.parseInt(text1.getText());
	 b=Integer.parseInt(text2.getText());
	
	e.getSource();
	
	if(e.getSource().equals(button1)) {
		
		add();
	}
	
	if(e.getSource().equals(button2)) {
		sub();
		
	}
	if(e.getSource().equals(button3)) {
		
		mul();
	}
	if(e.getSource().equals(button4)) {
		
		div();
	}
	
	label.setText(c+"");
}
}
