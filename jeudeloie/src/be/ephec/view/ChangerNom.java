package be.ephec.view;

import java.awt.Font;
import javax.swing.JLabel;

import be.ephec.modele.Joueur;

public class ChangerNom extends JLabel{
	
	public ChangerNom(){
		
		String nom;
		this.setText("JoueurName");  //ici doit arriver le nom du joueur actif...
		this.setFont(new Font("Tahoma", Font.PLAIN, 20));
	}

}
