package be.ephec.UserInterface;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;//plateau.jpeg

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Fond extends JPanel {
	public void paintComponent(Graphics g){
		
		try {
			Image img = ImageIO.read(new File("plateau.jpg")); // Appelle et cherche l'image
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this); 
			System.out.println("largeur = " + this.getWidth());
			System.out.println("hauteur = " + this.getHeight());
			/* 
			 * img => image (à la racin du projet)
			 * 0,0 => point de dépard
			 * this.getWidth(), this.getHeight() => taille de l'image, varie selon la fenêtre 
			 * this => observer 
			 */
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	Joueur joueur1 = new Joueur("Joueur1", false, 0,g,Color.blue, 105,115);
	}
}
