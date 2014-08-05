import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;


@SuppressWarnings("serial")
public class Board extends JFrame{

	public Board(){
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		this.setTitle("Board");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setSize((int)screenSize.getWidth(), (int)screenSize.getHeight());
		/*this.setVisible(true);
		CardPanel card1 = new CardPanel(1, 0, 1);
		getContentPane().add(card1, BorderLayout.CENTER);
		pack();
		System.out.println("" + card1.getSize());
		
		this.add(card1);*/
	}
	
	
}
