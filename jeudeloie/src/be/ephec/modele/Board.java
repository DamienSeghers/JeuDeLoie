package be.ephec.modele;

import javax.swing.JOptionPane;

import be.ephec.view.Fenetre;
import be.ephec.view.JoueurView;

public class Board {
	public final int EXIT_SUCCESS = 1;
	public int cpt =0;
	public int actionPlayer;

	public Event event = new Event();
	public Dé de = new Dé();
	public Fenetre fen = new Fenetre();
	
	public void reinitialiser(){
			fen.pion.joueur.setPosition(0);
			cpt = 0;
			fen.entete.boutonReset.setClickReset(false);
		
	}
	
	public void interagirCase(){
		actionPlayer = event.checkEvent(fen.pion.joueur.getPosition()); //v�rifie si action sur la case
		fen.pion.joueur.faireAction(actionPlayer);
	}
	
	public void bougerJoueur(){
		fen.pion.bougerPion(fen.pion.joueur.getPosition()); 
		fen.repaint();
	}
	
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
	
	public void lancerJeu(){
		do{ 
			
			if(fen.entete.boutonDe.isClickDe()==true){
				
				if(fen.entete.boutonReset.isClickReset()){
					reinitialiser();
				}
				cpt++;
				de.lancerDe();
				fen.pion.joueur.setPosition(fen.pion.joueur.getPosition() + de.getResultat()); //change la position apr�s le lancer de d�
				
				bougerJoueur();
				interagirCase();
				bougerJoueur();
				if(actionPlayer == 2){
					cpt--;
				}
				fen.entete.boutonDe.setClickDe(false);

			}
		}while(fen.pion.joueur.getPosition() < 31);
		
		System.out.println("Win !!");
		win();
	}
		
}
	
