package fr.algorithmie;

public class FirstLast {

	public Boolean isFirstLast(int[] array) {
		if (array.length > 1 && (array[array.length - 1] == array[0])) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int[] array = Tableau.getArray5();
		FirstLast firstLast = new FirstLast();
		System.out.println(firstLast.isFirstLast(array));

	}

}
