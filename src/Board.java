//import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

@SuppressWarnings("serial")
public class Board extends JFrame {

	public Board() {
		// on nomme, centre, active l'option de fermeture de la fenêtre
		this.setTitle("Board");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// on met la fenêtre en fullscreen
		setMaxScreenSize();

		// si la fenêtre est redimentionnée, on le re-fullscreen
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent arg0) {
				setMaxScreenSize();
			}
		});

	}

	/**
	 * Fonction pour fullscreen total
	 */
	public void setFullScreen() {
		GraphicsDevice device = GraphicsEnvironment
				.getLocalGraphicsEnvironment().getScreenDevices()[0];

		device.setFullScreenWindow(this);
	}
	
	/**
	 * Fonction pour fullscreen partiel
	 */
	public void setMaxScreenSize() {
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
}
