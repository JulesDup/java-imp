package fr.algorithmie;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class InteractifTantQue {

	public static void main(String[] args) {
		int num = 0;
		Scanner saisie = new Scanner(System.in);

		do {
			System.out.println("Choisissez un nombre entre 1 et 10 inclus. ");
			num = saisie.nextInt();
		} while (num < 1 || num > 10);
		System.out.println("Ok, c'est bon !");
	}
}
