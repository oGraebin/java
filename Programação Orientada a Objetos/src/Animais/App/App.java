package Animais.App;

import Animais.Classes.Cachorro;
import Animais.Classes.Cavalo;
import Animais.Classes.Preguica;

public class App {

	public static void main(String[] args) {
		
		
		Cachorro cao = new Cachorro("Doguinho",8);
		Cavalo cavalo = new Cavalo("Blue Jeans",6);
		Preguica preg = new Preguica ("Flesha",13);
		
		cao.emitirSom();
		cavalo.emitirSom();
		preg.emitirSom();

		cavalo.correr();
		cao.correr();

		preg.subirArvore();

	}

}