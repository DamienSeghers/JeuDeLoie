package be.ephec.UserInterface;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;


public class Fenetre2 {

	private JFrame frmJeuDeLoie;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fenetre2 window = new Fenetre2();
					window.frmJeuDeLoie.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Fenetre2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJeuDeLoie = new JFrame();
		frmJeuDeLoie.setTitle("Jeu de l'oie");
		frmJeuDeLoie.setBounds(100, 100, 713, 560);
		frmJeuDeLoie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJeuDeLoie.setLocationRelativeTo(null);
		Fond fond = new Fond();
		frmJeuDeLoie.setContentPane(fond);
		System.out.println(frmJeuDeLoie.getSize());
		System.out.println(fond.getSize());
		
		JLabel labelTitle = new JLabel("Jeu de l'oie");
		labelTitle.setBounds(265, 10, 150, 40);
		labelTitle.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JLabel labelText1 = new JLabel("C'est au tour de : ");
		labelText1.setBounds(100, 60, 100, 15);
		
		JLabel labelText2 = new JLabel("JoueurName");
		labelText2.setBounds(500, 60, 150, 15);
		
		JButton boutonLancerDe = new JButton("Lancer dé");
		boutonLancerDe.setBounds(582, 80, 105, 25);
		
		fond.setLayout(null);
		fond.add(labelText2);
		fond.add(labelTitle);
		fond.add(labelText1);
		fond.add(boutonLancerDe);
	}

}
