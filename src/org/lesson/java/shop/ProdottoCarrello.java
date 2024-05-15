package org.lesson.java.shop;

import java.util.ArrayList;
import java.util.Iterator;

public class ProdottoCarrello{
	
	
	private ArrayList<String> prodottiCarrello = new ArrayList<String>();
	private ArrayList<Double> prezziCarrello = new ArrayList<Double>();
	


	//////////////////////////////////////
	//////////////PRODOTTI///////////////
	////////////////////////////////////
	
	
	public ProdottoCarrello() {
		
	}

	
	double totalePrezzi;
	double prezzoUnitario;

	public void aggiungiProdotto(Prodotto prod) {
			
		prodottiCarrello.add(prod.getNome());
		
		 prezziCarrello.add(prod.getPrezzo());
			
		 prezzoUnitario = prezziCarrello.get(0);
		 
		totalePrezzi = totalePrezzi + prezzoUnitario;

	}
	
	
	public void stampaCarrello() {
		
		
		for (int i = 0; i < prodottiCarrello.size(); i++) {
			System.out.println("Prodotto " + i + ": " +  prodottiCarrello.get(i));
		}
	}
	
	
	//////////////////////////////////////
	///////////////PREZZI////////////////
	////////////////////////////////////
	
	
	public void stampaPrezzi() {
			
		
			
			System.out.println("Totale carrello: " + totalePrezzi );
						
	}
	
	
	public void svuotaCarrello() {
			
			prodottiCarrello.removeAll(prodottiCarrello);
			
			totalePrezzi = 0;

		
	}
	

}
