package org.generation.italy.array;

public class CibiPreferiti {

	public static void main(String[] args) {
		String[] listaCibi = {"l'hamburgher","le lasagne","la pasta alla norma","la cotoletta","i Falafel"};
		int lunghezzaLista = listaCibi.length;
		System.out.println("La mia lista dei cibi preferiti contiene " + lunghezzaLista + " cibi.");
		System.out.println("Il mio cibo preferito � " + listaCibi[0] + ".");
		System.out.println("Il mio cibo preferito,ma non troppo � " + listaCibi[listaCibi.length-1] + ".");

	}

}
