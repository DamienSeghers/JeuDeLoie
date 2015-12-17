package be.ephec.view;

import javax.swing.*;

//import be.ephec.controler.Controler;
import be.ephec.modele.Dé;
import java.awt.event.*;
import java.awt.*;
import net.miginfocom.swing.MigLayout;


public class Fenetre extends JFrame{
	public Fond fond = new Fond();
	public EnTete entete = new EnTete();
	public Grille grille = new Grille();
	public JoueurView pion = new JoueurView();
//	SousFenetre sousfen = new SousFenetre(); //JFrame
	/**
	 * Create the application.
	 */
	public Fenetre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame. // amélioration possible, crée un class pour enlever tous les jpanel comme j'ai fait pour le fond 
	 */
	private void initialize() {
		//Initialisation de la fenêtre
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
		this.add(grille);
	
		//Grille
		//this.add(grille,BorderLayout.WEST);
		this.add(pion);
		
		
		
	}

	
}