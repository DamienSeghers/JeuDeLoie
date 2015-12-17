package be.ephec.view;

import java.awt.BorderLayout;
import javax.swing.JPanel;


public class EnTete extends JPanel{
	
	//Variables
	
	public Titre titre = new Titre();
	public BoutonResetJeu boutonReset = new BoutonResetJeu();
	public BoutonD� boutonDe = new BoutonD�();
	public IndicateurNom sousTitre = new IndicateurNom();
	
	/**
	 * M�thode servant � g�n�rer l'ent�te de la fen�tre
	 */
	public EnTete(){

		this.setLayout(new BorderLayout(0,0));
		this.add(titre,BorderLayout.NORTH);
		this.add(boutonReset,BorderLayout.WEST);
		this.add(boutonDe,BorderLayout.EAST);
		this.add(sousTitre,BorderLayout.CENTER);
		this.setOpaque(false);

	}

}
