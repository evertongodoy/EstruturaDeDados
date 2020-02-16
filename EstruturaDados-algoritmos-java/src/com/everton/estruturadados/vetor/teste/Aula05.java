package com.everton.estruturadados.vetor.teste;

import com.everton.estruturadados.vetor.Vetor;

public class Aula05 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		vetor.adiciona("Primeiro elemento");
		vetor.adiciona("Segundo elemento");
		vetor.adiciona("Terceiro elemento");

		
		System.out.println(vetor.busca(1));

	}

}
