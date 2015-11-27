package org.univnantes.alma.services.les_services_de_la_mer.services.Banque.domain.valueobject.impl;

import org.univnantes.alma.services.les_services_de_la_mer.services.Banque.api.valueobject.ICompte;

public class Compte implements ICompte {

	private double value;
	private String metadata;
	
	public Compte(double value, String metadata) {
		super();
		this.value = value;
		this.metadata = metadata;
	}

	@Override
	public double getSolde() {
		return value;
	}

	@Override
	public String getMetadata() {
		return metadata;
	}

}
