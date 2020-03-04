package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

/* Le jeu est simple mais la réalisation est plus délicate. 
 * Vous allez jouer contre l’ordinateur. 
 * Vous devez mettre en place les règles du jeu des 21 bâtons. 
 * 
 * Dans ce jeu, voici les règles : 
 * 	- celui qui commence, le joueur ou l’ordinateur, est choisi aléatoirement
 * 	- à chaque tour la joueur, ou l’ordinateur, prend entre 1 et 3 bâtons maximum 
 * 	- Celui qui prend le dernier bâton a perdu 
 * 
 * Dans ce TP vous allez devoir imaginer vous-même le mécanisme à mettre en place, 
 * sur la base de ce que vous avez vu précédemment. 
	 *
 * Quelques consignes : 
 * 	- essayez de mettre en place un algorithme intelligent de manière à ce que l’ordinateur ne fasse pas n’importe quoi. 
 * 	Exemple : 
 * 		o s’il reste 6 bâtons, évitez que l’ordinateur ne prenne 2 ou 3 bâtons, car sinon il est sûr de perdre. 
 * 		o s’il reste 4 bâtons, l’ordinateur doit prendre 3 bâtons afin que ce soit le joueur qui perde 
 * 		o etc…
 */
public class Interfactif21Batons {

/////////////Methodes/////////////

	private static int prendreBatonOrdinateur(int nbBatons) {
		System.out.println("c'est le tour de l'ordinateur");
		if (nbBatons > 6) {
			int random = new Random().nextInt(2);
			int nbBatonPris = random + 1;
			nbBatons -= nbBatonPris;
		} else {
			switch (nbBatons) {
			case 6:
				nbBatons -= 1;
				break;
			case 5:
				nbBatons -= 1;
				break;
			case 4:
				nbBatons -= 3;
				break;
			case 3:
				nbBatons -= 2;
				break;
			case 2:
				nbBatons -= 1;
				break;

			default:
				break;
			}

		}
		return nbBatons;
	}

	private static int prendreBatonJoueur(int nbBatons) {
		System.out.println("c'est votre tour, choisissez un nombre de 1 à 3");
		int nbBatonPris;
		Scanner scn = new Scanner(System.in);
		do {
			nbBatonPris = scn.nextInt();
		} while (nbBatonPris < 3);
		nbBatons -= nbBatonPris;
		return nbBatons;
	}

/////////////Main/////////////

	public static void main(String[] args) {
		// variables
		int nbBatons = 21;
		int random = new Random().nextInt(2);
		System.out.println("Bienvenue sur le jeu du baton");
		int nbTours = random;
		String plrl = " ";
		System.out.println(nbTours);
		// 1er tour

		do {

			if (nbTours % 2 == 0)
				nbBatons = prendreBatonJoueur(nbBatons);
			else
				nbBatons = prendreBatonOrdinateur(nbBatons);

			if (nbBatons > 1) {
				plrl = "s";
			}
			System.out.println("Il reste " + nbBatons + " Baton" + plrl);
			nbTours++;

		} while (nbBatons != 0);

	}

}
