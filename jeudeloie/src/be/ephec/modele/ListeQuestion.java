
package be.ephec.modele;

import java.util.Scanner;

public class ListeQuestion {
	private boolean resultat;
	public int nombre = (int)(Math.random()*4);  //g�n�rer un nombre entre 0 et 3
	String tabQuestion[] = {"Question : 2+2 = ?",
							"Question : 18/2 = ?",
							"Question : 10*2 = ?",
							"Question : 8-2 = ?",}; //tableau des questions

	public boolean isReponse() {
		return resultat;
	}

	public void setReponse(boolean resultat) {
		this.resultat = resultat;
	}

	boolean donnerQuestion(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println(tabQuestion[nombre]); //affiche la question
		int reponse = sc.nextInt(); //r�cuperer ce que l'on a �crit
		boolean resultat = false;  // initialise la variable du return
		
		switch (nombre) {
		case 0 :  {
			if (reponse == 4){
				resultat =true; //teste la reponse
			}
			break;
		 }
		case 1 :  {
			if (reponse == 9){
				resultat =true;
			}
			break;
		 }
		case 2 :  {
			if (reponse == 20) {
				resultat =true;
			}
			break;
		 }
		case 3 :  {
			if (reponse == 6) {
				resultat =true;
			}
			break;
		 }
		default: {
			System.out.println("Bug tableau question OMG OMG OMG OMG ");
			break;
		 }
		}
		if (resultat == true) { // ici c'�tait la faute avec le doucle =
			System.out.println("Bonne r�ponse !");
		}
		else {
			System.out.println("Mauvaise r�ponse !");
		}
		return resultat;
	}
}