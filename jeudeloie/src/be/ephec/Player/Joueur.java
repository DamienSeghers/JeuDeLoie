package be.ephec.Player;

public class Joueur { //initialise un joueur 
	private String nom;
	private int position = 0; //position du joueur, l'endroit ou il est
	private boolean etat;
	
	Joueur joueur1 = new Joueur(); //creation de l'objet joueur
	
	//constructeur
	public Joueur(){
		//création d'un joueur
		nom = "joueur1"; //nom du joueur
		etat = false; //etat du joueur
		position; //position à 0 de base
	}
	
}
