package org.lesson.java.shop;

import java.util.ArrayList;

public class ProdottoCarrello{
	
	
	private ArrayList<String> prodottiCarrello = new ArrayList<String>();
	private ArrayList<Double> prezziCarrello = new ArrayList<Double>();
	


	//////////////////////////////////////
	//////////////PRODOTTI///////////////
	////////////////////////////////////
	
	
	public ProdottoCarrello() {
		
	}


	public void aggiungiProdotto(Prodotto prod) {
			
		prodottiCarrello.add(prod.getNome());

	}
	
	
	public void stampaCarrello() {
		
		int contatoreProdotti = 0;
		
		for (int i = 0; i < prodottiCarrello.size(); i++) {
			System.out.println("Prodotto " + contatoreProdotti + ": " +  prodottiCarrello.get(i));
			contatoreProdotti++;
			
		}
	}
	
	
	//////////////////////////////////////
	///////////////PREZZI////////////////
	////////////////////////////////////
	
	
	double totalePrezzi;
	double prezzoUnitario;
	
	public void aggiungiPrezzoCarrello(Prodotto prod) {
		
		 prezziCarrello.add(prod.getPrezzo());
		
		 prezzoUnitario = prezziCarrello.get(0);
		 
		totalePrezzi = totalePrezzi + prezzoUnitario;
	}
	
	
	
	public void stampaPrezzi() {
			
		
			
			System.out.println("Totale carrello: " + totalePrezzi );
						
	}
	

}
