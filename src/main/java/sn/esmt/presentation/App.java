package sn.esmt.presentation;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sn.esmt.domaine.Client;
import sn.esmt.domaine.Compte;
import sn.esmt.service.ClientServiceImpl;
import sn.esmt.service.CompteServiceImpl;



public class App {

	public static void main(String[] args) {
		ApplicationContext context = (ApplicationContext) new ClassPathXmlApplicationContext("beans.xml");
     
		CompteServiceImpl rep = (CompteServiceImpl) context.getBean("compteServiceImpl");
		ClientServiceImpl cl= context.getBean(ClientServiceImpl.class);
		//rep.enregistrer(new Compte("courant",1000.0));
		Client client1=null;
		Compte compte=new Compte((long) 2,"courant",1000.0);
		Client client=new Client("Ouedraogo","Mahamadi","Niary tally",compte);
		cl.enregistrer(client);
		client1=cl.chercher((long) 1);
		System.out.println(client1.getCompte().getMontant());

	}

}
