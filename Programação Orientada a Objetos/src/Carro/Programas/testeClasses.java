package Carro.Programas;

import Carro.Classes.Classe;

public class testeClasses {

	public static void main(String[] args) {

		Classe carro1 = new Classe();
		
		carro1.cor = "Vermelho";
		carro1.modelo = "Uno";
		
		System.out.println("A cor �: "+ carro1.cor);
		System.out.println("O modelo do carro �: "+ carro1.modelo);
		
		
		System.out.println(carro1.ligado);
		
		carro1.Liga();
		
		
		System.out.println(carro1.ligado);

		System.out.println(carro1.velocidade);
		
		
		for(int i = 0; i < 10; i++ ) {
		carro1.Acelera();
		System.out.println(carro1.velocidade);
		}
		
	

		
	}

}
