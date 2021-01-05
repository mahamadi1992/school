package sn.esmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.esmt.dao.ICompteDao;
import sn.esmt.domaine.Compte;

@Service
public class CompteServiceImpl implements ICompteService {
  
	@Autowired
	ICompteDao compteDao;
	public void enregistrer(Compte client) {
		compteDao.save(client);

	}

	public void supprimer(Long id) {
		compteDao.delete(id);

	}

	public Compte chercher(Long id) {
		
		return compteDao.getOne(id);
	}

	public List<Compte> chercherTous() {
		
		return compteDao.findAll();
	}

	public void modifier(Compte client) {
		compteDao.save(client);

	}

	public List<Compte> chercherParTypeCompte(String type) {
		
		return compteDao.findByTypeCompte(type);
	}

	public List<Compte> chercherParMontant(double montant) {
		
		return compteDao.findByMontant(montant);
	}

}
