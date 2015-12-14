package be.ephec.UserInterface;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import net.miginfocom.swing.MigLayout;


public class Fenetre {

	private JFrame frmJeuDeLoie;

	/**
	 * Create the application.
	 */
	public Fenetre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJeuDeLoie = new JFrame();
		frmJeuDeLoie.setResizable(false);										//empeche de changer la taille de la fenetre
		frmJeuDeLoie.setTitle("Jeu de l'oie");
		frmJeuDeLoie.setBounds(100, 100, 1024, 627);							//taille de la fenetre
		frmJeuDeLoie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJeuDeLoie.setLocationRelativeTo(null);								//centre la fenetre automatiquement
		Fond fond = new Fond();
		frmJeuDeLoie.setContentPane(fond);
		fond.setLayout(new BorderLayout(0, 0));

		JPanel head = new JPanel();
		fond.add(head, BorderLayout.NORTH);
		head.setLayout(new BorderLayout(0, 0));
		head.setOpaque(false);													//rend le jpanel transparent

		JLabel labelTitle = new JLabel("Jeu de l'oie");
		head.add(labelTitle, BorderLayout.NORTH);
		labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		labelTitle.setFont(new Font("Tahoma", Font.PLAIN, 60));					//change la police du texte
		labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		JButton boutonLancerDe = new JButton("Lancer dé");
		boutonLancerDe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		//boutonLancerDe.setEnabled(false);										//desactive le bouton pour le(s) joueur(s) dont c'est pas le tour
		head.add(boutonLancerDe, BorderLayout.EAST);

		JPanel joueurTour = new JPanel();
		head.add(joueurTour, BorderLayout.CENTER);
		joueurTour.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		joueurTour.setOpaque(false);
		
		JLabel jlabelJoueurTour = new JLabel("C'est au tour de : ");
		joueurTour.add(jlabelJoueurTour);
		jlabelJoueurTour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jlabelJoueurTour.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel jlableJoueurName = new JLabel("JoueurName");									//ici doit arriver le nom du joueur actif...
		jlableJoueurName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		joueurTour.add(jlableJoueurName);

		JButton boutonRejouer = new JButton("Relancer le jeu");
		boutonRejouer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		head.add(boutonRejouer, BorderLayout.WEST);

		JPanel grille = new JPanel();
		fond.add(grille, BorderLayout.WEST);
		grille.setLayout(new MigLayout("", "65[85.00][85.00][85.00][85.00][85.00][85.00][85.00][85.00][85.00][85.00]", "15[85.00][85.00][85.00][85.00][85.00]"));
			/*
			 * "","",""
			 * parametre general du layout,
			 * parametres des lignes [taille en px],
			 * parametres des colonnes [taille en px]
			 */
		grille.setOpaque(false);
	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fenetre window = new Fenetre();
					window.frmJeuDeLoie.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
