package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
	public int lePlusGrand(int[] array) {
		int nbMax = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {

			if (array[i] > nbMax) {
				nbMax = array[i];
			}
		}
		return nbMax;

	}

	public static void main(String[] args) {
		int[] tab = new int[10];
		int num = 0;
		int highterNum;
		InteractifPlusGrand interactifPlusGrand = new InteractifPlusGrand();

		System.out.println("Bonjour, je suis un programme qui demande ");
		System.out.println("10 nombres à un utilisateur et qui affiche le plus grand de ces nombres.");
		Scanner saisie = new Scanner(System.in);

		// Constitution du tableau
		for (int i = 1; i < 10; i++) {
			System.out.println("chiffre n° " + i + " : ");
			num = saisie.nextInt();
			tab[i - 1] = num;
		}

		// Test Tableau affichage
		System.out.println("Vos précédentes entrées sont : ");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + "  ");
		}
		System.out.println();
		System.out.println();
		highterNum = interactifPlusGrand.lePlusGrand(tab);
		System.out.println("Le chiffre le plus grand est " + highterNum);

	}

}
