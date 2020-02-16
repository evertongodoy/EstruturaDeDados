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
		
		this.aumentaCapacidade();
		
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
    
	
	
	// Aula07 - Add Elemento em qualquer lugar - Overload - Sobrecarga
	public Boolean adiciona(int posicao, String elemento) {
		
		if(! (posicao >=0 && posicao < this.tamanho) ){
			throw new IllegalArgumentException("Posicao Invalida");
		}
		
		this.aumentaCapacidade();
		
		// Iterando o vetor de tras p frente // Mover todos elemebtos
		for(int i = this.tamanho; i >= posicao; i--) { // Foi visto que movia do tamanho ate a posicao
			this.elementos[i+1] = this.elementos[i];
		}
		
		
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
	}
	
	
	private void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			String[] elementosNovos = new String[this.elementos.length*2]; // Melhor forma de dobrar a capacidade do vetor eh dobrar
			for(int i=0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
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
	
	
	// Aula 05 - Metodo de Busca
	public String busca(int posicao) {
		if(! (posicao >=0 && posicao < this.tamanho) ){
			throw new IllegalArgumentException("Posicao Invalida");
		}
		return this.elementos[posicao];
	}
	
	
	// Aula06 - Verificar se um elemento existe
	public int busca(String elemento) {
		// Algoritimo de Busca Sequencial
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equalsIgnoreCase(elemento)) {  // String eh um objeto, nao podemos usar == e sim EQUALS
				return i;
			}
		}
		return -1;
	}
	
}
