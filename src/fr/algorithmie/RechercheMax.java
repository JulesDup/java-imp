package fr.algorithmie;

public class RechercheMax {

	public static void main(String[] args) {
		int[] array = Tableau.getArray();
		int tabSize = array.length;

		// Recherche Max
		int nbMax = Integer.MIN_VALUE;
		for (int i = 0; i < tabSize; i++) {

			if (array[i] > nbMax) {
				nbMax = array[i];
			}

		}

		// Recherche Max
		int nbMin = Integer.MAX_VALUE;
		for (int i = 0; i < tabSize; i++) {

			if (array[i] < nbMin) {
				nbMin = array[i];
			}

		}
		System.out.println("Le numbre du tableau le plus haut est : " + nbMax);
		System.out.println("Le numbre du tableau le plus bas est : " + nbMin);

	}
}
