package be.ephec.TestandDebug;

import java.util.Scanner;
import java.math.*;

public class JeuBackground {

	
	public static void main(String[] args) {
		
		int cpt =0;
		int actionPlayer;
		Joueur player1 = new Joueur();
		Event event = new Event();
		D� de = new D�();

		do {
			player1.setSonTour(true);
			while(player1.isSonTour())
			{
				de.lancerDe();
				player1.setPosition(de.getResultat()); //change la position apr�s le lancer de d�
				actionPlayer = event.checkEvent(player1.getPosition()); //v�rifie si action sur la case 
				player1.faireAction(actionPlayer);
				cpt = cpt +1;
				System.out.println("position = " + player1.getPosition());
				System.out.println("Fin du tour"+cpt);
			}
			
		}
		while (player1.getPosition() < 31);
		
		System.out.println("Bravo Tu as fini le jeu Connard ... ");
	}
}
