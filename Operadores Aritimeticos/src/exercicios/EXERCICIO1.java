package exercicios;
import java.util.Scanner;

public class EXERCICIO1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias, idadeEmDias;
		
		System.out.println("Digite a sua idade expressa em anos: ");
		anos = leia.nextInt();
		System.out.println("Digite a sua idade expressa em meses: ");
		meses = leia.nextInt();
		System.out.println("Digite a sua idade expressa em dias: ");
		dias = leia.nextInt();
		
		idadeEmDias = ((anos*365)+(meses*30)+dias);
		
		System.out.println("A idade total em dias é de "+idadeEmDias+".");
	}
}
