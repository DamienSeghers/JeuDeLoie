package be.ephec.modele;

public class Event {
	
	//Constantes 
	
	public final int NO_ACTION = 0;
	public final int MOVE_ACTION = 1;
	public final int QUEST_ACTION = 2;
	
	
	/**
	 * Méthode vérifiant s'il y a une action sur la case
	 * @param position, un entier déterminant la position du joueur
	 * @return action, un entier déterminant l'action à faire
	 */
	
	public int checkEvent(int position){
		int action;
		switch (position){
			case 3: action = QUEST_ACTION; break;
			case 17: action = QUEST_ACTION; break;
			case 27: action = QUEST_ACTION; break;
			case 6 : action = MOVE_ACTION; break; 
			case 12 : action = MOVE_ACTION; break;
			case 15 : action = MOVE_ACTION; break;
			case 16 : action = MOVE_ACTION; break;
			case 24 : action = MOVE_ACTION; break;
			case 29 : action = MOVE_ACTION; break;
			default : action = NO_ACTION; break;
		}
		return action;
	}
	
}

