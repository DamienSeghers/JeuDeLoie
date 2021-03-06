package be.ephec.view;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Fond extends JPanel {
	
	/**
	 * M�thode affichant l'image de fond de la fen�tre
	 */
	public void paintComponent(Graphics g){
		
		try {
			Image img = ImageIO.read(new File("plateau.jpg"));
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this); 
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
