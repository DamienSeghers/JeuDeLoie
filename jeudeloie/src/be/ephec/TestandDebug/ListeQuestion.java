package be.ephec.TestandDebug;

import java.util.Scanner;

class ListeQuestion {
	private boolean reponse;
	
	public boolean isReponse() {
		return reponse;
	}

	public void setReponse(boolean reponse) {
		this.reponse = reponse;
	}

	void donnerQuestion()
	{
		
	}
}


/*
*	public static boolean poserQuestion(){ //pose une question

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
*/