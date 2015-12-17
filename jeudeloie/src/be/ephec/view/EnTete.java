package be.ephec.view;

import java.awt.BorderLayout;
import java.awt.Graphics;

import javax.swing.JPanel;


/*
 * En t�te graphique, elle consiste � regrouper les �l�ments de ce dernier
 * Il contient le titre, sous-titre et les boutons
 */
public class EnTete extends JPanel{
	public Titre titre = new Titre(); //JLabel
	public BoutonResetJeu boutonReset = new BoutonResetJeu();
	public BoutonD� boutonDe = new BoutonD�();
	public EnTete(){
	//rend le jpanel transparent
		this.setLayout(new BorderLayout(0,0));
		this.add(titre,BorderLayout.NORTH);
		this.add(boutonReset,BorderLayout.WEST);
		this.add(boutonDe,BorderLayout.EAST);
		this.setOpaque(false);

	}

}
