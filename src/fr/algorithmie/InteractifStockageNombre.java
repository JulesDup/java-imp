package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {
	private int[] enregistrerNombre(int chiffre, int[] tab) {
		int[] tab2 = new int[tab.length + 1];
		for (int j = 0; j < tab2.length - 1; j++) {
			tab2[j] = tab[j];
		}
		tab2[tab2.length - 1] = chiffre;
		return tab2;
	}

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		int num = 0;
		int[] tab = new int[1];
		InteractifStockageNombre interactifStockageNombre = new InteractifStockageNombre();
		System.out.println("choisisez une option :\n 1 : Ajouter un nombre \n 2 : Afficher les nombres \n 3 : Quitter");

		do {
			System.out.println("choisisez une option : ");
			saisie.reset();
			num = saisie.nextInt();
			if (num == 1) {
				System.out.println("quel est votre chiffre ?");
				int chiffre = saisie.nextInt();
				// initalisation du tableau pour la premiere valeur
				if (tab.length == 1 && tab[0] == 0) {
					tab[0] = chiffre;
					// Remplisage tableau +1
				} else {
					tab = interactifStockageNombre.enregistrerNombre(chiffre, tab);
				}
			}

			if (num == 2) {
				// Visualisation tableau
				for (int i = 0; i < tab.length; i++) {
					System.out.println(tab[i]);
				}
			}

		} while (num != 2 || num != 1);
		saisie.close();
		System.out.println("vous avez quitté. ");

	}

}
