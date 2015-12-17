package be.ephec.Network;


import java.net.*;
import java.io.*;

public class Serveur {
	
	private String srvIP;
	private int srvPort;

	public void server (/*String[] args*/) throws IOException, ClassNotFoundException {
	
		ServerSocket server = new ServerSocket(6666);  // 0 pour port automatique
		srvIP = InetAddress.getLocalHost().getHostAddress();
		srvPort = server.getLocalPort();
		System.out.println("L'adresse du serveur est : " + InetAddress.getLocalHost().getHostAddress() + " et le port : " + server.getLocalPort());
		Socket socket = server.accept();
		ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
		ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
		System.out.println(input.readObject());
		socket.close();
		System.exit(0);
	}

	public String getSrvIP() {
		return srvIP;
	}
	
	public int getSrvPort() {
		return srvPort;
	}
}
