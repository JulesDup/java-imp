package fr.algorithmie;

import java.util.Iterator;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		int[] array = Tableau.getArray();
		int[] array2 = Tableau.array3;
		int[] tabSomme;

		int tabSize = array.length;
		int tabSize2 = array2.length;

		if (tabSize2 < tabSize) {
			tabSomme = new int[tabSize];
			for (int i = 0; i < tabSize2; i++) {
				tabSomme[i] = array[i] + array2[i];
			}

			for (int i = tabSize2; i < tabSomme.length; i++) {
				tabSomme[i] = array[i];
			}
		} else {
			tabSomme = new int[tabSize2];
			for (int i = 0; i < tabSize; i++) {
				tabSomme[i] = array[i] + array2[i];
			}
			for (int i = tabSize; i < tabSomme.length; i++) {
				tabSomme[i] = array2[i];
			}
		}

		for (int x = 0; x < tabSomme.length; x++) {
			System.out.print(tabSomme[x] + " ");
		}

	}

}
