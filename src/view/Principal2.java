package view;

import controller.MenorController2;

public class Principal2 {
	public static void main(String[] args) {
		
		MenorController2 MN = new MenorController2(); 
		
		int [] vet = {10, 9, 8, 7, 18, 15, 40, 77, 23, 11, 50, 31, 12}; 
		int tamanho = vet.length; 
		int menor = vet [tamanho - 1];  
		
		int FuncaoMenor = MN.FuncaoMenor(vet, tamanho, menor);
		System.out.println("O MENOR VALOR DO VETOR É: " + FuncaoMenor);
		
	}
}
