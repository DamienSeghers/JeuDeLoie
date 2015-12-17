package be.ephec.modele;

import javax.swing.JOptionPane;

public class ListeQuestion {
	
	//variable 
	
	private boolean resultat;
	public int nombre = (int)(Math.random()*4);  
	
	//tableau de question
	
	String tabQuestion[] = {"Question : 2+2 = ?",
							"Question : 18/2 = ?",
							"Question : 10*2 = ?",
							"Question : 8-2 = ?",}; 

	public boolean isReponse() {
		return resultat;
	}
	public void setReponse(boolean resultat) {
		this.resultat = resultat;
	}
	
	/**
	 * Méthode servant à poser la question au joueur
	 * @return resultat, détermine si la réponse est correcte ou non
	 */
	boolean donnerQuestion(){
		int reponse;
		String lecture = JOptionPane.showInputDialog(null,tabQuestion[nombre]); 
		reponse = Integer.parseInt(lecture);
		boolean resultat = false;
		
		switch (nombre) {
			case 0 :  {
				if (reponse == 4){resultat =true;}
				break;
		 	}
			case 1 :  {
				if (reponse == 9){resultat =true;}
				break;
		 	}
			case 2 :  {
				if (reponse == 20) {resultat =true;}
				break;
			}
			case 3 :  {
				if (reponse == 6) {resultat =true;}
				break;
		 	}
			default: {
				System.out.println("Bug tableau question");
				break;
			}
		}
		if (resultat == true) { 
			JOptionPane.showMessageDialog(null,"Bonne réponse !");
		}
		else {
			JOptionPane.showMessageDialog(null,"Mauvaise réponse !");
		}
		return resultat;
	}
}
