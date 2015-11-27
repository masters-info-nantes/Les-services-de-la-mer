package org.univnantes.alma.services.les_services_de_la_mer.services.Banque.application;

import org.univnantes.alma.services.les_services_de_la_mer.services.Banque.api.services.IBanqueService;
import org.univnantes.alma.services.les_services_de_la_mer.services.Banque.domain.service.impl.BanqueService;
import org.univnantes.alma.services.les_services_de_la_mer.services.Banque.infra.factory.DataFactory;

public class BanqueApplication {
	
	public static IBanqueService banque = null;
	public boolean payer(String compteDebit, double somme) {
		if(banque == null){
			banque = new BanqueService(new DataFactory());
		}
		return banque.payerEnLigne(compteDebit, somme);
	}	
}
