package Exercicios.Programas;

import Exercicios.Classes.AviaoEx2;

public class Ex2Programa {
	
	public static void main(String[] args){
	
	AviaoEx2 aero1 = new AviaoEx2();
	
	aero1.Preenchimento();
	
	System.out.println("Modelo: \t" + aero1.modelo);
	System.out.println("Codigo de identificação: \t" + aero1.codId);
	System.out.println("Ano: \t" + aero1.ano);
	System.out.println("Capacidade: \t" + aero1.capacidade);
	System.out.println("Assentos ocupados: \t" + aero1.assentosOcupados);
}
}