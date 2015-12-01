package be.ephec.Controler;

import javax.swing.JFrame;
import be.ephec.UserInterface.*;
import be.ephec.Controler.*;

public class Test {
	
	public static int LancerDe(){ //lance le dé
		
		return (int)(Math.random()*6)+1; // random 1 -> 6
		
	}

	public static void main(String[] args) {
		
		Fenetre fen = new Fenetre();
		System.out.println("dé = " + LancerDe());
	}
}
