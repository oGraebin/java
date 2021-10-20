package exercicios;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a, b, c, maior = 0;
		
		System.out.println("Digite o primeiro número: ");
		a = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		b = leia.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		c = leia.nextInt();
		
		
			 if(a>=b && a>= c) { maior = a;}
		else if(b>=a && b>= c) { maior = b;}
		else if(c>=b  && c>= a) { maior = c;}

		System.out.printf("O maior número é: %d", maior);
	 
	}

}
