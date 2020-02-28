package fr.declaration.notations;

public class TestNotation {

	public static String intToBinary(int n) {
		String s = "";
		while (n > 0) {
			s = ((n % 2) == 0 ? "0" : "1") + s;
			n = n / 2;
		}
		return s;
	};

	public static void main(String[] args) {

		System.out.println("----------------------------------Exercice 1-------------------------------------------");
		int a = 047;
		System.out.println(a);
		// a vaut 39, notation binaire
		intToBinary(144);
		System.out.println(intToBinary(144));

		int c = 0 * 10;
		System.out.println(c);
		// vaut 0

		
	}

}
