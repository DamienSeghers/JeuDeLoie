package be.ephec.UserInterface;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;



public class Fenetre2 {

	private JFrame frmJeuDeLoie;

	
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
		fond.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		fond.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		panel.setOpaque(false);
		
		JLabel labelTitle = new JLabel("Jeu de l'oie");
		panel.add(labelTitle, BorderLayout.NORTH);
		labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		labelTitle.setFont(new Font("Tahoma", Font.PLAIN, 30));
		labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		
		JButton boutonLancerDe = new JButton("Lancer dé");
		panel.add(boutonLancerDe, BorderLayout.EAST);
		//boutonLancerDe.setSize(300, 50);  														//NOT WORK
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel_1.setOpaque(false);
		
		JLabel labelText1 = new JLabel("C'est au tour de : ");
		panel_1.add(labelText1);
		labelText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		
		JLabel labelText2 = new JLabel("JoueurName");
		panel_1.add(labelText2);
		
		JButton btnNewButton = new JButton("Relancer le jeu");
		//btnNewButton.setSize(new Dimension(500, 0));  											//NOT WORK
		btnNewButton.setSize(300, 50);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton, BorderLayout.WEST);
	}
	
	
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
}
