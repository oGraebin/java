package Animais.Classes;


	
	public class Preguica extends Animal {

		public Preguica(String nome, int idade) {
			super(nome, idade);
		}
		
		public void subirArvore() {
			System.out.println("Preguiça subindo em árvore.");
		}
		
		@Override
		public void emitirSom() {
			System.out.println("aaaaaaaarh");
}
}