package Exercicios.Classes;

import java.util.Scanner;

public class AviaoEx2 {

	
	Scanner leia = new Scanner(System.in);
	// Atributos - �, tem, est�;
	public String modelo, codId;
	public int ano, capacidade, assentosOcupados;
	
	public void Preenchimento(){
		System.out.println("Qual o modelo do Avi�o? ");
		modelo = leia.nextLine();
		
		System.out.println("Qual o c�digo de identifica��o do avi�o? ");
		codId = leia.nextLine();
		
		System.out.println("Qual o ano do avi�o? ");
		ano = leia.nextInt();
		
		leia.nextLine();
		
		System.out.println("Qual a capacidade do avi�o? ");
		capacidade = leia.nextInt();
		
		System.out.println("Quantos assentos est�o ocupados? ");
		assentosOcupados = leia.nextInt();

}
}
