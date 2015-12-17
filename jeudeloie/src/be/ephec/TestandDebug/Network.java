package be.ephec.TestandDebug;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.IOException;
import java.net.InetAddress;

import javax.swing.*;

import be.ephec.Network.Client;
import be.ephec.Network.Serveur;

public class Network extends JFrame {
	
    private void displayNet() throws IOException, ClassNotFoundException {
    	this.setResizable(false);
		this.setTitle("Jeu de l'oie");
		this.setBounds(100, 100, 300, 300);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout(0,0));
		JPanel networkPanel = new JPanel();
		this.add(networkPanel,BorderLayout.CENTER);
    	JComboBox comboBox = new JComboBox();
    	networkPanel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Client", "Serveur"}));
		if (comboBox.getSelectedItem()=="Client") {
			JLabel lableClientSrvIP = new JLabel("Veuiller entrez l' adresse IP du serveur : ");
			JTextField fieldClientSrvIP = new JTextField();
			Client.client(fieldClientSrvIP.getText());
			networkPanel.add(lableClientSrvIP);
			networkPanel.add(fieldClientSrvIP);
		}
		else {
			JLabel srvInfo = new JLabel("L'adresse du serveur est : "  + Serveur.getSrvIP() + " et le port : " + Serveur.getSrvPort());
			networkPanel.add(srvInfo);
		}
	}
}
