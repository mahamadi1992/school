package sn.esmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.esmt.dao.IClientDao;
import sn.esmt.domaine.Client;
import sn.esmt.domaine.Compte;

@Service
public class ClientServiceImpl implements IClientService {
    @Autowired
	IClientDao daoClient;
	
	public void enregistrer(Client client) {
		daoClient.save(client);

	}

	public void supprimer(Long id) {
		daoClient.delete(id);

	}

	public Client chercher(Long id) {
		
		return daoClient.findOne(id);
	}

	public List<Client> chercherTous() {
		
		return daoClient.findAll();
	}

	public void modifier(Client client) {
		daoClient.save(client);

	}

	public List<Client> chercherParNom(String nom) {
		
		return daoClient.findByNom(nom);
	}

	public List<Client> chercherParPrenom(String prenom) {
		
		return daoClient.findByPrenom(prenom);
	}

	public Client chercherParAdresse(String adresse) {
		
		return daoClient.findByAdresse(adresse);
	}

	public String nomCompletClient(Client client) {
		
		return client.getNom()+" "+client.getPrenom();
	}

	public Boolean decouvertPossible(Client client) {
		if(client.getCompte().getTypeCompte()=="courant") {
			return true;
		}else {
			return false;
		}
	
	}


}
