package be.ephec.Network;

import java.util.Calendar;
import be.ephec.Network.InterfaceGraphiqueServeur;
import be.ephec.Network.ClientCoteServeur;
import be.ephec.Network.ServeurSocket;

public class ApplicationServeur {
	private InterfaceGraphiqueServeur interfaceGraphiqueServeur;
	private ServeurSocket serveurSocket;
	public ApplicationServeur(){
		interfaceGraphiqueServeur = new InterfaceGraphiqueServeur(this);
	}
	public static void main(String[] args) {
		ApplicationServeur ma = new ApplicationServeur();
	}
	// Les m�thodes utiles
	public void traiteClientConnecte(ClientCoteServeur ccs){
		getInterfaceGraphiqueServeur().ajouteDansLaConsole(
				Console.getInviteDeCommande()+"On a re�u le client num�ro "+
				ccs.getNum()+"\n");
		getInterfaceGraphiqueServeur().ajouteClientJComboBox(ccs);
	}

	public void traiteObjetRecu(ClientCoteServeur ccs,Object object){
		Calendar cal = Calendar.getInstance();
		getInterfaceGraphiqueServeur().ajouteDansLaConsole(
				Console.getInviteDeCommande()+"> Re�u du client "+ 
				ccs.getNum()+" : "+object.toString()+"\n");
	}

	public void traiteObjetAEnvoyer(ClientCoteServeur ccs,Object o){
		getServeurSocket().ecrireSurUnClient(ccs, o);
	}

	public void traiteObjetAEnvoyerATousLesClients(Object o){
		getServeurSocket().ecrirSurTousLesClients(o);
	}

	public void traiteClientDeconnecte(ClientCoteServeur ccs){
		getInterfaceGraphiqueServeur().supprimeClientJComboBox(ccs);
	}

	// Les getteurs et les setteurs
	public InterfaceGraphiqueServeur getInterfaceGraphiqueServeur() {
		return interfaceGraphiqueServeur;
	}
	public void setInterfaceGraphiqueServeur(InterfaceGraphiqueServeur interfaceGraphiqueServeur) {
		this.interfaceGraphiqueServeur = interfaceGraphiqueServeur;
	}
	public ServeurSocket getServeurSocket() {
		return serveurSocket;
	}
	public void setServeurSocket(ServeurSocket serveurSocket) {
		this.serveurSocket = serveurSocket;
	}
}


