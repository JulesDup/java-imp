package fr.algorithmie;

public class SommeDeTableaux {

	public static void main(String[] args) {
		int[] array = Tableau.getArray();
		int[] array2 = { -1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1 };

		int tabSize = array.length;
		int tabSize2 = array2.length;
		int[] tabSomme = new int[tabSize];

		if (tabSize == tabSize2) {
			for (int i = 0; i < tabSize; i++) {
				tabSomme[i] = array[i] + array2[i];

			}
		}
		for (int x = 0; x < tabSomme.length; x++) {
			System.out.print(tabSomme[x] + " ");
		}
	}

}
