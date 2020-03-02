package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		int secretNb = new Random().nextInt(100) + 1;
		Scanner saisie = new Scanner(System.in);

		System.out.println("Vous jouez au jeu du plus ou mois !");
		System.out.println("Le chiffre à deviner est entre 1 et 100");
		System.out.println("Quelle est le chiffre ? ");
		int numEntre;
		int compteur = 0;

		do {
			numEntre = saisie.nextInt();
			compteur++;
			if (numEntre > secretNb) {
				System.out.println("c'est moin !");
			} else if (numEntre < secretNb) {
				System.out.println("c'est plus");
			}
		} while (numEntre != secretNb);
		System.out.println("Bravo, le chiffre était : " + secretNb + ".");
		System.out.println("Tu as gagnez en : " + compteur + " coups !");
	}

}
