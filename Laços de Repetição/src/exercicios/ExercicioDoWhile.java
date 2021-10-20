package exercicios;


public class ExercicioDoWhile {
	public static void main(String[] args) {

		int x = 233;

		do{		
			System.out.println(x);

			if(x<=300 || x>= 400){
				x = x + 5;
			} else {
				x = x + 3;
			}
			

		} while(x<=456);
	}
	
}
