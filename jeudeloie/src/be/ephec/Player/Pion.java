package be.ephec.Player;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Pion extends JPanel{
	private int numCase;
	private int posX;
	public int posY;
	public String couleur;
	
	
	
	public Pion(Graphics p, int posX, int posY){
		p.setColor(Color.BLACK);
		p.fillOval(posX, posY, 45, 45);
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
	


