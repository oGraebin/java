package Carro.Classes;

public class Classe {

		// Atributos - �, tem, est�;
		public String cor, modelo;
		public int velocidade;
		public boolean ligado;
		
		// Metodos - A��es
		public void Liga() {
			ligado = true;
		}
		
		public void Deliga() {
			ligado = false;
		}
		
		public void Buzina() {
			if(ligado) {
				System.out.println("Bi-Bi");			

			}
		}
		
		public void Acelera() {
			if(ligado) {
				System.out.println("Carro acelerando");	
				velocidade++;
			}
		}
		
		public void Desacelera() {
			if(ligado) {
				System.out.println("Carro desacelerando");		
				velocidade--;
				
			}
		}

		
		
	
}
