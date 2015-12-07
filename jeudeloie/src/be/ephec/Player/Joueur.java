package be.ephec.Player;

import java.awt.Color;
import java.awt.Graphics;

public class Joueur {
	private String nom;
	private boolean etat = false;
	private int position = 0;
	private Pion p;
	
	Joueur joueur1 = new Joueur("Joueur1", false, 0,Color.red);
	
	public Joueur(String nomJoueur, boolean etatJoueur, int positionJoueur, Color couleur){
		//création d'un joueur
		nom = nomJoueur; //nom du joueur
		etat = etatJoueur;//etat du joueur
		position = positionJoueur;  //position du joeur
		Pion p = new Pion(null,couleur,20,20);		//explique a quoi sert null
		}
}
