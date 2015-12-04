package org.univnantes.alma.services.banque.BanqueDomain.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.univnantes.alma.services.banque.API.factory.IDataFactory;
import org.univnantes.alma.services.banque.API.services.IBanqueService;
import org.univnantes.alma.services.banque.API.valueobject.ICompte;

public class BanqueService implements IBanqueService {

	private Map<String, ICompte> comptes;
	
	public BanqueService(IDataFactory factory) {
		
		comptes = new HashMap<String, ICompte>();
		ICompte client = factory.getCompte("client", 1000),
				boutique = factory.getCompte("boutique", 1000);
		comptes.put("client", client);
		comptes.put("boutique", boutique);
	}
	

	public boolean payerEnLigne(String compte,double montant) {
		if(comptes.get(compte).getSolde()<montant){
			return true;
		}else{
			return false;
		}
		
	}

}
