import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;

public class prgm {

	// on crée 2 arraylist contenant les cartes des joueurs
	private static ArrayList<CardPanel> listCard_P1 = new ArrayList<CardPanel>();
	private static ArrayList<CardPanel> listCard_P2 = new ArrayList<CardPanel>();

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
		addCard(listCard_P1);
		addCard(listCard_P1, "Zombie", 2, 3, 4, true);
		addCard(listCard_P2, "Poulet", 0, 0, 1, false);
		addCard(listCard_P2, "Loup", 3, 0, 2, true);

		// on affiche la fenêtre
		board.setVisible(true);

		// Delais pour avoir les dimensions full-screen
		r.delay(6);

		// on modifie la taille des camps
		board.panelNorth.setSize(board.getBoardWidth(), board.getHeight() / 2 -10);
		board.panelSouth.setLocation(0, board.panelNorth.getHeight());
		board.panelSouth.setSize(board.getBoardWidth(), board.getHeight() / 2 -10);

		/**
		 * Ajouer les cartes
		 */
		// terrain du joueur 1
		for (int i = 0; i < listCard_P1.size(); i++) {
			// on ajoute les cartes au panel du J1
			board.panelNorth.add(listCard_P1.get(i));
			listCard_P1.get(i)
					.setLocation(listCard_P1.get(1).getWidth() * i, 0);
		}
		// terrain du joueur 2
		for (int i = 0; i < listCard_P2.size(); i++) {
			// on ajoute les cartes au panel du J2
			board.panelSouth.add(listCard_P2.get(i));
			listCard_P2.get(i)
					.setLocation(listCard_P2.get(1).getWidth() * i, 0);
		}

		// on affiche les dimensions du terrain
		System.out.println(board.toString());
	}

	/**
	 * Fonctions
	 */

	/*
	 * Création des cartes
	 */
	// on crée une carte non instantiée
	public static void addCard(ArrayList<CardPanel> ArL) {
		CardPanel card_null = new CardPanel();
		ArL.add(card_null);
	}

	// on créé une carte via ses valeurs
	public static void addCard(ArrayList<CardPanel> ArL, String nom, int att,
			int def, int pv, boolean aggr) {
		CardPanel card_int = new CardPanel(nom, att, def, pv, aggr);
		ArL.add(card_int);
	}

	// on ajoute une carte
	public static void addCard(ArrayList<CardPanel> ArL, CardPanel card) {
		ArL.add(card);
	}
}