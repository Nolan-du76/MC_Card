//import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

@SuppressWarnings("serial")
public class Board extends JFrame {

	// on enregistre la taille
	private int height;
	private int width;

	/**
	 * constructeur
	 */
	public Board() {
		// on nomme, centre, active l'option de fermeture de la fenêtre
		this.setTitle("Board");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
		this.getBoardSize();
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

	public void getBoardSize() {
		this.height = this.getHeight();
		this.width = this.getWidth();
	}

	@Override
	public String toString() {
		return "Board [height : " + height + ", width : " + width + "]";
	}
	
}