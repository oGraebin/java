package exercicios;

import java.util.Scanner;

public class ExercicioWhile {
	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);	
		
	double x = 0.00, somador = 0.00, media = 0.00;
	int contador = 0 ;
	while(x >=0){
		
		somador = somador + x;
				
		System.out.println("Digite um número: ");
		x = leia.nextInt();
		
		contador = (x >= 0) ? (contador+1) : (contador);
	}

	media = somador/contador;

	System.out.println("\nO total do somatório é de: " + somador);
	System.out.println("\nO número de valores informados é: " + contador);
	System.out.println("\nA média dos valores informados é de: " + media);
}
}
