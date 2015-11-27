package fr.univnantes.alma.services.fournisseurservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fournisseur {
	List<Produit> listeProduits = new ArrayList<Produit>();
	Map<String,Integer> stock = new HashMap<String,Integer>();
	
	public Fournisseur(){
		this.ajouterProduit(new Produit("sardine","Sardine",300),1000);
		this.ajouterProduit(new Produit("brochet","Brochet",300),1000);
		this.ajouterProduit(new Produit("espadon","Espadon",300),1000);
		this.ajouterProduit(new Produit("saumon","Saumon",300),1000);
		this.ajouterProduit(new Produit("caviar","Caviar",300),1000);
		this.ajouterProduit(new Produit("crevette","Crevette",300),1000);
	}
	
	public void ajouterProduit(Produit p, int quantite){
		listeProduits.add(p);
		stock.put(p.getId(), quantite);
	}
	
	public List<Produit> getListeProduits() {
		return listeProduits;
	}
	
	public Produit getProduit(String id){
		for(Produit p : listeProduits){
			if(id.equalsIgnoreCase(p.getId())){
				return p;
			}
		}
		return null;
	}

	public void reserverProduit(String id, int quantite){
		Produit p = getProduit(id);
		if(p != null){
			p.setReserve(true);
		}
	}
	
	public void payerProduit(String id, int quantite){
		Produit p = getProduit(id);
		if(p.getReserve()){
			stock.put(id, stock.get(id) - quantite);
		}
	}
	
}
