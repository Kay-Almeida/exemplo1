package view;

import controller.SomatorioController5;

public class Principal5 {
	public static void main(String[] args) {
		
		SomatorioController5 bdsm = new SomatorioController5();
		
		double soma = 0; 
		int n = 7; 
		double resultado = bdsm.FuncaoSoma(n, soma);
		System.out.println("RESULTADO DA SOMA: "+ resultado);
		
	}

}
