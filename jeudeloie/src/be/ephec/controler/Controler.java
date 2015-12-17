package be.ephec.controler;

import java.awt.EventQueue;
import be.ephec.modele.*;

public class Controler {
	
	public static void main(String[] args) {
		Board plateau = new Board();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					plateau.fen.setVisible(true);
				} catch (Exception e) { 
					e.printStackTrace();
				} 
			}
		});
		plateau.lancerJeu();
	}
}