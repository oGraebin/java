package Exercicios.Classes;

import java.util.Scanner;

public class AviaoEx2 {

	
	Scanner leia = new Scanner(System.in);
	// Atributos - é, tem, está;
	public String modelo, codId;
	public int ano, capacidade, assentosOcupados;
	
	public void Preenchimento(){
		System.out.println("Qual o modelo do Avião? ");
		modelo = leia.nextLine();
		
		System.out.println("Qual o código de identificação do avião? ");
		codId = leia.nextLine();
		
		System.out.println("Qual o ano do avião? ");
		ano = leia.nextInt();
		
		leia.nextLine();
		
		System.out.println("Qual a capacidade do avião? ");
		capacidade = leia.nextInt();
		
		System.out.println("Quantos assentos estão ocupados? ");
		assentosOcupados = leia.nextInt();

}
}
