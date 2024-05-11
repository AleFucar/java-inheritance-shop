package org.lesson.java.shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		for (String inizio = "" ; inizio == "No" || inizio == "no";) {

			System.out.println("Benvenuto! Vuole vedere i nostri prodotti disponibili? (Risponda con Si o No)");
			
			inizio = scan.nextLine(); 

			if (inizio == "Si" || inizio == "si") {

				System.out.println("\nScrivi il nome del prodotto di cui vuoi sapere le specifiche...");
				System.out.println("-Iphone\n" + "-GalaxyS23\n" + "-SamsungTV50\n" + "-LgTV75\n" + "-BoseLink\n");

				String prodottoInput = scan.nextLine();
				Prodotto prodottoScelto = null;

				switch (prodottoInput) {
				case "Iphone":
					prodottoScelto = new Smartphone("Iphone 15 Pro", "Iphone", "AAAAAA BB CCCCCC D", 128, 1200);
					System.out.println(prodottoScelto.toString());
					break;

				case "GalaxyS23":
					prodottoScelto = new Smartphone("Samsung Galaxy s23", "Samsung", "AAAAAA BB CCCCCC D", 254, 1600);
					System.out.println(prodottoScelto.toString());
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
					System.out.println("Inserimento errato, riprova...");
					break;
				}

			} else {
				System.out.println("Va bene, Alla prossima allora, Buona giornata!");
			}

		}

	}
}


