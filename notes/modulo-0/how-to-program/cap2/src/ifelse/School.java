package ifelse;

import java.util.Scanner;

public class School {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Extraindo a nota do aluno através do usuário
		System.out.print("MÉDIA DO ALUNO: ");
		final var MEAN = scanner.nextDouble();
		
		// Avaliando a nota do aluno e classificando de acordo.
		if (MEAN < 33) {
			System.out.println("REPROVADO");
		}
		
		else if (MEAN < 66) {
			System.out.println("RECUPERAÇÃO");
		}
		
		else {
			System.out.println("APROVADO");
		}
		
		scanner.close();
	}
}