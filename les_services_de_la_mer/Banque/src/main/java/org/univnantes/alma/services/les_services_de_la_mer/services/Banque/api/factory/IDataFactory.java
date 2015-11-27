package org.univnantes.alma.services.les_services_de_la_mer.services.Banque.api.factory;

import org.univnantes.alma.services.les_services_de_la_mer.services.Banque.api.valueobject.ICompte;

public interface IDataFactory {
	public ICompte getCompte(String IBAN, double solde);
}
