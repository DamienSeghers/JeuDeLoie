package be.ephec.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class BoutonD� extends JButton implements ActionListener{
	private boolean clickDe = false;

	public BoutonD�(){
		this.setText("Lancer d�");
		this.setFont(new Font("Tahoma", Font.PLAIN, 15));
		//boutonLancerDe.setEnabled(false);			//desactive le bouton pour le(s) joueur(s) dont c'est pas le tour
		this.addActionListener((ActionListener) this);
	}
	

	public boolean isClickDe() {
		System.out.print("");
		return clickDe;
	}

	public void setClickDe(boolean activationDe) {
		this.clickDe = activationDe;
	}
	
	public void actionPerformed(ActionEvent e) {
		this.clickDe = true;
	}

}
