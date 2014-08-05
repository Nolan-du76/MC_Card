import java.util.ArrayList;

public class prgm {
	private static Board board;

	public static void main(String[] args) {

		Board board = null;

		try {
			board = new Board();
			board.getContentPane().setLayout(null);
		} catch (Exception e) {
			e.printStackTrace();
		}

		ArrayList<CardPanel> listCard = new ArrayList<CardPanel>();

		CardPanel card1 = new CardPanel(1, 1, 1);
		listCard.add(card1);

		CardPanel card2 = new CardPanel(2, 2, 2);
		listCard.add(card2);

		CardPanel card3 = new CardPanel(3, 3, 3);
		listCard.add(card3);

		CardPanel card4 = new CardPanel(5, 5, 5);
		listCard.add(card4);

		for (int i = 0; i < listCard.size(); i++) {
			board.getContentPane().add(listCard.get(i));
			System.out.println(listCard.get(i).toString());
		}

		for (int i = 0; i < listCard.size(); i++) {
			listCard.get(i).setLocation(listCard.get(1).getWidth() * i, 0);
		}

		board.setVisible(true);
	}
}
