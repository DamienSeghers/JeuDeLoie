package be.ephec.view;

import java.awt.Font;
import javax.swing.JLabel;

public class IndicateurNom extends JLabel {
	
	public IndicateurNom(){
		
		this.setText("C'est au tour de : ");
		this.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		this.setFont(new Font("Tahoma", Font.PLAIN, 20));
	}

}
