package be.ephec.Player;

import java.awt.Color;
import java.awt.Graphics;

public class Joueur extends Pion {
	public String nom;
	public boolean etat = false;
	public int position = 0;
	public Pion p;
	
	//Joueur joueur1 = new Joueur("Joueur1", false, 0,Color.red);
	public Joueur(){
		
	}
	public void paintComponent(Graphics g){
		
		Joueur joueur1 = new Joueur("Joueur1", false, 0,getGraphics(),Color.blue, 105,115);
	}
	public Joueur(String nomJoueur, boolean etatJoueur, int positionJoueur,Graphics g, Color couleur, int posX, int posY){
        //Inutile de créer un pion : tu es dans la classe "Joueur"
        //donc on crée un joueur sachant que Joueur appartient à la superclasse Pion
        //via la méthode super()
		super(g, couleur, posX, posY);
		//création d'un joueur
		nom = nomJoueur; //nom du joueur
		etat = etatJoueur;//etat du joueur
		position = positionJoueur;  //position du joueur
		
	}
}
