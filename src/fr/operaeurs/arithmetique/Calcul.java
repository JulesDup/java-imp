package fr.operaeurs.arithmetique;

import java.util.Scanner;

public class Calcul {

	public static void main(String[] args) {
		int a = 4;
		int b = 5;

		boolean boucle;
		System.out.println("voici deux chiffre " + a + " et " + b);
		while (boucle = true) {

			System.out.println("Quelle opérateur voulez vous ? \n 1: + \n 2: - \n 3: * \n 4: /");
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			System.out.print("le resutat est : ");
			switch (str) {
			case "1":
				System.out.println(a + b);
				break;
			case "+":
				System.out.println(a + b);
				break;
			case "2":
				System.out.println(a - b);
				break;
			case "-":
				System.out.println(a - b);
				break;
			case "3":
				System.out.println(a - b);
				break;
			case "*":
				System.out.println(a - b);
				break;
			case "4":
				System.out.println((short) a / b);
				System.out.println("il reste" + a % b);
				break;
			case "/":
				System.out.println((short) a / b);
				System.out.println("il reste" + a % b);
				break;

			default:
				System.out.println("on recommence ? O/N");
				String str2 = sc.nextLine();
				if (str2 == "O") {
					boucle = true;
				}

				break;
			}

		}

	}
}
