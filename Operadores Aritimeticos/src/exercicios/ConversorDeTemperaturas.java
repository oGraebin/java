package exercicios;
import java.util.Scanner;

public class ConversorDeTemperaturas {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String nome;
		double temperatura;
		
		System.out.println("Escreva seu nome: ");
		nome = leia.next();
		System.out.println("Qual a sua temperatura em Célsius? ");
		temperatura = leia.nextDouble();
		System.out.println("A sua temperatura atual em Célsius é igual a "+temperatura+"°, convertido para Fahrenheit é igual a "+ ((temperatura * 1.8)+32));
	}

}
