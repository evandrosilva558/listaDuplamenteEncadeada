package com.listaDuplamenteEncadeada;

public class Exec {

	public static void main(String[] args) {
		
		ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<>();
		
		minhaLista.add("teste1");
		minhaLista.add("teste2");
		minhaLista.add("teste3");
		minhaLista.add("teste4");
		minhaLista.add("teste5");
		minhaLista.add("teste6");
		
		
		
		System.out.println(minhaLista);
		
		minhaLista.remove(1);
		
		
		System.out.println(minhaLista);
		

	}

}
