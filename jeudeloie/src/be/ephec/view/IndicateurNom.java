package be.ephec.view;

import java.awt.Font;
import javax.swing.JLabel;
import be.ephec.modele.*;

public class IndicateurNom extends JLabel {
	
	/**
	 * Méthode servant à afficher le nom du joueur qui joue
	 */
	public IndicateurNom(){
		this.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		this.setFont(new Font("Tahoma", Font.PLAIN, 20));
	}
}
