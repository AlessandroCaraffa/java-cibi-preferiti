package org.generation.italy.array;

import java.util.ArrayList;
import java.util.List;

public class CibiPreferiti {

	public static void main(String[] args) {
		String[] listaCibi = {"l'hamburgher","le lasagne","la pasta alla norma","la cotoletta","il Falafel"};
		
		int lunghezzaLista = listaCibi.length;
		int ciboMedio = listaCibi.length / 2;
		
		
		System.out.println("La mia lista dei cibi preferiti contiene " + lunghezzaLista + " cibi.");
		System.out.println("Il mio cibo preferito è " + listaCibi[0] + ".");
		System.out.println("Il mio cibo preferito,ma non troppo è " + listaCibi[listaCibi.length-1] + ".");
		System.out.println("il mio cibo di mezzo è " + listaCibi[ciboMedio] + ".");
		

	}

}
