package exercicios;

import java.util.Scanner;

public class exercicioDoWhile06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, soma = 0, contador = 0;
		double media=0.0;
		
		do {
			System.out.println("Digite um n�mero");
			numero = leia.nextInt();
			System.out.println("----------------------");
			
			if(numero > 0 && numero % 3 == 0) {
				soma += numero;	
				contador++;
			}
			
		} while(numero > 0);
		
		media = soma / contador;		
		System.out.println("A m�dia dos n�meros digitados m�ltiplos de tr�s �: " + media);
	}
}


