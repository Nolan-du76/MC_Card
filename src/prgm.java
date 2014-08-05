import java.awt.EventQueue;


public class prgm {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Board board = new Board();
					board.setVisible(true);
					board.add(new CardPanel(1,0,1));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
