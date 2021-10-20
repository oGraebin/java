package exercicios;

import java.util.Scanner;

public class ExercicioSe {

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
			System.out.println(numero+" é par");
			} else {
			System.out.println(numero+" é ímpar");
			}

}
	
}
