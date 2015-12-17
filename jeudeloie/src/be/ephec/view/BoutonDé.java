package be.ephec.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class BoutonD� extends JButton implements ActionListener{
	
	//variable
	
	private boolean clickDe = false;
	
	/**
	 * M�thode affichant le bouton du d�
	 */
	
	public BoutonD�(){
		this.setText("Lancer d�");
		this.setFont(new Font("Tahoma", Font.PLAIN, 15));
		this.addActionListener((ActionListener) this);
	}
	

	public boolean isClickDe() {
		System.out.print("");
		return clickDe;
	}
	public void setClickDe(boolean activationDe) {
		this.clickDe = activationDe;
	}
	
	public void actionPerformed(ActionEvent e) {
		this.clickDe = true;
	}

}
