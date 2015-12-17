package be.ephec.view;

import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame{
	
	//variable
	
	public Fond fond = new Fond();
	public EnTete entete = new EnTete();
	public JoueurView pion = new JoueurView();
	
	/**
	 * M�thode servant � cr�e la fen�tre du jeu
	 */
	public Fenetre() {
		initialize();
	}
	
	/**
	 * M�thode servant � initialiser toute la fen�tre
	 */
	private void initialize() {
		
		// variable
		
		this.setResizable(false);
		this.setTitle("Jeu de l'oie");
		this.setBounds(100, 100, 1024, 627);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		//Ajout de l'image
		this.setContentPane(fond);
	
		//Ajout de l'en-t�te comprenant titre, sous-titre, et les deux boutons
		this.setLayout(new BorderLayout(0,0));
		this.add(entete,BorderLayout.NORTH);
		
		//Pion
		this.add(pion);
	}
}