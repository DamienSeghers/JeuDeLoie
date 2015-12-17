package be.ephec.view;

import java.awt.Font;
import javax.swing.JLabel;

public class Titre extends JLabel {
	/**
	 * Méthode servant à afficher le titre du jeu
	 */
	public Titre(){
		
		this.setText("Jeu de l'oie");
		this.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		this.setFont(new Font("Tahoma", Font.PLAIN, 60));
	}

}
