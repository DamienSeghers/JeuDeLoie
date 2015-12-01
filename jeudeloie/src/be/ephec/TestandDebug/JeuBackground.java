package be.ephec.TestandDebug;

import java.util.Scanner;
import java.math.*;

public class JeuBackground {

	

	public static boolean poserQuestion(){ //pose une question

		Scanner sc = new Scanner(System.in);
		System.out.println("2 + 2 =");
		int reponse = sc.nextInt(); //récuperer ce que l'on a écrit
		if (reponse == 4){
			System.out.println("Tu es plus intelligent que je ne le pensais. Tu peux relancer le dé :D ");
			return true;
		}
		else {
			System.out.println("T'es qu'une merde ! tu restes sur place ;D");
			return false;
		}
	}

	public static int actionCase(int x){

		boolean repQuestion;
		switch (x){
		case 3: repQuestion = poserQuestion();
				if(repQuestion == true){
					x = x + LancerDe(); // relance le dé et ajoute le resultat à la position
					return actionCase(x);//revérifie l'action de la nouvelle case
				}
				else {
					return x;
				}
		case 17: repQuestion = poserQuestion();
				 if(repQuestion == true){
					 x = x + LancerDe();
					 return actionCase(x);
				 }
				 else {
					 return x;
				 }
		case 27: repQuestion = poserQuestion();
				 if(repQuestion == true){
					 x = x + LancerDe();
					 return actionCase(x);
				 }
				 else {
					 return x;
				 }
		case 6 : return 14; //change la position du joueur
		case 12 : return 30; 
		case 16 : return 26;
		case 15 : return 5;
		case 24 : return 18;
		case 29 : return 13;
		default : return x;
		}
	}

	public static int LancerDe(){
		int y = (int)(Math.random()*6)+1; // random 1 -> 6
		System.out.println("dé = " + y);
		return y;
	}


	public static void main(String[] args) {
		
		int i, cpt =0;
		Joueur player1 = new Joueur();
		int nbrDe = 0;

		do {
			nbrDe = LancerDe();
			player1.position = player1.position + nbrDe; //change la position après le lancer de dé
			/*
			 * Question prof : Action WTF ?
			 */
			player1.position = actionCase(player1.position); //vérifie 
			cpt = cpt +1;
			System.out.println("position = " + player1.position);
			System.out.println("Fin du tour"+cpt);
			
			
		}
		while (player1.position < 31);
		
		System.out.println("Bravo Tu as fini le jeu Connard ... ");
	}
}
