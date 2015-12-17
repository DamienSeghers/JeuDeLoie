package be.ephec.view;

import be.ephec.modele.Joueur;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class JoueurView extends JPanel {
	private final int X_DEPART = 85;
	private final int Y_DEPART = 40;
	private final int DIAMETRE = 85 / 2;
	private final int MOVE = 90;
	private int x = X_DEPART;
	private int y = Y_DEPART;
	private int width = DIAMETRE;
	private int height = DIAMETRE;
	public Joueur joueur = new Joueur();

	public void paintComponent(Graphics g) {
		g.setColor(Color.red);
		g.drawOval(this.x, this.y, this.width, this.height);
		g.fillOval(this.x, this.y, this.width, this.height);
	}

	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}

public void bougerPion(int position) {

		if (position <= 9) {
			this.setX(X_DEPART + (MOVE * position));
			this.setY(Y_DEPART);
		} else if (position == 10) {
			this.setX(X_DEPART + (MOVE * 9));
			this.setY(Y_DEPART + MOVE);
		} else if (position >= 11 && position <= 20) {
			this.setX(X_DEPART + MOVE * (20 -position));
			this.setY(Y_DEPART + MOVE * 2);
		} else if (position == 21) {
			this.setX(X_DEPART);
			this.setY(Y_DEPART + MOVE * 3);
		} else if (position >= 22 && position <= 30){
			this.setX(X_DEPART + MOVE * (position - 22));
			this.setY(Y_DEPART + MOVE * 4);
		} else if (position >= 31){
			this.setX(X_DEPART + MOVE * 9);
			this.setY(Y_DEPART + MOVE * 4);
		}	
	}
}
