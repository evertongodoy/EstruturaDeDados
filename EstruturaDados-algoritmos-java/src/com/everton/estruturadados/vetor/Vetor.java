package com.everton.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	
	/*  Primeiro modo
	 	Metodo mais simples, verificar os valores null para adicionar
	Boolean = False
	Integer / Numericos = 0
	String = nll	
	 */
	/*public void adiciona(String elemento) {
		for(int i = 0; i < this.elementos.length; i++) {
			if(this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}*/
	
	
	// Segundo modo - Melhorado para nao percorrer todo o Array
	public Boolean adiciona(String elemento) {
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	public int getTamanho() {
		return this.tamanho;
	}

	// Aula 4 - Classe Arrays, serve para trabalhar com colecoes de objetos
	// Possui um metodo toString onde podmeos passar um array de elementos e ela retorna todos os elemetos do array.
	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		
		s.append("[");
		
		// Do primeiro ate o penultimo
		for(int i=0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		// Ultimo
		if(this.tamanho > 0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		
		return s.toString();   // Arrays.toString(elementos);
	}
	
}
