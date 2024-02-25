package controller;

public class MenorController2 {

	public MenorController2() {
		super();
	}

	public int FuncaoMenor(int[] vet, int tamanho, int menor) {
		// condição de parada definida pelo termino do tamanho do vetor
		if (tamanho <= 0) {
			return menor;
		} else {
			// a logica é que a cada chamada o indice do vetor diminui 1 para a comparação e
			// caso seja menor que o menor a variavel recebe o valor.
			tamanho = tamanho - 1;
			if (vet[tamanho] < menor) {
				menor = vet[tamanho];
			}
			return FuncaoMenor(vet, tamanho, menor);
		}
	}
}
