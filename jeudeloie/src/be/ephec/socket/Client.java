package be.ephec.Socket;
import javax.swing.JOptionPane;
import java.net.*;
import java.io.*;

public class Client {
	public static void main(String[] args) throws IOException {
		String serverAddress = JOptionPane.showInputDialog("Adresse du Serveur SVP: ");
		String serverPort = JOptionPane.showInputDialog("Port du Serveur SVP: ");
		Socket socket = new Socket(serverAddress, Integer.parseInt(serverPort));
		ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
		output.writeObject("Bonjour, je suis un client, et mon addresse IP est : "  + InetAddress.getLocalHost().getHostAddress());
		socket.close();
		System.exit(0);
	}

}
