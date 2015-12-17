package be.ephec.Socket;


import java.net.*;
import java.io.*;

public class Serveur {

public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	ServerSocket server = new ServerSocket(0);
	System.out.println("L'adresse du serveur est : " + InetAddress.getLocalHost().getHostAddress() + " et le port : " + server.getLocalPort());
	Socket socket = server.accept();
	ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
	System.out.println(input.readObject());
	socket.close();
	System.exit(0);
	}
	
}
