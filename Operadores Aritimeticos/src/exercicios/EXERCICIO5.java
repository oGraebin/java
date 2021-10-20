package exercicios;
import java.util.Scanner;

public class EXERCICIO5 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int nota1, nota2, nota3, notaFinal;

		System.out.println("\nDigite a primeira nota: ");
		nota1 = leia.nextInt();
		System.out.println("\nDigite a segunda nota: ");
		nota2 = leia.nextInt();
		System.out.println("\nDigite a terceira nota: ");
		nota3 = leia.nextInt();

		notaFinal = (((nota1 * 2) + (nota2 * 3) + (nota3 * 5))/10);

		System.out.println("\nA nota final é de " + notaFinal);
	}
}
