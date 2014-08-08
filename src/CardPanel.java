import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import java.awt.SystemColor;

import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.border.MatteBorder;

@SuppressWarnings("serial")
public class CardPanel extends JPanel {

	// dimensions de la carte
	private static int hauteur = 400;
	private static int largeur = 250;

	// labels d'attributs
	private JLabel lbl_att;
	private JLabel lbl_def;
	private JLabel lbl_pv;
	private JLabel lbl_nom;

	// on créé une carte
	private Card carte = null;

	// couleur de la carte = aggressif
	private Color cardColor = new Color(0, 0, 0);

	/**
	 * création de la carte.
	 */
	// constructeur complet
	public CardPanel(String nom, int att, int def, int pv, boolean aggr) {

		// on choisi la couleur de la bordure
		if (aggr)
			cardColor = Color.red;
		else
			cardColor = Color.green;

		// on créé la carte
		createCard();

		// on initialise la carte
		carte = new Card(nom, att, def, pv, aggr);

		// on initialise les panels
		initLabel(nom, att, def, pv);

	}

	// constructeur vide
	public CardPanel() {

		cardColor = Color.green;

		createCard();

		// on initialise la carte
		carte = new Card();

		// on initialise les panels
		initLabel("Cochon", 1, 0, 1);

	}

	public void createCard() {

		// on créé le panel de la carte avec la bordure
		setBorder(new MatteBorder(2, 2, 2, 2, (Color) (cardColor)));
		setBounds(100, 100, largeur, hauteur);

		// on set la taille du panel
		this.setPreferredSize(new Dimension(largeur, hauteur));

	}

	/**
	 * fonction d'initialisation de tous les labels
	 * 
	 * @param att
	 * @param def
	 * @param pv
	 */
	public void initLabel(String nom, int att, int def, int pv) {

		// on transforme les int en string
		String att_str = new Integer(att).toString();
		String def_str = new Integer(def).toString();
		String pv_str = new Integer(pv).toString();
		setLayout(null);

		// label d'attaque
		lbl_att = new JLabel();
		lbl_att.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_att.setText(att_str);
		lbl_att.setBounds(10, 375, 29, 14);
		this.add(lbl_att);
		lbl_att.setBackground(getBackground());

		// label de défence
		lbl_def = new JLabel();
		lbl_def.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_def.setText(def_str);
		lbl_def.setBackground(SystemColor.menu);
		lbl_def.setBounds(110, 375, 29, 14);
		this.add(lbl_def);

		// label de points de vie
		lbl_pv = new JLabel();
		lbl_pv.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pv.setText(pv_str);
		lbl_pv.setBackground(SystemColor.menu);
		lbl_pv.setBounds(219, 375, 21, 14);
		this.add(lbl_pv);

		// label de nom
		lbl_nom = new JLabel();
		lbl_nom.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_nom.setText(nom);
		lbl_nom.setBackground(SystemColor.menu);
		lbl_nom.setBounds(102, 25, 46, 14);
		this.add(lbl_nom);
	}

	/**
	 * Getters/Setters
	 */
	public Card getCarte() {
		return carte;
	}

	public void setCarte(Card carte) {
		this.carte = carte;
	}

	public Color getCardColor() {
		return cardColor;
	}

	public void setCardColor(Color cardColor) {
		this.cardColor = cardColor;
	}
}
