package view;

import controller.SomaController1;

public class Principal1 {

	public static void main(String[] args) {
		SomaController1 smt = new SomaController1(); 
		
		int n = 5;
		int soma = 0; 
		
		int somatorio = smt.somatorio(n, soma);
		System.out.println("RESULTADO DA SOMA: " + somatorio);
	}
	
}
