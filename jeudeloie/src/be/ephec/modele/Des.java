package be.ephec.modele;

public class Des{
	
	//variable 
	
	private int resultat;
	
	/**
	 * Méthode servant à lancer le dé 
	 */
	public void lancerDe(){
		this.resultat = (int)(Math.random()*6)+1;
	}
	
	public int getResultat()
	{
		return this.resultat;
	}
}

