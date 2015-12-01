package be.ephec.UserInterface;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
	public Fenetre(){
		
		/*
		 * La fenêtre 
		 */
		
		this.setTitle("Jeu de l'oie"); // Donne une titre à la fenêtre
		this.setSize(800, 500); // Définis la taille de la fenêtre
		this.setLocationRelativeTo(null); // Mets la fenêtre au centre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ferme la fenêtre quand on clique sur la croix
		this.setContentPane(new Fond()); // Appelle Fond pour faire le background
		
		this.setVisible(true); // Rend la fenêtre visisble
		
		/*
		 * L'image de fond 
		 */
		
		JPanel fond = new JPanel(); // Instancie un objet JPanel
	}

}
