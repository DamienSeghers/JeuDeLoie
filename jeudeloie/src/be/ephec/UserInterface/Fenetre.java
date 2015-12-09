package be.ephec.UserInterface;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
	public Fenetre(){
		
		/*La fenêtre */
		this.setTitle("Jeu de l'oie"); 								// Donne une titre à la fenêtre
		this.setSize(800, 500); 									// Définis la taille de la fenêtre
		this.setLocationRelativeTo(null); 							// Mets la fenêtre au centre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 		// Ferme la fenêtre quand on clique sur la croix
		this.setContentPane(new Fond()); 							// Appelle Fond pour faire le background
		this.setVisible(true); 										// Rend la fenêtre visisble
		
		/*L'image de fond */
		JPanel fond = new JPanel(); 								// Instancie un objet JPanel
		
		/*Declaration des Label*/
		JLabel labelTitle = new JLabel("Jeu de l'oie"); 			//Pour ecrire le titre du jeu dans la fenetre
		labelTitle.setBounds(265, 10, 150, 40);						//Taille & position de la fenetre
		labelTitle.setFont(new Font("Tahoma", Font.PLAIN, 30));		//Changer la police du texte
		
		JLabel labelText1 = new JLabel("C'est au tour de : ");		//Pour ecrire dans la fenetre
		labelText1.setBounds(800, 60, 100, 15);						//Taille & position de la fenetre
		
		JLabel labelText2 = new JLabel("JoueurName");				//Pour ecrire dans la fenetre
		labelText2.setBounds(500, 60, 150, 15);						//Taille & position de la fenetre
		
		JButton boutonLancerDe = new JButton("Lancer dé");			//pour creer le bouton
		boutonLancerDe.setBounds(582, 80, 105, 25);					//Taille & position de la fenetre
		
		//ajout des element sur le fond
		fond.setLayout(null);
		fond.add(labelText2);
		fond.add(labelTitle);
		fond.add(labelText1);
		fond.add(boutonLancerDe);
	}

}
