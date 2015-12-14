package be.ephec.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import net.miginfocom.swing.MigLayout; //A télécharger 

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
		frmJeuDeLoie.setResizable(false);
		frmJeuDeLoie.setTitle("Jeu de l'oie");
		frmJeuDeLoie.setBounds(100, 100, 1024, 627);
		frmJeuDeLoie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJeuDeLoie.setLocationRelativeTo(null);
		Fond fond = new Fond();
		frmJeuDeLoie.setContentPane(fond);
		fond.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		fond.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		panel.setOpaque(false);

		JLabel labelTitle = new JLabel("Jeu de l'oie");
		panel.add(labelTitle, BorderLayout.NORTH);
		labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		labelTitle.setFont(new Font("Tahoma", Font.PLAIN, 60));
		labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		JButton boutonLancerDe = new JButton("Lancer dé");
		boutonLancerDe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		//boutonLancerDe.setEnabled(false);
		panel.add(boutonLancerDe, BorderLayout.EAST);

		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel_1.setOpaque(false);

		JLabel labelText1 = new JLabel("C'est au tour de : ");
		panel_1.add(labelText1);
		labelText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		labelText1.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel labelText2 = new JLabel("JoueurName");	//ici doit arriver le nom du joueur actif...
		labelText2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(labelText2);

		JButton btnNewButton = new JButton("Relancer le jeu");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton, BorderLayout.WEST);

		JPanel panel_2 = new JPanel();
		fond.add(panel_2, BorderLayout.WEST);
		panel_2.setLayout(new MigLayout("", "65[85.00][85.00][85.00][85.00][85.00][85.00][85.00][85.00][85.00][85.00]", "15[85.00][85.00][85.00][85.00][85.00]"));
		panel_2.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
		panel_2.setOpaque(false);
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
					} 
				catch (Exception e) {
					e.printStackTrace();
				}
				}
			}
		); //fin EventQueue
	}
}