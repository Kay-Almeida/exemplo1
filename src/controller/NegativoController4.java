package controller;

public class NegativoController4 {

	public NegativoController4() {
		super();

	}

	public int funcaonegative(int[] vet, int soma, int tamanho) {
		// condição de parada definida pelo termino do tamanho do vetor
		if (tamanho <= 0) {
			return soma;
		} else {
			// a logica é que a cada chamada o indice do vetor diminui 1 para a comparação e
			// caso seja menor 0, soma recebe 1 para fazer a contagem do total de negativos
			tamanho = tamanho - 1;
			if (vet[tamanho] < 0) {
				soma = soma + 1;
			}
			return funcaonegative(vet, soma, tamanho);
		}
	}

}
