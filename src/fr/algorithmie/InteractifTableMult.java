package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		int num;
		do {
			System.out.println("Choisissez un nombre entre 1 et 10. ");
			num = saisie.nextInt();
		} while (num < 1 || num > 10);
		for (int i = 0; i < 10; i++) {
			System.out.println(num + " + " + i + " = " + num * i);
		}

	}

}
