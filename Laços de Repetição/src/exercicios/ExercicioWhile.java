package exercicios;

import java.util.Scanner;

public class ExercicioWhile {
	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);	
		
	double x = 0.00, somador = 0.00, media = 0.00;
	int contador = 0 ;
	while(x >=0){
		
		somador = somador + x;
				
		System.out.println("Digite um n�mero: ");
		x = leia.nextInt();
		
		contador = (x >= 0) ? (contador+1) : (contador);
	}

	media = somador/contador;

	System.out.println("\nO total do somat�rio � de: " + somador);
	System.out.println("\nO n�mero de valores informados �: " + contador);
	System.out.println("\nA m�dia dos valores informados � de: " + media);
}
}
