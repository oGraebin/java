package exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		if(idade>=18 && idade<=25) {
			System.out.println("Digite sua idade corresponde ao grupo adulto ");
		} else if(idade>=15 && idade<=17) {
			System.out.println("Digite sua idade corresponde ao grupo juvenil ");
		} else if(idade>=10 && idade<=14) {
			System.out.println("Digite sua idade corresponde ao grupo infantil ");		
		} else {
			System.out.println("Idade fora do limite (25 a 10)");		
		}
		
	}
}
