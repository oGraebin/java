package exercicios;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a, b, c, maior = 0;
		
		System.out.println("Digite o primeiro n�mero: ");
		a = leia.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		b = leia.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		c = leia.nextInt();
		
		
			 if(a>=b && a>= c) { maior = a;}
		else if(b>=a && b>= c) { maior = b;}
		else if(c>=b  && c>= a) { maior = c;}

		System.out.printf("O maior n�mero �: %d", maior);
	 
	}

}
