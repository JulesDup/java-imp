package fr.operateurs.logique;

import java.util.Scanner;

public class CalculLogique {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c = true;
		System.out.println("a = true \nb = false \nc = true ");

		// enregistrement 1er argument
		System.out.println("choisir un premier argument");
		Scanner sc = new Scanner(System.in);
		String arga = sc.nextLine();
		String arg1;
		if (arga == "b") {
			arg1 = "false";
		} else {
			arg1 = "true";
		}

		// enregistrement 2scd argument
		System.out.println("choisir un second argument");
		String argb = sc.nextLine();
		String arg2;
		if (argb == "b") {
			arg2 = "false";
		} else {
			arg2 = "true";
		}

		// Choix operateur
		System.out.println("choisir un operateur && ou ||");
		String ope = sc.nextLine();

//afficher operation
		System.out.println("votre operation est donc :");
		System.out.println(arg1 + " " + ope + " " + arg2);
		System.out.println(Boolean.parseBoolean(arg1) + ope + Boolean.parseBoolean(arg2));

	}

}
