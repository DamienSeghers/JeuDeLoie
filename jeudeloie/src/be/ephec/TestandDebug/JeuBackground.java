package be.ephec.TestandDebug;

import java.util.Scanner;
import java.math.*;

public class JeuBackground {

	
	public static void main(String[] args) {
		
		int cpt =0;
		int actionPlayer;
		Joueur player1 = new Joueur();
		Event event = new Event();
		Dé de = new Dé();

		do {
			player1.setSonTour(true);
			while(player1.isSonTour())
			{
				System.out.println( "/////"+player1.getPosition());
				de.lancerDe();
				System.out.println("testPosition =" + player1.getPosition() +" dé = " + de.getResultat());
				player1.setPosition(player1.getPosition() + de.getResultat()); //change la position après le lancer de dé
				System.out.println("Position change :" + player1.getPosition());
				actionPlayer = event.checkEvent(player1.getPosition()); //vérifie si action sur la case 
				if(actionPlayer == 1)
					System.out.println("Position : " + player1.getPosition() + " IL BOUGEEEEEEE");
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
