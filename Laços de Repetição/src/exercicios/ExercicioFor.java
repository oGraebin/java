package exercicios;

public class ExercicioFor {
	public static void main(String[] args) {
	int soma = 0;

	for(int x = 1; x <= 500; x++){
		if(x % 2 == 1){
			if(x % 3 == 0){
				soma = soma + x;
				System.out.println(x + "\n");
			}
		}
	}

	System.out.println("\nA soma é: " + soma);
	}
}
