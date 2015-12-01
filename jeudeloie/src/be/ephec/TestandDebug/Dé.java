package be.ephec.TestandDebug;

public class Dé{
	private int resultat;
	public void lancerDe(){
		this.resultat = (int)(Math.random()*6)+1;
	}
	public int getResultat()
	{
		return this.resultat;
	}
}

