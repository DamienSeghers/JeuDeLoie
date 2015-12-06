package be.ephec.Player;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Pion extends JPanel{
	private int numCase;
	private int posX;
	public int posY;
	public Color couleur;
	
	public Pion(Graphics p,Color couleur, int posX, int posY){
		p.setColor(couleur);
		p.fillOval(posX, posY, 45, 45);
	}
	
	public Color getColor(){
		return couleur;
	}
	public void setColor(Color couleur){
		this.couleur = couleur;
	}
	
	public int getPosX() {
		    return posX;
		  }
	  public int getPosY() {
		    return posY;
		  }
	  public void setCoord(int posX, int posY) {
		    this.posX = posX;
		    this.posY = posY;
		  }
	}
	
