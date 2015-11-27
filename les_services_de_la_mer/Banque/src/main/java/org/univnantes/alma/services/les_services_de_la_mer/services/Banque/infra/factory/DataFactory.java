package org.univnantes.alma.services.les_services_de_la_mer.services.Banque.infra.factory;

import org.univnantes.alma.services.les_services_de_la_mer.services.Banque.api.factory.IDataFactory;
import org.univnantes.alma.services.les_services_de_la_mer.services.Banque.api.valueobject.ICompte;
import org.univnantes.alma.services.les_services_de_la_mer.services.Banque.domain.valueobject.impl.Compte;

public class DataFactory implements IDataFactory {

	@Override
	public ICompte getCompte(String IBAN, double solde) {
		// TODO Auto-generated method stub
		return new Compte(solde,IBAN);
	}

}
