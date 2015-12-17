package be.ephec.controler;

import java.util.Scanner;
import java.awt.EventQueue;
import java.math.*; 
import be.ephec.modele.*;
import be.ephec.view.*;

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