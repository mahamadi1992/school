package sn.esmt.service;

import java.util.List;

import sn.esmt.domaine.Client;
import sn.esmt.domaine.Compte;

public interface IClientService {
 public void enregistrer(Client client);
 public void supprimer(Long id);
 public Client chercher(Long id) ;
 public List<Client> chercherTous();
 public void modifier(Client client);
 public List<Client> chercherParNom(String nom);
 public List<Client> chercherParPrenom(String prenom);
 public Client chercherParAdresse(String adresse);
 public String nomCompletClient(Client client);
 public Boolean decouvertPossible(Client client);
}
