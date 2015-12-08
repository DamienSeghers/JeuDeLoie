package be.ephec.TestandDebug;

import java.util.Scanner;

public class ListeQuestion {
	private boolean reponse;
	public int nombre = (int)(Math.random()*5)+1;  //générer un nombre entre 1 et 3
	//array pour les questions
	String tabQuestion[] = {"Question : 2+2 = ?","Question : 18/2 = ?","Question : 10*2 = ?","Question : 6+2 = ?","Question : 15-2 = ?"};

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
		switch(reponse){
		case 4:
			System.out.println("Bonne réponse !");
			break;
		case 9:
			System.out.println("Bonne réponse !");
			break;
		case 20:
			System.out.println("Bonne réponse !");
			break;
		case 8:
			System.out.println("Bonne réponse !");
			break;
		case 13:
			System.out.println("Bonne réponse !");
			break;
		default:
			System.out.println("Mauvaise réponse !!!!");
		}
		return false;
	}
}
