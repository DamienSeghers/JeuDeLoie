package be.ephec.view;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

public class Grille extends JPanel {

	
	public Grille(){
		this.setLayout(new MigLayout("", "65[85.00][85.00][85.00][85.00][85.00][85.00][85.00][85.00][85.00][85.00]", "15[85.00][85.00][85.00][85.00][85.00]"));
		/*
		 * "","",""
		 * parametre general du layout,
		 * parametres des lignes [taille en px],
		 * parametres des colonnes [taille en px]
		 */
	this.setOpaque(false);
	}

}
