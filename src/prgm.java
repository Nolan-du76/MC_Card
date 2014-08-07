import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;

public class prgm {

	// on crée un arraylist contenant chaque carte
	private static ArrayList<CardPanel> listCard = new ArrayList<CardPanel>();

	private static Robot r = null;

	/**
	 * Main
	 */
	public static void main(String[] args) {

		// On créé un robot pour opérations utiles
		try {
			r = new Robot();
		} catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// on initialise le terrain
		Board board = null;

		// sans le try-catch, la dernière carte ne s'affiche pas
		try {
			board = new Board();
			board.getContentPane().setLayout(null);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// on crée les cartes
		addCard(1, 1, 1);
		addCard(2, 2, 2);
		addCard(3, 3, 3);
		addCard(5, 5, 5);

		// on ajoute et place chaque carte au terrain
		for (int i = 0; i < listCard.size(); i++) {
			board.getContentPane().add(listCard.get(i));
			listCard.get(i).setLocation(listCard.get(1).getWidth() * i, 0);
		}

		// on affiche la fenêtre
		board.setVisible(true);

		r.delay(6);

		System.out.println(board.toString());
	}

	/**
	 * Fonctions
	 */

	/*
	 * Création des cartes
	 */
	// on crée une carte non instantiée
	public static void addCard() {
		CardPanel card_null = new CardPanel();
		listCard.add(card_null);
	}

	// on créé une carte via ses valeurs
	public static void addCard(int att, int def, int pv) {
		CardPanel card_int = new CardPanel(att, def, pv);
		listCard.add(card_int);
	}

	// on ajoute une carte
	public static void addCard(CardPanel card) {
		listCard.add(card);
	}
}