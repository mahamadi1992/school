package sn.esmt.service;

import java.util.List;

import sn.esmt.domaine.Compte;


public interface ICompteService {
	 public void enregistrer(Compte client);
	 public void supprimer(Long id);
	 public Compte chercher(Long id) ;
	 public List<Compte> chercherTous();
	 public void modifier(Compte client);
	 public List<Compte> chercherParTypeCompte(String type);
	 public List<Compte> chercherParMontant(double montant);
}
