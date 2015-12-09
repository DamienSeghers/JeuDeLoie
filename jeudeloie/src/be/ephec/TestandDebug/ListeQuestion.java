package be.ephec.TestandDebug;

import java.util.Scanner;

public class ListeQuestion {
	private boolean reponse;
	public int nombre = (int)(Math.random()*4);  //générer un nombre entre 0 et 3
	String tabQuestion[] = {"Question : 2+2 = ?",
							"Question : 18/2 = ?",
							"Question : 10*2 = ?",
							"Question : 8-2 = ?",}; //tableau des questions

	public boolean isReponse() {
		return reponse;
	}

	public void setReponse(boolean reponse) {
		this.reponse = reponse;
	}

	boolean donnerQuestion()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(tabQuestion[nombre]); //affiche la question
		int reponse = sc.nextInt(); //récuperer ce que l'on a écrit
		boolean resultat = false;  // initialise la variable du return
		
		switch (nombre) {
		case 0 :  { //case selon la question 
			if (reponse == 4){ //teste la reponse
				System.out.println("Bonne réponse !");
				resultat =true; 
			}
			break;
		}
		case 1 :  {
			if (reponse == 9){ 
				System.out.println("Bonne réponse !");
				resultat =true;
			}
			break;
		}
		case 2 :  {
			if (reponse == 20){ 
				System.out.println("Bonne réponse !");
				resultat =true;
			}
			break;
		}
		case 3 :  {
			if (reponse == 6){ 
				System.out.println("Bonne réponse !");
				resultat =true;
			}
			break;
		}
		default: {
			System.out.println("Mauvaise réponse !");
			resultat = false; 
			break;
			}
		}
		return resultat;
	}
}
