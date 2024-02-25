package view;

import controller.NegativoController4;

public class Principal4 {
	public static void main(String[] args) {
		
		NegativoController4 NG = new NegativoController4(); 
		
		int [] vet = {-1, -4, 12, 14, 19, 50, -2, -19, 81, -81, 78, -78, -3}; 
		int soma = 0; 
		int tamanho = vet.length; 
		
		int resultado = NG.funcaonegative(vet, soma, tamanho); 
		System.out.println("TOTAL DE NUMEROS NEGATIVOS: " + resultado);
		
		
	}

}
