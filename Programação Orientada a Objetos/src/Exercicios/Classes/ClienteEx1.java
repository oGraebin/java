package Exercicios.Classes;

import java.util.Scanner;

public class ClienteEx1{
	
	Scanner leia = new Scanner(System.in);
	// Atributos - é, tem, está;
	public String nome, email, CPF, pronome;
	public char pronomeEscolha;
	public int anoNascimento;
	
	public void Preenchimento(){
		System.out.println("Qual o seu nome? ");
		nome = leia.nextLine();
		
		System.out.println("Qual o seu e-mail? ");
		email = leia.nextLine();
		
		System.out.println("Por quais pronomes você gostaria de ser chamado?\na - Ela\no - Ele\nu- Elu ");
		pronomeEscolha = leia.next().toUpperCase().charAt(0);
		
		switch(pronomeEscolha) {
		case  'A':
			pronome = "Ela";
			break;
			
		case  'O':
			pronome = "Ele";
			break;
			
		case  'U':
			pronome = "Elu";
			break;
		
		}
		leia.nextLine();
		
		System.out.println("Qual o seu CPF? ");
		CPF = leia.nextLine();
		
		System.out.println("Qual o ano do seu nascimento? ");
		anoNascimento = leia.nextInt();
	}
}
