package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {
		int[] array = Tableau.getArray();
		int tabSize = array.length;
		int somme = 0;
		int moyenne;
		for (int i = 0; i < tabSize; i++) {
			somme += array[i];

		}

		moyenne = somme / tabSize;
		System.out.println("La moyenne des de : " + moyenne);
	}

}
