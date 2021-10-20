package Exercicios.Programas;

import Exercicios.Classes.PatineteEx5;


public class Ex5Programa {
	public static void main (String[] args) {

	PatineteEx5 patinete1 = new PatineteEx5();
	
	patinete1.Sistema();
	
	System.out.println("Modelo: \t" + patinete1.modelo);
	System.out.println("Codigo de identificação: \t" + patinete1.codId);
	System.out.println("Ano: \t" + patinete1.ano);
	System.out.println("Valor: \tR$ " + patinete1.valor);
	System.out.println("Estoque: \t" + patinete1.estoque);
}

}