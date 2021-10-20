package exercicios;
import java.util.Random;
public class ExercicioMatriz {

	public static void main(String[] args) {
		Random gerador = new Random();
		
		int [][] Matriz = new int [3][3];
		int somaMatriz = 0, somaDiagonal = 0;
		
		for(int x = 0;x < 3; x++) {
			for(int y = 0; y < 3; y++) {
				System.out.println("Digite um valor para coluna " + (y+1) + " e linha"  + (x+1) + " : ");
				Matriz[x][y] = gerador.nextInt(50);
				System.out.println(Matriz[x][y]);
				somaMatriz = somaMatriz + Matriz[x][y];
				
				if(x == y) {
					somaDiagonal = somaDiagonal + Matriz[x][y];
				}
			}
		}
		
		System.out.println("A soma da matriz :" + somaMatriz);
		System.out.println("A soma da diagonal :" + somaDiagonal);
	}

	}


