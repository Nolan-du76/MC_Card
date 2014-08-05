import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JLabel;


@SuppressWarnings("serial")
public class CardPanel extends JPanel {

	private static int hauteur = 400;
	private static int largeur = 250;
	
	private JLabel lbl_att;
	private JLabel lbl_def;
	private JLabel lbl_pv;
	
	JPanel pan = new JPanel();

	/**
	 * Create the frame.
	 */
	public CardPanel(int att, int def, int pv) {
		setBounds(100, 100, largeur, hauteur);
		
		//on set la taille du content panel
		pan.setPreferredSize(new Dimension(largeur, hauteur));
		pan.setLayout(null);
		
		initLabel(att, def, pv);
		
		this.add(pan);
		this.setPreferredSize(new Dimension(largeur, hauteur));
		
		repaint();
		
		
	}
	
	public void initLabel(int att, int def, int pv){
		
		//on transforme les int en string
		String att_str = new Integer(att).toString();
		String def_str = new Integer(def).toString();
		String pv_str = new Integer(pv).toString();
		
		lbl_att = new JLabel();
		lbl_att.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_att.setText(att_str);
		lbl_att.setBounds(10, 369, 21, 20);
		pan.add(lbl_att);
		lbl_att.setBackground(getBackground());
		
		lbl_def = new JLabel();
		lbl_def.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_def.setText(def_str);
		lbl_def.setBackground(SystemColor.menu);
		lbl_def.setBounds(109, 369, 32, 20);
		pan.add(lbl_def);
		
		lbl_pv = new JLabel();
		lbl_pv.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pv.setText(pv_str);
		lbl_pv.setBackground(SystemColor.menu);
		lbl_pv.setBounds(219, 369, 21, 20);
		pan.add(lbl_pv);
	}
}
