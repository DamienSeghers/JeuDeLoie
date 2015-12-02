package be.ephec.Player;

public abstract class Pion {
	private int numCase;
	private int posX;
	private int posY;
	
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
	
