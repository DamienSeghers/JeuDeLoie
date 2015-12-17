package be.ephec.view;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class AfficheNom extends JPanel{
	public AfficheNom(){
		
		IndicateurNom phraseIntro = IndicateurNom();
		ChangerNom nom = ChangerNom();
		
		this.setLayout(new BorderLayout(0, 0));
		this.setOpaque(false);
	}

}
