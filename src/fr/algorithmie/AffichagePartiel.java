package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		int[] array = Tableau.getArray();
		int tabSize = array.length;

		// afficher entier supérieur à 3 tableau
		for (int i = 0; i < tabSize; i++) {
			if (array[i] > 3) {
				System.out.print(array[i] + "  ");
			}
		}
		System.out.println();

		// afficher entier pairs
		for (int i = 0; i < tabSize; i++) {

			if (array[i] > 0 && array[i] % 2 == 0) {
				System.out.print(array[i] + "  ");
			}

		}
		System.out.println();
		// afficher d'index paire
		for (int i = 0; i < tabSize; i++) {
			if (i % 2 == 0) {
				System.out.print(array[i] + "  ");
			}
		}
		System.out.println();
		// afficher d'index impaire
		for (int i = 0; i < tabSize; i++) {
			if (i % 2 != 0) {
				System.out.print(array[i] + "  ");
			}
		}
	}

}
