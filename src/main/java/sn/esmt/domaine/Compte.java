package sn.esmt.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Compte {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
 private Long id;
 private String typeCompte;
 private double montant;
 
public Compte() {}
public Compte(Long id, String typeCompte, double montant) {
	super();
	this.id = id;
	this.typeCompte = typeCompte;
	this.montant = montant;
}
public Compte(String typeCompte, double montant) {
	super();
	this.typeCompte = typeCompte;
	this.montant = montant;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getTypeCompte() {
	return typeCompte;
}
public void setTypeCompte(String typeCompte) {
	this.typeCompte = typeCompte;
}
public double getMontant() {
	return montant;
}
public void setMontant(double montant) {
	this.montant = montant;
}
 
 
}
