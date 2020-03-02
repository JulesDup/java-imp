package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {
	private int[] enregistrerNombre(int chiffre, int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == 0) {
				tab[i] = chiffre;
			} else {
				InteractifStockageNombre interactifStockageNombre = new InteractifStockageNombre();
				tab = interactifStockageNombre.agrandirTableau(tab, chiffre);
			}
		}
		return tab;
	}

//	private void afficherNombre(int[] tab) {
//		for (int i = 0; i < tab.length - 1; i++) {
//			System.out.println(tab[i]);
//		}
//	}

	private int[] agrandirTableau(int[] tab, int plus) {
		int[] tab2 = new int[tab.length + 1];
		for (int i = 0; i < tab.length; i++) {
			tab2[i] = tab[i];
		}
		tab2[tab2.length-1] = plus;
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
				tab = interactifStockageNombre.enregistrerNombre(chiffre, tab);
			}

			if (num == 2) {
//				interactifStockageNombre.afficherNombre(tab);
				for (int i = 0; i < tab.length - 1; i++) {
					System.out.println(tab[i]);
				}
			}

		} while (num != 2 || num != 1);
		saisie.close();
		System.out.println("vous avez quitté. ");

	}

}
