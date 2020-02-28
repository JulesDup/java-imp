package fr.declaration.variable;

public class DeclarationLong {

	public static void main(String[] args) {
		long a = 3000L;
		long b = 3000;
		long c = 3000000000L;

//		Afin d'informer la JVM que le type utilisé est long, vous DEVEZ ajouter un "L" à la fin,
//		sinon le compilateur essaiera d'allouer ce dernier dans une taille d'espace mémoire de 
//		type entier et le code ne compilera pas si le nombre est trop grand. Aucune différence avec l ; 
		long d = 3000000000l;
		System.out.println(d);
	}

}
