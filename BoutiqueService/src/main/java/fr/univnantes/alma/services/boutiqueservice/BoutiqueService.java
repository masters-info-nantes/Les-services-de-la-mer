package fr.univnantes.alma.services.boutiqueservice;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import fr.univnantes.alma.services.boutiqueservice.bankstub.BankStub;
import fr.univnantes.alma.services.boutiqueservice.bankstub.BankStub.Payer;
import fr.univnantes.alma.services.boutiqueservice.fournisseurstub.FournisseurStub;
import fr.univnantes.alma.services.boutiqueservice.fournisseurstub.FournisseurStub.GetListeProduits;
import fr.univnantes.alma.services.boutiqueservice.fournisseurstub.FournisseurStub.PayerProduit;
import fr.univnantes.alma.services.boutiqueservice.fournisseurstub.FournisseurStub.ReserverProduit;

public class BoutiqueService {
	private BankStub bankstub;
	private FournisseurStub fournisseurstub;
	
	public BoutiqueService() throws AxisFault{
		bankstub = new BankStub("http://localhost:9763/services/Bank/");
		fournisseurstub = new FournisseurStub("http://localhost:9763/services/Fournisseur/");
	}
	
	public void getListeProduits() throws RemoteException{
		GetListeProduits g = new GetListeProduits();
		fournisseurstub.getListeProduits(g).get_return();
	}
	
	public void reserverProduit(String id, int quantite) throws RemoteException{
		ReserverProduit r = new ReserverProduit();
		r.setId(id);
		r.setQuantite(quantite);
		fournisseurstub.reserverProduit(r);
	}
	
	public void payerProduit(String id, int quantite, String[] infoclient) throws RemoteException{
		PayerProduit p = new PayerProduit();
		p.setId(id);
		p.setQuantite(quantite);
		Payer pay = new Payer();
		pay.setNumero(infoclient[0]);
		pay.setCryptograme(infoclient[1]);
		pay.setDevise(infoclient[2]);
		pay.setMontant(quantite); //Changer pour avoir le vrai prix : montant produit * quantite
		if(bankstub.payer(pay).get_return()){fournisseurstub.payerProduit(p);}
	}
}
