package view;

import controller.FatorialController3;

public class Principal3 {
	public static void main(String[] args) {
		FatorialController3 fator = new FatorialController3(); 
		
		int n = 5; 
		int resultado = fator.FuncaoFat(n); 
		System.out.println("RESULTADO FATORIAL DE " + n + " É: " + resultado);
		
	}
}
