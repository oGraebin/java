package exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a, b, c, maior, meio, menor;
		
		System.out.println("Digite o primeiro n�mero: ");
		a = leia.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		b = leia.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		c = leia.nextInt();
		
		
			 if(a>=b && b>= c) { System.out.printf("Os n�meros em ordem crescente s�o: %d, %d, %d", c, b, a);} 
		else if(a>=c  && c>= b) { System.out.printf("Os n�meros em ordem crescente s�o: %d, %d, %d", b, c, a); } 
		else if(b>=a && a>= c) { System.out.printf("Os n�meros em ordem crescente s�o: %d, %d, %d", c, a, b); } 
		else if(b>=c  && c>=a ) { System.out.printf("Os n�meros em ordem crescente s�o: %d, %d, %d", a, c, b); }
		else if(c>=b  && b>= a) { System.out.printf("Os n�meros em ordem crescente s�o: %d, %d, %d", a, b, c); }
		else if(c>=a && a>= b) { System.out.printf("Os n�meros em ordem crescente s�o: %d, %d, %d", b, a, c); }

	}
}
