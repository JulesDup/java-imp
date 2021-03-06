package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		int[] array = Tableau.getArray();
		int tabSize = array.length;

		// afficher tableau
		for (int var : array) {
			System.out.print(var + "  ");
		}
		System.out.println("");

		for (int i = 0; i < tabSize; i++) {
			System.out.print(array[i] + "  ");

		}
		System.out.println("");

		// afficher tableau Inverse
		for (int i = tabSize - 1; i > -1; i--) {
			System.out.print(array[i] + "  ");

		}
		System.out.println("");

		// copie tableau
		int arrayCopy[] = new int[tabSize];
		for (int i = 0; i < tabSize; i++) {
			arrayCopy[i] = array[i];
		}
		for (int i = 0; i < tabSize; i++) {
			System.out.print(arrayCopy[i] + "  ");

		}

	}
}
