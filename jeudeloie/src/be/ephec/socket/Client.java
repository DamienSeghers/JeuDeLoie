package be.ephec.socket;

import javax.swing.JOptionPane;
import java.net.*;
import java.io.*;

public class Client {
	/**
	 * Connexion du client vers le "client-hébergeur"
	 * 
	 * @param srvIP l'IP du "client-hébergeur"
	 * @throws IOException IP non-reconnue
	 */
	public static void main /*client*/ (String srvIP) throws IOException {
		String serverAddress = JOptionPane.showInputDialog("Adresse du Serveur SVP: ");
		String serverPort = JOptionPane.showInputDialog("Port du Serveur SVP: ");
		Socket socket = new Socket(srvIP/*serverAddress*/, 6666 /*Integer.parseInt(serverPort)*/);
		ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
		ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
		output.writeObject("Bonjour, je suis un client, et mon addresse IP est : "  + InetAddress.getLocalHost().getHostAddress());
		socket.close();
		System.exit(0);
	}

}
