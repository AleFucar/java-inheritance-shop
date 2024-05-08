package org.lesson.java.shop;


public class Main {

	public static void main(String[] args) {

		Prodotto prodottoNuovo = new Prodotto("Pc portatile", "Asus", 500);
		System.out.println(prodottoNuovo.toString());

		System.out.println("\n");

		Prodotto sma = new Smartphone("Iphone 15 Pro", "Iphone", "AAAAAA BB CCCCCC D", 128, 1200);

		System.out.println(sma.toString());

		Prodotto sma2 = new Smartphone("Samsung Galaxy s23", "Samsung", "AAAAAA BB CCCCCC D", 254, 1600);

		System.out.println("\n");

		System.out.println(sma2.toString());

	}

}
