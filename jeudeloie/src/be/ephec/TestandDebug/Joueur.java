package be.ephec.TestandDebug;

public class Joueur { //initialise un joueur 
	private String nom = "Damien";
	private int position = 0;
	private boolean sonTour;
	private Event event = new Event(); // Pour prendre les constantes pour plus de visibilité ( voir faireAction())
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
	
	public void bougerJoueur(){
		switch(this.position){
		case 6 : this.setPosition(14);
		case 12 : this.setPosition(30);
		case 15 : this.setPosition(5);
		case 16 : this.setPosition(26);
		case 24 : this.setPosition(18);
		case 29 : this.setPosition(13);
		}
	}
	
	public void questionJoueur(){
		quest.donnerQuestion(); //donne question ( à faire )
		if(quest.isReponse())  // Si il repond bien il pourra rejouer
			this.sonTour = true;
		else this.sonTour = false;
			
	}
	
	public void faireAction(int typeAction){
		if(typeAction == event.NO_ACTION)
			this.sonTour = false;
		if(typeAction == event.MOVE_ACTION){
			bougerJoueur();
			this.sonTour = false;
		}
		if(typeAction == event.QUEST_ACTION){
			questionJoueur();
		}
	}
}