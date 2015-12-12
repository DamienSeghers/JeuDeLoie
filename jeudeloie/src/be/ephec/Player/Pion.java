package be.ephec.Player;

import java.awt.Color;
import java.awt.Graphics;

public class Pion{
	private int numCase;
	private int posX;
	public int posY;
	public Color couleur;
	
	public Pion(){
		
	}
	
	public Pion(Graphics p,Color couleur, int posX, int posY){
		p.setColor(couleur); //change la couleur
		p.fillOval(posX, posY, 40, 40);// fait une forme ronde
	}
	

	public Color getColor(){ //affiche la couleur
		return couleur;
	}
	public void setColor(Color couleur){ //recupere la couleur
		this.couleur = couleur;
	}
	
	//afficher les coordnonées 
	public int getPosX() {
		    return posX;
		  }
	  public int getPosY() {
		    return posY;
		  }
	  public void setCoord(int posX, int posY) { //recupere les coordonnées
		    this.posX = posX;
		    this.posY = posY;
		  }
	}
	
