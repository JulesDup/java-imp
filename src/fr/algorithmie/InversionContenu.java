package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		int[] array = Tableau.getArray();
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
