package app;

import java.util.Scanner;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaEmpresa;
import entities.ContaEstudantil;
import entities.ContaPoupanca;

public class ProgramaApp {

	public static void main(String[] args) {
		// Variaveis
		char resposta = 's', resCada;
		int op, dia, quantidade;
		char tipo;
		double valor;
		
		//Chamar classes
		Scanner leia = new Scanner(System.in);
		ContaEstudantil cest1 = new ContaEstudantil(123,"123.456.789-00",1000);
		ContaPoupanca cpou1 = new ContaPoupanca(123,"123.456.789-00",5);
		ContaCorrente ccor1 = new ContaCorrente(123,"123.456.789-00",0);
		ContaEmpresa cemp1 = new ContaEmpresa(123,"123.456.789-00",10000.00);
		
		
		
		// La�o de execu��o da primeira tela
		while(resposta == 's') {
			System.out.println("GenCash");
			System.out.println("Cuidando do seu dinheiro por gera��es.");
			System.out.println("-----------------------------------------------");
			
			System.out.println(
					"1 - CONTA POUPAN�A\r\n"+
					"2 - CONTA CORRENTE\r\n"+
					"3 - CONTA ESPECIAL\r\n"+
					"4 - CONTA EMPRESA\r\n"+
					"5 - CONTA ESTUDANTIL\r\n"+
					"6 - SAIR");
			System.out.println("\n\nDigite a op��o selecionada: ");
			op = leia.nextInt();
			
			System.out.println("\n-----------------------------------------------");
		
			//Seleciona o tipo de conta a ser operada
			switch(op){
			
			case 1:
				// Conta Poupan�a
				System.out.println("GenCash");
				System.out.println("Cuidando do seu dinheiro por gera��es.");
				System.out.println("-----------------------------------------------");
				System.out.println("CONTA POUPAN�A");
				
				for (int x=1; x<=10; x++) {
					System.out.println("MOVIMENTO "+x);
					System.out.println("SALDO ATUAL R$ :"+cpou1.getSaldo());			
					System.out.print("Movimento D-d�bito ou C-cr�dito ? :");
					tipo = leia.next().toUpperCase().charAt(0);
					System.out.print("Digite o valor :");
					valor = leia.nextDouble();
					if (tipo=='D') {
						cpou1.debito(valor);
					} 
					else if (tipo=='C') {
						cpou1.credito(valor);
					} else {
						System.out.println("N�o foi informado um tipo correto...");
						
					}					
					System.out.println("Qual o dia atual? ");
					dia = leia.nextInt();
					cpou1.correcao(dia);
					System.out.println("Continua S/N : ");
					
					resCada = leia.next().toUpperCase().charAt(0);
					if (resCada=='N') {			
						break;
					} 
				}
				break;
			
			case 2:
				// Conta Corrente
				System.out.println("GenCash");
				System.out.println("Cuidando do seu dinheiro por gera��es.");
				System.out.println("-----------------------------------------------");
				System.out.println("CONTA CORRENTE");
			
				for (int x=1; x<=10; x++) {
					System.out.println("MOVIMENTO "+x);
					System.out.println("SALDO ATUAL R$ :"+ccor1.getSaldo());
					System.out.print("Movimento D-d�bito ou C-cr�dito ? :");
					tipo = leia.next().toUpperCase().charAt(0);
					System.out.print("Digite o valor :");
					valor = leia.nextDouble();
					if (tipo=='D') {
						ccor1.debito(valor);
					} 
					else if (tipo=='C') {
						ccor1.credito(valor);
					} else {
						System.out.println("N�o foi informado um tipo correto...");
					}
					System.out.println("OPORTUNIDADE: Deseja retirar um tal�o de cheque?"
							+ "\nLIMITE M�XIMO DE 3 TAL�ES."
							+ "\nVALOR POR TAL�O: R$ 30.00");
					resCada = leia.next().toUpperCase().charAt(0);
					if(resCada == 'S') {
						ccor1.cheque();
						System.out.println("SALDO ATUAL R$ :"+ccor1.getSaldo());	
						System.out.println("Cheques retirados: "+ ccor1.getContadorTalao());
					}
					System.out.println("Continua S/N : ");
					resCada = leia.next().toUpperCase().charAt(0);
					if (resCada=='N') {	
						leia.nextLine();
						System.out.println("OBRIGADO, VOLTE SEMPRE");
						break;
						}
					}
				break;
				
				
				
			case 3:
				// Conta especial
				System.out.println("GenCash");
				System.out.println("Cuidando do seu dinheiro por gera��es.");
				System.out.println("-----------------------------------------------");
				System.out.println("CONTA ESPECIAL");
				
				System.out.println("Infelizmente esse servi�o ainda n�o est� dispon�vel.");
				
				break;
				
			case 4:
				// Conta empresa
				
				System.out.println("GenCash");
				System.out.println("Cuidando do seu dinheiro por gera��es.");
				System.out.println("-----------------------------------------------");
				System.out.println("CONTA EMPRESA");
					
				for (int x=1; x<=10; x++) {
					System.out.println("MOVIMENTO "+x);
					System.out.println("SALDO ATUAL R$ :"+cemp1.getSaldo());
					System.out.print("Movimento D-d�bito ou C-cr�dito ? :");
					tipo = leia.next().toUpperCase().charAt(0);
					System.out.print("Digite o valor :");
					valor = leia.nextDouble();
					if (tipo=='D') {
						cemp1.debito(valor);
					} 
					else if (tipo=='C') {
						cemp1.credito(valor);
					} else {
						System.out.println("N�o foi informado um tipo correto...");
					}
					System.out.printf("\nVoc� tem um empr�stimo no valor de R$ %.2f aprovado, deseja utilizar?"
							+ "\nS - Sim"
							+ "\nN- N�o\n", cemp1.getEmprestimoEmpresa());
					resCada = leia.next().toUpperCase().charAt(0);
					if(resCada=='S') {
						System.out.println("Qual o valor do empr�stimo?");
						valor = leia.nextDouble();
						cemp1.pedirEmprestimo(valor);
					}
					System.out.println("Continua S/N : ");
					resCada = leia.next().toUpperCase().charAt(0);
					if (resCada=='N') {			

						
						break;
						
					}
				}
				
				break;
			case 5:
				// Conta estudantil
				System.out.println("GenCash");
				System.out.println("Cuidando do seu dinheiro por gera��es.");
				System.out.println("-----------------------------------------------");
				System.out.println("CONTA ESTUDANTIL");
					
				for (int x=1; x<=10; x++) {
					System.out.println("MOVIMENTO "+x);
					System.out.println("SALDO ATUAL R$ :"+cest1.getSaldo());
					System.out.print("Movimento D-d�bito ou C-cr�dito ? :");
					tipo = leia.next().toUpperCase().charAt(0);
					System.out.print("Digite o valor :");
					valor = leia.nextDouble();
					if (tipo=='D') {
						cest1.debito(valor);
					} 
					else if (tipo=='C') {
						cest1.credito(valor);
					} else {
						System.out.println("N�o foi informado um tipo correto...");
					}
					System.out.printf("\nVoc� tem liberado o valor de R$ %.2f aprovado no seu limite estudantil, deseja utilizar?"
							+ "\nS - Sim"
							+ "\nN- N�o\n", cest1.getLimiteEstudantil());
					resCada = leia.next().toUpperCase().charAt(0);
					if(resCada=='S') {
						System.out.println("Qual o valor voc� deseja utiizar?");
						valor = leia.nextDouble();
						cest1.usarEstudantil(valor);
						if(valor<=cest1.getLimiteEstudantil()) {
							System.out.println("Limite transferido com sucesso.\nSaldo atualizado: R$ "+cest1.getSaldo());

						} else { 
							System.out.println("Valor solicitado � maior que o limite dispon�vel.");
						}
					}
					System.out.println("Continua S/N : ");
					op = leia.next().toUpperCase().charAt(0);
					if (op=='N') {			
						
						break;
						
					}
				}
				
				break;
			case 6:
				// sair
				System.out.println("OBRIGADO, VOLTE SEMPRE!");
				resposta = 'n';
				break;
				
				
			}
			
			System.out.println("-----------------------------------------------");

			
		}
	}

}
