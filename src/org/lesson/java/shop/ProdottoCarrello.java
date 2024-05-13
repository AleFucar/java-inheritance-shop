package org.lesson.java.shop;

import java.util.ArrayList;

public class ProdottoCarrello extends Prodotto{
	
	
	private ArrayList<String> prodottiCarrello = new ArrayList<String>();

	

	
	
	
	public ProdottoCarrello(String name) {
		super(name);
	}



	
	public void aggiungiProdotto() {
			
		prodottiCarrello.add(super.getNome());

	}
	
	
	public void stampaCarrello() {
		
		for (int i = 0; i < prodottiCarrello.size(); i++) {
			System.out.println("Prodotto: " + prodottiCarrello.get(i));
			
		}
	}
	

}
