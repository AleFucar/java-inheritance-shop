package org.lesson.java.shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {



		Prodotto prodottoNuovo = new Prodotto();
		
		
		

		



		

		System.out.println("Nome prodotto: " + prodottoNuovo.setNome("Latte") + "-" + prodottoNuovo.getCodice());
		
		System.out.println("Descrizione: " + prodottoNuovo.setDescrizione("Ciola") );
		
		System.out.println("Codice prodotto: " + prodottoNuovo.getCodice());
		
		System.out.println("Prezzo base: " + prodottoNuovo.setPrezzo(10.0));
		
		System.out.println("Prezzo ivato: " + prodottoNuovo.prezzoIvato());
		
		
		

	}

}
