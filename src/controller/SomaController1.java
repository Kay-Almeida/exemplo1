package controller;

public class SomaController1 {
	public SomaController1() {
		super();
	}

	public int somatorio(int n, int soma) {
		// condição de parada definida por conta do enunciado especificar os N numeros
		// naturais (não negativos) e instruir a retornar 0 para negativos
		if (n < 0) {
			return 0;
		} else {
			soma = n + somatorio(n - 1, soma);
			return soma;
			// a logica dos passos é que a operação vai se empilhando até N ser menor que 0
			// e a variavel soma recebe a cada operação o valor de N + o valor de n - 1 e
			// assim por diante até o final da recursiva
		}
	}
}
