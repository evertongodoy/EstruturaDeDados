package testes;

import com.everton.estruturadados.vetor.Vetor;

public class Teste1 {

	String[] vetorStr;
	int posicaoAtual;
	
	public Teste1(int capacidade) {
		this.vetorStr = new String[capacidade];
		this.posicaoAtual = 0;
	}
	

	
	// Adiciona
	public Boolean adicionaElemento(String elemento) {
		
		aumentaVetor();
		
		if(this.posicaoAtual < this.vetorStr.length) {
			this.vetorStr[posicaoAtual] = elemento;
			posicaoAtual++;
			return true;
		}
		
		return false;
	}
	
	public void aumentaVetor(){
		
		if(this.posicaoAtual == this.vetorStr.length) {
			String[] vetAux = new String[vetorStr.length * 2];
			
			for(int i = 0; i < this.posicaoAtual; i++) {
				vetAux[i] = this.vetorStr[i];
			}
			this.vetorStr = vetAux;
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		Teste1 testeVetor = new Teste1(3);
		
		testeVetor.adicionaElemento("Everton");
		testeVetor.adicionaElemento("Corinthians");
		testeVetor.adicionaElemento("Teste de Posicao");
		testeVetor.adicionaElemento("Outra Posicao");
		
		System.out.println("parar aqui");
		

	}

}
