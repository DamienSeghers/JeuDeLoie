package be.ephec.view;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 * En t�te graphique, elle consiste � regrouper les �l�ments de ce dernier
 * Il contient le titre, sous-titre et les boutons
 */

public class EnTete extends JPanel{
	public Titre titre = new Titre(); //JLabel
	public BoutonResetJeu boutonReset = new BoutonResetJeu();
	public BoutonD� boutonDe = new BoutonD�();
	public IndicateurNom sousTitre = new IndicateurNom();
	public EnTete(){

		this.setLayout(new BorderLayout(0,0));
		this.add(titre,BorderLayout.NORTH);
		this.add(boutonReset,BorderLayout.WEST);
		this.add(boutonDe,BorderLayout.EAST);
		this.add(sousTitre,BorderLayout.CENTER);
		this.setOpaque(false);

	}

}
