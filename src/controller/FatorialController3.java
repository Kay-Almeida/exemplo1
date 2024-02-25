package controller;

public class FatorialController3 {

	public FatorialController3() {
		super();

	}

	public int FuncaoFat(int n) {
		// condição de parada se da por conta da forma que o fatorial funciona (em soma
		// por exemplo o return seria 0 mas como 0! = 1, retorna 1)
		if (n == 0) {
			return 1;
		} else {
			// o return vai atribuindo valor e multiplicando o n por n-1 a cada chamada,
			// gerando o fatorial
			return n * FuncaoFat(n - 1);
		}
	}
}
