package Exercicios.Classes;

import java.util.Scanner;

public class PatineteEx5{
	Scanner leia = new Scanner(System.in);
	// Atributos - é, tem, está;
	public String modelo, codId;
	public int ano, estoque;
	public double valor;
	
	public void Sistema(){
		System.out.println("Qual o modelo do Patinete? ");
		modelo = leia.nextLine();
		
		System.out.println("Qual o código de identificação do patinete? ");
		codId = leia.nextLine();
		
		System.out.println("Qual o ano do patinete? ");
		ano = leia.nextInt();
		
		leia.nextLine();
		
		System.out.println("Qual o valor do patinete? ");
		valor = leia.nextDouble();
		
		System.out.println("Quantos patinetes tem em estoque? ");
		estoque = leia.nextInt();

}
}
