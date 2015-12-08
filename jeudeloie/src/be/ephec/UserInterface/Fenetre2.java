package be.ephec.UserInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.BoxLayout;

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
		fond.setLayout(new BoxLayout(fond, BoxLayout.X_AXIS));
		
		JLabel labelTitle = new JLabel("Jeu de l'oie");
		labelTitle.setFont(new Font("Tahoma", Font.PLAIN, 30));
		frmJeuDeLoie.getContentPane().add(labelTitle);
		
		JLabel labelText1 = new JLabel("C'est au tour de :");
		frmJeuDeLoie.getContentPane().add(labelText1);
		
		JLabel labelText2 = new JLabel("");
		frmJeuDeLoie.getContentPane().add(labelText2);
		
		JButton boutonLancerDe = new JButton("Lancer dé");
		frmJeuDeLoie.getContentPane().add(boutonLancerDe);
	}

}
