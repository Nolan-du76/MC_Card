import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;

@SuppressWarnings("serial")
public class CardPanel extends JPanel {

	// dimensions de la carte
	private static int hauteur = 400;
	private static int largeur = 250;

	// labels d'attributs
	private JLabel lbl_att;
	private JLabel lbl_def;
	private JLabel lbl_pv;

	/**
	 * Create the frame.
	 */
	public CardPanel(int att, int def, int pv) {

		// on initialise les panels
		initLabel(att, def, pv);

	}

	public CardPanel() {

		// on initialise les panels
		initLabel(1, 0, 1);

	}

	public void createCard() {
		// on créé le panel de la carte avec la bordure
		setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
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
	public void initLabel(int att, int def, int pv) {

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
	}
}
