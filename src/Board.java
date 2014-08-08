//import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

@SuppressWarnings("serial")
public class Board extends JFrame {

	// on enregistre la taille
	private int height;
	private int width;
	JPanel panelNorth = new JPanel();
	JPanel panelSouth = new JPanel();

	/**
	 * constructeur
	 */
	public Board() {
		// on nomme, centre, active l'option de fermeture de la fenêtre
		this.setTitle("Board");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		/**
		 * on crée les panels de side
		 */
		panelNorth.setBounds(0, 0, width, height/2);
		panelNorth.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		getContentPane().add(panelNorth);
		
		panelSouth.setBounds(0, height/2, width, height);
		panelSouth.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		getContentPane().add(panelSouth);

		/**
		 * Events plein écran
		 */
		// si la fenêtre est redimentionnée, on le re-fullscreen
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent arg0) {
				setMaxScreenSize();
				// setFullScreen();
			}
		});
	}

	/**
	 * Fonctions
	 */
	// Fonction pour fullscreen total
	public void setFullScreen() {
		GraphicsDevice device = GraphicsEnvironment
				.getLocalGraphicsEnvironment().getScreenDevices()[0];

		device.setFullScreenWindow(this);
	}

	// Fonction pour fullscreen partiel
	public void setMaxScreenSize() {
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.recordBoardSize();
	}

	/**
	 * Getters/Setters
	 */
	public int getBoardHeight() {
		return height;
	}

	public void setBoardHeight(int height) {
		this.height = height;
	}

	public int getBoardWidth() {
		return width;
	}

	public void setBoardWidth(int width) {
		this.width = width;
	}

	public void recordBoardSize() {
		this.height = this.getHeight();
		this.width = this.getWidth();
	}

	@Override
	public String toString() {
		return "Board [height : " + height + ", width : " + width + "]";
	}

}