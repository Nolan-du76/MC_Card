import javax.swing.JFrame;


@SuppressWarnings("serial")
public class Board extends JFrame{

	public Board(){
		this.setTitle("Board");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setVisible(true);
		CardPanel card1 = new CardPanel(1, 0, 1); 
		this.add(card1);
		//pack();
		System.out.println("" + card1.getSize());
	}
	
	
}
