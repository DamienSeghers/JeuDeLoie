package be.ephec.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class BoutonResetJeu extends JButton implements ActionListener{
	
	//Variable
	
	private boolean clickReset = false;
	
	public boolean isClickReset() {
		return clickReset;
	}

	public void setClickReset(boolean clickReset) {
		this.clickReset = clickReset;
	}
	
	/**
	 * Méthode Méthode affichant le bouton servant à réinitialiser le jeu
	 */
	public BoutonResetJeu(){
		this.setText("Relancer le jeu");
		this.setFont(new Font("Tahoma", Font.PLAIN, 15));
		this.addActionListener((ActionListener) this);
	}
	
	public void actionPerformed(ActionEvent e) {
		this.clickReset = true;
	}
}
