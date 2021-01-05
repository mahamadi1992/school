package sn.esmt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.esmt.domaine.Compte;
@Repository
public interface ICompteDao extends JpaRepository<Compte, Long> {

	public List<Compte> findByTypeCompte(String type);
	public List<Compte> findByMontant(double montant);
}
