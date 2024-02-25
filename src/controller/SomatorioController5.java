package controller;

public class SomatorioController5 {

	public SomatorioController5() {
		super();
	}

	public double FuncaoSoma(int n, double soma) {
		// condição de parada estabelecida por conta da formula do somatorio (ele
		// termina soamndo 1)
		if (n == 1) {
			return 1;
		} else {
			// a logica é que a cada chamada soma vai receber a divisão de 1 por n (que pela
			// recursiva se torna n-1 a cada chamada)
			soma = 1 / (double) n;
			return soma + FuncaoSoma(n - 1, soma);
		}
	}
}