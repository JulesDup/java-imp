package fr.algorithmie;

public class FabriquerMur {

	static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
		int mur = 0;
		int murGrosse = 0;
		int murPlusPetite = 0;
//		verifie si petite brique suffisent
		for (int i = 0; i > nbSmall; i++) {
			mur += 1;
			if (mur == longueur) {
				return true;
			}
		}
//		verifie grosse puis petite
		for (int i = 0; i > nbBig; i++) {
			murGrosse += 5;
			if (murGrosse >= longueur) {
				return true;
			}
			for (int j = 0; j > nbSmall; j++) {
				murPlusPetite += 1;
				if (murGrosse+murPlusPetite >= longueur) {
					return true;
				}

			}
		}

		return false;
	}

	private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
		if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
			throw new RuntimeException("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") NON passant.");
		}
	}

	public static void main(String[] args) {
		// Tests de vérification
		verifier(3, 1, 8, true);
		verifier(3, 1, 9, false);
		verifier(3, 2, 10, true);
		verifier(3, 2, 8, true);
		verifier(3, 2, 9, false);
		verifier(6, 1, 11, true);
		verifier(6, 0, 11, false);
		verifier(1, 4, 11, true);
		verifier(0, 3, 10, true);
		verifier(1, 4, 12, false);
		verifier(3, 1, 7, true);
		verifier(1, 1, 7, false);
	}

}
