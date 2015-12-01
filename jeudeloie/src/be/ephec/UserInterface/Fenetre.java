package be.ephec.UserInterface;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
	public Fenetre(){
		
		/*
		 * La fen�tre 
		 */
		
		this.setTitle("Jeu de l'oie"); // Donne une titre � la fen�tre
		this.setSize(800, 500); // D�finis la taille de la fen�tre
		this.setLocationRelativeTo(null); // Mets la fen�tre au centre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ferme la fen�tre quand on clique sur la croix
		this.setContentPane(new Fond()); // Appelle Fond pour faire le background
		
		this.setVisible(true); // Rend la fen�tre visisble
		
		/*
		 * L'image de fond 
		 */
		
		JPanel fond = new JPanel(); // Instancie un objet JPanel
	}

}
