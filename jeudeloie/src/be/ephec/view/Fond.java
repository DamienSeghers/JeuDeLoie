package be.ephec.view;

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
			/* 
			 * img => image (� la racin du projet)
			 * 0,0 => point de d�pard
			 * this.getWidth(), this.getHeight() => taille de l'image, varie selon la fen�tre 
			 * this => observer 
			 */
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
