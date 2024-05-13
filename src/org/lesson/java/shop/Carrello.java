package org.lesson.java.shop;

import java.util.Scanner;

public class Carrello {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String inizio = "no";
		
		
			for (inizio.equals("si");inizio.equals("no"); inizio = "no") {
							
			System.out.println("\nVuole procedere nel vedere la nostra lista prodotti? (Risponda con Si o No)");
			inizio = scan.nextLine();

			if (inizio.equals("Si") || inizio.equals("si") || inizio.equals("SI") || inizio.equals("sI")) {

				System.out.println("\nScrivi il nome del prodotto di cui vuoi sapere le specifiche...");
				System.out.println("-Iphone\n" + "-GalaxyS23\n" + "-SamsungTV50\n" + "-LgTV75\n" + "-BoseLink\n");

				String prodottoInput = scan.nextLine();
				Prodotto prodottoScelto = null;

				switch (prodottoInput) {
				case "Iphone":
					prodottoScelto = new Smartphone("Iphone 15 Pro", "Iphone", "AAAAAA BB CCCCCC D", 128, 1200);
					System.out.println(prodottoScelto.toString());
					
					ProdottoCarrello prodottoInserito = new ProdottoCarrello(prodottoInput);
					prodottoInserito.aggiungiProdotto();
					prodottoInserito.stampaCarrello();					
					break;

				case "GalaxyS23":
					prodottoScelto = new Smartphone("Samsung Galaxy s23", "Samsung", "AAAAAA BB CCCCCC D", 254, 1600);
					System.out.println(prodottoScelto.toString());
					
					prodottoInserito = new ProdottoCarrello(prodottoInput);
					prodottoInserito.aggiungiProdotto();
					prodottoInserito.stampaCarrello();	
					break;

				case "SamsungTV50":
					prodottoScelto = new Televisori("Samsung Tv 50'", "Samsung", 1000, 118, 120, false);
					System.out.println(prodottoScelto.toString());
					break;

				case "LgTV75":
					prodottoScelto = new Televisori("Lg Tv 75'", "Lg", 1800, 125, 175, true);
					System.out.println(prodottoScelto.toString());
					break;

				case "BoseLink":
					prodottoScelto = new Cuffie("Bose Lik", "Bose", 200, "Black", false);
					System.out.println(prodottoScelto.toString());
					break;

				default:
					System.out.println("Inserimento nome del prodotto errato, riprova...");
					break;
				}

			} 
			else if(inizio.equals("no") || inizio.equals("No") || inizio.equals("nO") || inizio.equals("NO")) {
				System.out.println("Va bene, Alla prossima allora, Buona giornata!");
				break;
			}else {
				System.out.println("Inserimento errato, riprova...");
			}
		}
	}
}

