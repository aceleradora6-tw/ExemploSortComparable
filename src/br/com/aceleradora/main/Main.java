package br.com.aceleradora.main;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main (String [] args){
		ArrayList<ProdutoIteravel> pis = new ArrayList<ProdutoIteravel>();
		
		ProdutoIteravel pi1 = new ProdutoIteravel(5, "Doce de Leite");
		ProdutoIteravel pi2 = new ProdutoIteravel(3, "Sucrilhos");
		ProdutoIteravel pi3 = new ProdutoIteravel(1, "Peito de Frango");
		ProdutoIteravel pi4 = new ProdutoIteravel(2, "Tomate");
		ProdutoIteravel pi5 = new ProdutoIteravel(4, "Bala de Goma");
		
		pis.add(pi1);
		pis.add(pi2);
		pis.add(pi3);
		pis.add(pi4);
		pis.add(pi5);
		
		System.out.println(pis.toString());
		
		// Internamente, este metodo executara o compareTo de cada objeto, para saber
		// como ordenar a lista
		Collections.sort(pis);
		
		System.out.println(pis.toString());		
	}
	
}
