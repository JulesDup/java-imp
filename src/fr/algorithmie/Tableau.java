package fr.algorithmie;

public class Tableau {
	public static int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
	public static int tabSize = array.length;

	public static int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int getTabSize() {
		return tabSize;
	}

	public void setTabSize(int tabSize) {
		this.tabSize = tabSize;
	}

}
