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
				System.out.println( " Début du tour "+cpt+" en case "+fen.pion.joueur.getPosition());
				de.lancerDe();
				System.out.println("De ="+ de.getResultat());
				//JOptionPane.showMessageDialog(null,de.getResultat());
				fen.pion.joueur.setPosition(fen.pion.joueur.getPosition() + de.getResultat()); //change la position après le lancer de dé
				
				fen.pion.bougerPion(fen.pion.joueur.getPosition()); 
				fen.repaint();
				
				actionPlayer = event.checkEvent(fen.pion.joueur.getPosition()); //vérifie si action sur la case
				fen.pion.joueur.faireAction(actionPlayer);
				
				fen.pion.bougerPion(fen.pion.joueur.getPosition()); 
				fen.repaint();
				
				System.out.println("il bouge à la case " + fen.pion.joueur.getPosition()); 
				System.out.println("Fin du tour "+cpt+" en case "+fen.pion.joueur.getPosition());
				System.out.println("");
				if(actionPlayer == 2){
					cpt--;
				}
				if(fen.pion.joueur.getPosition() < 31) {
					System.out.println(" Relance le Dé");
				}
				
				fen.entete.boutonDe.setClickDe(false);

			}
		}while(fen.pion.joueur.getPosition() < 31);
		
		System.out.println("Win !!");
		win();
	}
		
}
	
