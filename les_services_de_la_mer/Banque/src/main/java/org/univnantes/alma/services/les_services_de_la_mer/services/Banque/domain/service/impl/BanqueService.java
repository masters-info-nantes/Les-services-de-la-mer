package org.univnantes.alma.services.les_services_de_la_mer.services.Banque.domain.service.impl;

import org.univnantes.alma.services.les_services_de_la_mer.services.Banque.api.services.IBanqueService;

public class BanqueService implements IBanqueService {

	private double credit = 100;
	
	@Override
	public double getCredit() {
		return credit;
	}

	@Override
	public boolean payerEnLigne(String compte,double montant) {
		// TODO Auto-generated method stub
		return false;
	}

}
