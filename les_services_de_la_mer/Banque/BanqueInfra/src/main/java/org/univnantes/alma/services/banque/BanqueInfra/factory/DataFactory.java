package org.univnantes.alma.services.banque.BanqueInfra.factory;

import org.univnantes.alma.services.banque.API.factory.IDataFactory;
import org.univnantes.alma.services.banque.API.valueobject.ICompte;
import org.univnantes.alma.services.banque.BanqueDomain.valueobject.impl.Compte;

public class DataFactory implements IDataFactory {

	public ICompte getCompte(String IBAN, double solde) {
		return new Compte(solde,IBAN);
	}

}
