package exercicios;

import java.util.Scanner;

public class ExercicioVetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int notas[] = new int[5], maiorNota = 0, x;

		for ( x=0 ; x<5 ; x++){
			System.out.println("Digite a nota: ");
			notas[x] = leia.nextInt();
			System.out.println("\n");
			
			if( notas[x] > maiorNota){
				maiorNota = notas[x];
			}
		}

		System.out.println("A maior nota �:\t" + maiorNota);
	}

}
