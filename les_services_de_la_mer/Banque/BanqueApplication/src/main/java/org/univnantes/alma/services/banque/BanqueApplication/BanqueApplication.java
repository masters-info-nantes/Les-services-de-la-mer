package org.univnantes.alma.services.banque.BanqueApplication;

import org.univnantes.alma.services.banque.API.services.IBanqueService;
import org.univnantes.alma.services.banque.BanqueDomain.service.impl.BanqueService;
import org.univnantes.alma.services.banque.BanqueInfra.factory.DataFactory;

public class BanqueApplication {
	
	public static IBanqueService banque = null;
	public boolean payer(String compteDebit, double somme) {
		if(banque == null){
			banque = new BanqueService(new DataFactory());
		}
		return banque.payerEnLigne(compteDebit, somme);
	}	
}
