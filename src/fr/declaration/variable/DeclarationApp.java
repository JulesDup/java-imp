package fr.declaration.variable;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;

public class DeclarationApp {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();

		byte b = 1;
		short s = 1;
		int i = 12;
		long l = 123L;
		float f = 44654f;
		double d = 42;
		char c = 'c';
		boolean bou = true;

		list.add(b);
		list.add(s);
		list.add(i);
		list.add(l);
		list.add(f);
		list.add(d);
		list.add(c);
		list.add(bou);

		for (Object x : list) {
			System.out.println(x);
		}
		System.out.println("-------------------------------------------------------------------");

		String randomString = "Voici le resultat d'un calcul :\n 1+5=6";
		System.out.println(randomString);

	}

}
