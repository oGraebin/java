package exercicios;
import java.util.Scanner;

public class exercicioWhile03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade=0, mais50=0, menos21=0;
		
		while(idade!=-99) {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			if(idade<21 && idade>=0) {
				menos21++;
			} else if(idade>50) {
				mais50++;
			}
			
		}
		System.out.printf("O total de pessoas com menos de 21 é igual a %d e o total de pessoas com mais de 50 anos é igual a %d.", menos21, mais50);

		
	}

}
