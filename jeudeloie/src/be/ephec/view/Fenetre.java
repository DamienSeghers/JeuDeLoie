package be.ephec.view;

import javax.swing.*;
import be.ephec.modele.Dé;
import java.awt.event.*;
import java.awt.*;
import net.miginfocom.swing.MigLayout;


public class Fenetre extends JFrame{
	public Fond fond = new Fond();
	public EnTete entete = new EnTete();
	public Grille grille = new Grille();
	public JoueurView pion = new JoueurView();
	
	public Fenetre() {
		initialize();
	}

	private void initialize() {
		this.setResizable(false);
		this.setTitle("Jeu de l'oie");
		this.setBounds(100, 100, 1024, 627);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		//Ajout de l'image
		this.setContentPane(fond);
	
		//Ajout de l'en-tête comprenant titre, sous-titre, et les deux boutons
		this.setLayout(new BorderLayout(0,0));
		this.add(entete,BorderLayout.NORTH);
		
		//Pion
		this.add(grille);
		this.add(pion);
	}
}