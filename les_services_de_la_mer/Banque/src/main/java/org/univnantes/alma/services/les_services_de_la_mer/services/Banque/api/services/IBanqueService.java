package org.univnantes.alma.services.les_services_de_la_mer.services.Banque.api.services;

public interface IBanqueService {
	double getCredit();
	boolean payerEnLigne(String compte, double montant);
}