package exercicios;
import java.util.Scanner;

public class EXERCICIO3 {
	public static void main(String[] args) {
		
		int horas, minutos, segundos, segundosFinal;
		Scanner leia = new Scanner(System.in);


		System.out.println("\nQual a duração em segundos? ");
		segundos = leia.nextInt();
		
		horas = (segundos / 3600);
		minutos = ((segundos % 3600) / 60);
		segundosFinal = ((segundos % 3600) % 60);

		System.out.println("O total é de " + horas + "h" + minutos + "m" + segundosFinal + "s");
	}
}
