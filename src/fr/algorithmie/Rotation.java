package fr.algorithmie;

public class Rotation {

	public int[] doRotation(int[] array) {
		int[] tabTurn = new int[array.length];
		tabTurn[0] = array[array.length - 1];
		for (int i = 1; i < array.length - 1; i++) {
			tabTurn[i] = array[i - 1];
		}
		return tabTurn;
	}

	public static void main(String[] args) {
		int[] array = Tableau.getArray5();
		Rotation rotation = new Rotation();
		int[] tab = rotation.doRotation(array);

		// Visualisation du tableau
		for (int x = 0; x < tab.length; x++) {
			System.out.print(tab[x] + " ");
		}
	}

}
