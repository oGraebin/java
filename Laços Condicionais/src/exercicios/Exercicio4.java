package exercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//variáveis
		int numero;

		//entrada
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
				
		//saída
		if(numero == 0){
			System.out.println(numero+" é neutro");
			} else if(numero < 0){
			System.out.println("Não é permitido número negativo");
			} else if(numero % 2 == 0){
			System.out.printf(numero+" é par, e sua raiz quadrada é igual a: %f",  Math.sqrt(numero));
			} else {
			System.out.printf(numero+" é ímpar, e ele elevado ao quadrado é igual a:  %f", Math.pow(numero, 2));
			}
}
}
