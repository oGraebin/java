package exercicios;

import java.util.Scanner;

public class AreaDoTriangulo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);	
		double base1, altura1, area1,  base2, altura2, area2;
		
		System.out.println("Digite o valor da base: ");
		base1 = leia.nextDouble();
		
		System.out.println("Digite o valor da altura: ");
		altura1 = leia.nextDouble();
		area1 = ((base1*altura1)/2);
		
		System.out.println("O valor da área desse triângulo é de: "+ area1);
		
		System.out.println("-----------------------------------------------");
		
		System.out.println("Digite o valor da base: ");
		base2 = leia.nextDouble();
		
		System.out.println("Digite o valor da altura: ");
		altura2 = leia.nextDouble();
		
		area2 = ((base2*altura2)/2);

		System.out.println("O valor da área desse triângulo é de: "+ area2+"\n");
		
		if(area1>area2) {
			System.out.println("O Triangulo 1 possuia  maior area");
		} else
		if(area2>area1) {
			System.out.println("O Triangulo 2 possuia  maior area");
		} else
		if(area1==area2) {
			System.out.println("Os triangulos possuem áreas iguais");
		}

	}

}
