package be.ephec.Player;

import java.awt.Graphics;

public class Joueur {
	private String nom;
	private boolean etat = false;
	private int position = 0; 
	
	Joueur joueur1 = new Joueur("Joueur1", false, 0);
	
	public Joueur(String nomJoueur, boolean etatJoueur, int positionJoueur){
		//création d'un joueur
		nom = nomJoueur; //nom du joueur
		etat = etatJoueur;//etat du joueur
		position = positionJoueur;  //position du joeur
		}

	
}
