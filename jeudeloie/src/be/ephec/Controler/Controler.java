package be.ephec.controler;

import java.util.Scanner;
import java.math.*; 
import be.ephec.modele.*;
import be.ephec.view.*;

public class Controler {
	
	public static void main(String[] args) {
		
		int cpt =0;
		int actionPlayer;
		Joueur player1 = new Joueur();
		Event event = new Event();
		D� de = new D�();
		Fenetre fen = new Fenetre();

		do {
			player1.setSonTour(true);
			cpt = cpt +1;
			while(player1.isSonTour())
			{
				System.out.println( " D�but du tour "+cpt+" en case "+player1.getPosition());
				de.lancerDe();
				System.out.println("d� = " + de.getResultat());
				player1.setPosition(player1.getPosition() + de.getResultat()); //change la position apr�s le lancer de d�
				System.out.println("Nouvelle case :" + player1.getPosition());
				actionPlayer = event.checkEvent(player1.getPosition()); //v�rifie si action sur la case
				player1.faireAction(actionPlayer);
				System.out.println("il bouge � la case " + player1.getPosition()); 
				System.out.println("Fin du tour "+cpt+" en case "+player1.getPosition());
				System.out.println(" ");
				System.out.println(" ");
			}
			
		}
		while (player1.getPosition() < 31);
		System.out.println("Win !!");
	}
}