package exercicios;
import java.util.Scanner;
public class EXERCICIO2 {
	public static void main(String[] args) {
		
		int ano, meses, dias, diasFinal;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite sua idade em dias: ");
		dias = leia.nextInt();

		ano = (dias / 365);
		meses = ((dias % 365) / 30);
		diasFinal = ((dias % 365) % 30);

		System.out.println("\nSua idade é de " + ano + " ano(s) " + meses + " mes(es) " + diasFinal + " dia(s).");
		
	}
}
