package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int tabSize = array.length;
		// afficher tableau
		for (int i = 0; i < tabSize; i++) {
			System.out.print(array[i] + "  ");
		}
		System.out.println("  ");
		// afficher copie tableau inversé
		int arrayCopy[] = new int[tabSize];
		for (int i = 0; i < tabSize; i++) {
			arrayCopy[i] = array[i];
		}

		for (int i = tabSize - 1; i > -1; i--) {
			System.out.print(arrayCopy[i] + "  ");
		}

	}

}
