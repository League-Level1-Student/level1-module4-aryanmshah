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
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub;
//		
//		String twee=field.getText();
//		String a=getLatestTweet(twee);
//		JOptionPane.showConfirmDialog(null, a);
//	}
//	private String getLatestTweet(String searchingFor) {
//
//	    twitter4j.Twitter twitter = new TwitterFactory().getInstance();
//
//	    AccessToken accessToken = new AccessToken(
//	        "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
//	        "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
//	    twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
//	        "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
//	    twitter.setOAuthAccessToken(accessToken);
//
//	Query query = new Query(searchingFor);
//	    try {
//	        QueryResult result = twitter.search(query);
//	        return result.getTweets().get(0).getText();
//	    } catch (Exception e) {
//	        System.err.print(e.getMessage());
//	        return "What the heck is that?";
//	    }
//	}
//	
//	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
