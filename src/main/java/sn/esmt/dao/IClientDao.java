package sn.esmt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.esmt.domaine.Client;
import sn.esmt.domaine.Compte;

@Repository
public interface IClientDao extends JpaRepository<Client, Long> {
public List<Client> findByNom(String nom);
public List<Client> findByPrenom(String prenom);
public Client findByAdresse(String adresse);
}
