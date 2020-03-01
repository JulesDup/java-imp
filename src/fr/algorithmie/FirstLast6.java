package fr.algorithmie;

import javax.swing.text.StyledEditorKit.BoldAction;

public class FirstLast6 {

	public Boolean isFirstLast6(int[] array) {
		if (array.length > 0 && (array[array.length - 1] == 6 || array[0] == 6)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int[] array = Tableau.getArray4();
		FirstLast6 firstLast6 = new FirstLast6();
		System.out.println(firstLast6.isFirstLast6(array));

	}

}
