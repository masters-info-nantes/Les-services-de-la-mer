package org.univnantes.alma.services.les_services_de_la_mer.services.Banque.domain.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.univnantes.alma.services.les_services_de_la_mer.services.Banque.api.factory.IDataFactory;
import org.univnantes.alma.services.les_services_de_la_mer.services.Banque.api.services.IBanqueService;
import org.univnantes.alma.services.les_services_de_la_mer.services.Banque.api.valueobject.ICompte;

public class BanqueService implements IBanqueService {

	private Map<String, ICompte> comptes;
	
	public BanqueService(IDataFactory factory) {
		
		comptes = new HashMap<String, ICompte>();
		//valeurs pour test
		ICompte client = factory.getCompte("client", 1000),
				boutique = factory.getCompte("boutique", 1000);
		comptes.put("client", client);
		comptes.put("boutique", boutique);
	}
	

	@Override
	public boolean payerEnLigne(String compte,double montant) {
		// TODO Auto-generated method stub
		return false;
	}

}
