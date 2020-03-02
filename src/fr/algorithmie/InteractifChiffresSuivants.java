package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public int[] chiffreSuivant(int num) {
		int[] tab = new int[10];
		for (int i = 0; i < 10; i++) {
			tab[i] = num + i;
		}
		return tab;
	}

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		System.out.println("Donnez moi un chiffre et je vous donnerai les 10 suivant !");
		int nb = saisie.nextInt();
		String rep = "N";
		System.out.println("Vous avez choisie : " + nb + ". Voulez vous continuer ? (O/N)");
		do {
			rep = saisie.nextLine();
		} while (rep != "o");

		InteractifChiffresSuivants interactifChiffresSuivants = new InteractifChiffresSuivants();
		int[] tabRep = interactifChiffresSuivants.chiffreSuivant(nb);
		for (int i = 0; i < 10; i++) {
			System.out.print(tabRep[i] + "/");

		}
		saisie.close();

	}

}
