package be.ephec.modele;

import be.ephec.view.JoueurView;

public class Joueur {  
	private String nom = "Damien";
	private int position = 0;
	private boolean sonTour;
	private Event event = new Event();
	private ListeQuestion quest = new ListeQuestion();
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public boolean isSonTour() {
		return sonTour;
	}
	public void setSonTour(boolean sonTour) {
		this.sonTour = sonTour;
	}
	
	public void bougerException(){
		switch(this.position){
			case 6 : this.setPosition(14); break;
			case 12 : this.setPosition(30); break;
			case 15 : this.setPosition(5); break;
			case 16 : this.setPosition(26); break;
			case 24 : this.setPosition(18); break;
			case 29 : this.setPosition(13); break;
			default : System.out.println("ERREUR");
		}
	}
	
	public void questionJoueur(){
		quest.donnerQuestion();
		if(quest.isReponse()){
			this.sonTour = true;
		}	
		else {
			this.sonTour = false;
		}	
	}
	
	public void faireAction(int typeAction){
		if(typeAction == event.NO_ACTION){
			this.sonTour = false;
		}
			
		if(typeAction == event.MOVE_ACTION){
			bougerException();
			this.sonTour = false;
		}
		if(typeAction == event.QUEST_ACTION){
			questionJoueur();
		}
	}
}