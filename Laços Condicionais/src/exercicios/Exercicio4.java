package exercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//vari�veis
		int numero;

		//entrada
		System.out.println("Digite um n�mero: ");
		numero = leia.nextInt();
				
		//sa�da
		if(numero == 0){
			System.out.println(numero+" � neutro");
			} else if(numero < 0){
			System.out.println("N�o � permitido n�mero negativo");
			} else if(numero % 2 == 0){
			System.out.printf(numero+" � par, e sua raiz quadrada � igual a: %f",  Math.sqrt(numero));
			} else {
			System.out.printf(numero+" � �mpar, e ele elevado ao quadrado � igual a:  %f", Math.pow(numero, 2));
			}
}
}
