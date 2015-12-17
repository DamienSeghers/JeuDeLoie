package be.ephec.modele;

public class Joueur { 
	
	//variable
	
	private String nom;
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
	
	/**
	 * M�thode servant � modifier la position du pion 
	 * s'il y a une action sur la case
	 */
	
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
	
	/**
	 * M�thode servant � dire si le joueur � bien r�pondu � la question ou non
	 */
	
	public void questionJoueur(){
		quest.donnerQuestion();
		if(quest.isReponse()){
			this.sonTour = true;
		}	
		else {
			this.sonTour = false;
		}	
	}
	
	/**
	 * M�thode servant � activer l'action de la case
	 * @param typeAction, d�termine quel type d'action � faire 
	 */
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