package be.ephec.view;

import java.awt.Font;
import javax.swing.JLabel;
import be.ephec.modele.*;

public class IndicateurNom extends JLabel {
	
	public IndicateurNom(){
		Joueur nom = new Joueur();
		
		this.setText("C'est au tour de : " + nom.getNom());
		this.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		this.setFont(new Font("Tahoma", Font.PLAIN, 20));
	}

}
