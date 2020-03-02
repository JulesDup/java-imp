package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	private static int calcFibo(int indice) {
		if (indice <= 1)
			return indice;
		else
			return calcFibo(indice - 1) + calcFibo(indice - 2);
	}

	public static void main(String[] args) {
		System.out.println("Calcul de la suite de Fibonacci, choisissez un nombre de rang : ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		// afficher les N nombre Fibonacci
		for (int i = 1; i <= N; i++)
			System.out.println("rang " + i + ": " + calcFibo(i));
	}

}
