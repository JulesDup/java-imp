package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		int num;
		int numTotal = 0;
		System.out.println("Bonjour, je suis un programme qui demande un nombre à l’utilisateur");
		System.out.println("puis calcule la somme de tous les entiers compris entre 1 et ce nombre.");
		System.out.println("Donnez moi un nombre ! ");
		num = saisie.nextInt();
		for (int i = 0; i < num+1; i++) {
			numTotal += i;
		}
		System.out.println("Vous avez choisi " + num + ". Le resultat est " + numTotal);

	}
}
