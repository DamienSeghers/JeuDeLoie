package be.ephec.modele;

import javax.swing.JOptionPane;
import be.ephec.view.Fenetre;

public class Board {
	
	//Constantes
	
	public final int EXIT_SUCCESS = 1;
	
	//Variables
	
	public int cpt =0;
	public int actionPlayer;
	public Event event = new Event();
	public Des de = new Des();
	public Fenetre fen = new Fenetre();
	
	
	/**
	 * Méthode servant à réinitialiser le jeu 
	 * Les pions seront ainsi mis à la case de départ
	 */
	public void reinitialiser(){
			fen.pion.joueur.setPosition(0);
			cpt = 0;
			fen.entete.boutonReset.setClickReset(false);
	}
	
	/**
	 * Intéraction du pion avec la case, s'il y en a.
	 */
	
	public void interagirCase(){
		actionPlayer = event.checkEvent(fen.pion.joueur.getPosition());
		fen.pion.joueur.faireAction(actionPlayer);
	}
	
	/**
	 * Permet de déplacer le pion à une case donnée
	 * par la position de l'objet Joueur
	 */
	
	public void bougerJoueur(){
		fen.pion.bougerPion(fen.pion.joueur.getPosition()); 
		fen.repaint();
	}
	
	/**
	 * Méthode servant à demander si le joueur veut rejouer à la fin quand il a gagné
	 */
	public void win(){

		int lecture = JOptionPane.showConfirmDialog(null, "Voulez vous recommencer? ", 
		      "Reset", JOptionPane.YES_NO_OPTION);
		
		if(lecture == JOptionPane.YES_OPTION){
			reinitialiser();
			lancerJeu();
		}
		else{
			System.exit(EXIT_SUCCESS);
		}
	}
	
	/**
	 * Méthode gérant le bon déroulement du jeu
	 */
	
	public void lancerJeu(){
		
		String message =  JOptionPane.showInputDialog(null,"Quel est votre nom ?");
		fen.pion.joueur.setNom(message);
		fen.entete.sousTitre.setText("C'est au tour de : " + fen.pion.joueur.getNom());
		do{ 
			
			if(fen.entete.boutonDe.isClickDe()==true){
				
				if(fen.entete.boutonReset.isClickReset()){
					reinitialiser();
				}
				cpt++;
				de.lancerDe();
				JOptionPane.showMessageDialog(null, " Dé = " + de.getResultat());
				fen.pion.joueur.setPosition(fen.pion.joueur.getPosition() + de.getResultat());
				bougerJoueur();
				interagirCase();
				bougerJoueur();
				if(actionPlayer == 2){
					cpt--;
				}
				fen.entete.boutonDe.setClickDe(false);

			}
		}while(fen.pion.joueur.getPosition() < 31);
		
		JOptionPane.showMessageDialog(null,fen.pion.joueur.getNom() + " You Win !!");
		win();
	}
		
}
	
